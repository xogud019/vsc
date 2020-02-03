//j113
import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("input your money");
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        int i= 0;
        Bakara bakara = new Bakara();

        while(true){
            bakara.start();
            i++;
            System.out.println(i+"round");
            System.out.println("your money is"+sum);
            System.out.println("choose your bet money");

            int n = in.nextInt();
            if(n>sum){
                System.out.println("you don`t have enough money");
                i--;
            }else{
                sum = sum-n;
                System.out.println("you bet"+n);
                System.out.println("your remain money is" +sum);
                System.out.println("where you want to bet");
                System.out.println("1:Player");
                System.out.println("2:Dealer");
                System.out.println("3:DRAW");

                int nn = in.nextInt();
                switch(nn){
                    case 1: System.out.println("you bet Player");
                    break;
                    case 2: System.out.println("you bet Dealer");
                    break;
                    case 3: System.out.println("you bet DRAW");
                    break;
                }
                System.out.println();
                System.out.println("---------------------------");
                System.out.println("<-------Game Start!------->");
                System.out.println("---------------------------");

                bakara.result();

                System.out.println("---------------------------");
                System.out.println("<------Game result!------->");
                System.out.println("---------------------------");
                
                if(nn==bakara.getWhoWin()){
                    System.out.println("you WIN");
                    sum = sum+(n*2);
                }
                else if(nn==bakara.getWhoWin()){
                    System.out.println("you WIN");
                    sum = sum+(n*2);
                }
                else if(nn==bakara.getWhoWin()){
                    System.out.println("you WIN");
                    sum = sum+(n*8);
                }
                else{
                    System.out.println("you LOSE");
                }

                System.out.println("your remain money is"+sum);
                System.out.println();
                System.out.println("---------------------------");

                if(sum<0){
                    System.out.println("you don`t have money");
                    System.out.println("get out");
                    break;
                }
            }
        }
    }
}