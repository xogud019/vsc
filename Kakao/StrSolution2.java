
public class StrSolution2 {
    public static int solution(String s){
        int result = 1001;
        String resultS ="";
        String bufS = "";
        int bufCount = 1;
        if(s.length()==1){
            result=1;
        }
        for(int i=1; i<=s.length()/2; i++){
            for(int j=1; j<=s.length()/i; j++){
                //System.out.print((j-1)*i+","+i*j+" ");
                if(bufS.equals(s.substring((j-1)*i, i*j))){
                    bufCount++;
                }
                else{
                    if(bufCount!=1){
                        resultS +=Integer.toString(bufCount);
                        bufCount=1;
                    }
                    resultS+=s.substring((j-1)*i, i*j);
                }
                bufS=s.substring((j-1)*i, i*j);
            }
            if(bufCount!=1){
                resultS +=Integer.toString(bufCount);
                bufCount=1;
            }
            if(s.length()%i!=0){
                resultS+=s.substring(s.length()-s.length()%i, s.length());
            }
            
            if(result>resultS.length()){
                result = resultS.length();
            }
            resultS="";
            
        }
        return result;
    }

    public static void main(String[] args){
        String s = "a";
        int result = solution(s);
        System.out.print(result);
    }
}