public class StrSolution {
    public static int solution(String s){
        int result= s.length();
        int half = s.length()/2;
        int len = s.length();
        

        for(int i=1; i<=half; i++){
            String resultS = "";
            String buf="";
            int bufCount =1;
            for(int j=0; j<=len/i; j++){
                if(i*j==len){
                    if(bufCount==1){
                        resultS = resultS+buf;
                        break;
                    }
                    else{
                        resultS = resultS+Integer.toString(bufCount)+buf;
                    }

                }
                else if(i*j+i>len){
                    resultS = resultS + buf+s.substring(i*j, len);
                }
                else if(buf.equals(s.substring(i*j, i*j+i))){
                    bufCount++;
                }
                else{
                    if(bufCount==1&&buf.equals(s.substring(i*j, i*j+i))==false){
                        resultS= resultS+buf;
                        buf = "";
                        buf = buf+s.substring(i*j,i*j+i);
                    }
                    else{
                        resultS = resultS+Integer.toString(bufCount)+buf;
                        bufCount=1;
                        buf="";
                        buf=buf+s.substring(i*j, i*j+i);
                    }
                }
            }
            if(resultS.length()<result){
                result=resultS.length();
            }
            
        }
        
        return result;
    }

    public static void main(String[] args){
        String s = "ababcdcdababcdcd";
        int result = solution(s);
        System.out.println(result);
    }
    /*
    (0,1)(1,2)(2,3)(3,4)(4,5)(5,6)(6,7)(7,8)
    (0,2)(2,4)(4,6)(6,8)
    (0,3)(3,6)(6,9)
    */
}