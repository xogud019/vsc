import java.util.*;
public class tuple {
    public static void main(String[] args){
        String s ="{{2},{2,1},{2,1,3},{2,1,3,4}}";
        int[] answer =solution(s);
        for(int i=0; i<answer.length; i++){
            System.out.print(answer[i]+" ");
        }
        System.out.println();
        /*
        String sss= "{123}";
        System.out.println(sss.replace("{", ""));
        */
    }

    public static int[] solution(String s){
        int[] answer={};
        String ss =s.substring(1, s.length()-1);
        int first=0;
        String[] tempArray =ss.split(",");
        for(int i=0; i<tempArray.length; i++){
            //System.out.println(tempArray[i]);
            /*
            if(tempArray[i].contains("{")&&tempArray[i].contains("}")){

            }
            */
        }
        
        return answer;
    }
}