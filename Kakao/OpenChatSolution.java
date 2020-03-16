//kakao 19`1
package Kakao;
import java.util.*;

public class OpenChatSolution{
    public static void solution(String[] record){
        int n= record.length;
        if(n<1||n>100000){
            System.out.println("input size error");
            return;
        }
        int m =n;
        int count=0;
        String[] newRecord;
        HashMap<String, String> change = new HashMap<String, String>();

        for(int i=0; i<n; i++){
            if(record[i].contains("Change")){
                m--;
            }
        }

        newRecord = new String[m];

        for(int i=0; i<n; i++){
            String[] event = record[i].split(" ");
            if(event[1].length()>10||((event[0].equals("Enter")||event[0].equals("Change"))&&event[2].length()>10)){
                System.out.println("uid or nickName size error");
                return;
            }

            if(event[0].equals("Enter")||event[0].equals("Leave")){
                newRecord[count]= "";
                for(int j=0; j<event.length; j++){
                    newRecord[count] += event[j];
                    if(j!=event.length-1){
                        newRecord[count] +=" ";
                    }
                }
                
                count++;
            }
            if(event[0].equals("Enter")||event[0].equals("Change")){
                change.put(event[1],event[2]);
            }
        }

        System.out.print("[");
        for(int i=0; i<newRecord.length; i++){
            String[] result = newRecord[i].split(" ");
            if(result[0].equals("Enter")){
                System.out.print("\""+change.get(result[1])+" is in.\"");
            }
            else if(result[0].equals("Leave")){
                System.out.print("\""+change.get(result[1])+" is out.\"");
            }

            if(i!=newRecord.length-1){
                System.out.print(",\n");
            }
            else{
                System.out.print("]");
            }
        }
    }

    public static void main(String[] args){
        String[] record={
         "Enter uid1234 Muzi",
         "Enter uid4567 Prodo",
         "Leave uid1234",
         "Enter uid1234 Prodo",
         "Change uid4567 Ryan",
         "Change uid1234 Max",
         "Leave uid4567"};
        
        solution(record);
    }
}