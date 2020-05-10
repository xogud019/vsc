import java.util.*;
public class tuple {
    public static void main(String[] args){
        String s ="{{1,2,3},{2,1},{1,2,4,3},{2}}";
        //String s ="{{2},{2,1},{2,1,3},{2,1,3,4}}";
        int[] answer =solution(s);
        for(int i=0; i<answer.length; i++){
            System.out.print(answer[i]+" ");
        }
    }

    public static int[] solution(String s){
        int[] answer={};
        ArrayList<String> list =new ArrayList<>();
        ArrayList<String> list1 =new ArrayList<>();
        String ss =s.substring(1, s.length()-1);
        String sss= "";
        String[] tempArray =ss.split("}");
        
        for(int i=0; i<tempArray.length; i++){
            tempArray[i]= tempArray[i].replace("{", "");
        }

        sort(tempArray);
        
        for(int i=0; i<tempArray.length; i++){
            if(tempArray[i].charAt(0)!=','){
                tempArray[i]=","+tempArray[i];
                sss+=tempArray[i];
            }
            else{
                sss+=tempArray[i];
            }
            
        }
        String[] tuple = sss.split(",");
        
        for(int i=0; i<tuple.length; i++){
            if(tuple[i].equals("")){
                continue;
            }
            else{
                list.add(tuple[i]);
            }
        }

        for(int i=0; i<list.size(); i++){
            if(!list1.contains(list.get(i))){
                list1.add(list.get(i));
            }
        }
        
        answer = new int[list1.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=Integer.parseInt(list1.get(i));
        }
        
        return answer;
    }

    public static void sort(String[] tempArray){
        String temp="";
        for(int i=0; i<tempArray.length-1; i++){
            for(int j=1; j<tempArray.length; j++){
                if(tempArray[j-1].length()>tempArray[j].length()){
                    temp = tempArray[j-1];
                    tempArray[j-1] = tempArray[j];
                    tempArray[j]=temp;
                }
            }
        }
    }
}