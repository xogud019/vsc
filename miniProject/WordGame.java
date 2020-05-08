import java.util.*;

public class WordGame {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] word ={"count","love","water","chance","univercity","ade","you","i"};
        String QWord = word[(int)(Math.random()*7)];
        String[] answer= new String[QWord.length()];
        char n;
        int count =0;

        for(int i=0; i<answer.length; i++){
            answer[i]= "_";
        }
        
        //Game start
        while(count<20){
            System.out.print("now : ");
            print(answer);
            System.out.print("guess character : ");
            n= scan.next().charAt(0);
            if(check(QWord,n)==true){
                answer[QWord.indexOf(n)] = Character.toString(n);
                count++;
            }
            else{
                count++;
            }

            if(end(answer)==true){
                System.out.print("now : ");
                print(answer);
                scan.close();
                break;
            }
        }
    }
    //print array
    public static void print(String[] answer){
        for(int i=0; i<answer.length; i++){
            System.out.print(answer[i]+" ");
        }
        System.out.println();
    }
    //Check if there is text 
    public static boolean check(String QWord, char n){
        boolean isT = false;
        if(QWord.indexOf(n)==-1){
            return isT;
        }
        else{
            return isT=true;
        }
    }
    //Check if the word is complete
    public static boolean end(String[] answer){
        boolean isE = false;
        int count=0;
        for(int i=0; i<answer.length; i++){
            if(answer[i]=="_"){
                count++;
            }
        }

        if(count==0){
            return isE= true;
        }
        else{
            return isE;
        }
    }
}