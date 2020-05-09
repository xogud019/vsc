import java.util.*;
public class shopping {
    public static void main(String[] args){
        String[] gems ={"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
        int[] result = new int[2];

        result =solution(gems);
        System.out.println(result[0]+","+result[1]);
    }

    

    public static int[] solution(String[] gems){
        int[] answer =new int[2];
        int start=0, end=1;
        answer = shop(gems,start,end,answer);
        return answer;
    }

    public static int[] shop(String[] gems, int start, int end,int[] answer){
        for(int i=end; i<gems.length; i++ ){
            String[][] temp = new String[end+1][2];
            for(int j=start; j<i-1; j++){
                temp[j][0]=gems[j];
                temp[j][1]=Integer.toString(j+1);
            }
            if(check(temp)==true){
                answer[0]=Integer.parseInt(temp[0][1]);
                answer[1]=Integer.parseInt(temp[temp.length-1][1]);
                start++;
                end++;
                return shop(gems, start, end, answer);
            }
        }
        
        
            
        return answer;
        

    }

    public static boolean check(String[][] temp){
        boolean isT = false;
        int dCount=0;
        int rCount=0;
        int eCount=0;
        int sCount=0;
        for(int i=0; i<temp.length; i++){
            if(temp[i][0].equals("DIA")){
                dCount=1;
            }
            else if(temp[i][0].equals("RUBY")){
                rCount=1;
            }
            else if(temp[i][0].equals("EMERALD")){
                eCount=1;
            }
            else if(temp[i][0].equals("SAPPHIRE")){
                sCount=1;
            }
            else if(temp[i][0]==null){
                break;
            }
        }

        if(dCount==1&&eCount==1&&rCount==1&&sCount==1){
            return isT =true;
        }
        else{
            return isT;
        }
    }
}