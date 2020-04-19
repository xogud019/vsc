import java.util.*;
class account{
    static int accountCount=0;
    private String name = "";
    private int money=0;

    public account(String name){
        this.name = name;
        accountCount++;
    }

    public void deposit(int money){
        this.money +=money;
    }

    public int showMoney(){
        return money;
    }

    public String showName(){
        return name;
    }

    public account saveKing(account a1, account a2){
        if(a1.money>a2.money){
            return a1;
        }
        else{
            return a2;
        }
    }
}
public class AccountTest {
    public static void main(String[] args){
        ArrayList<account> acount = new ArrayList<>();

        for(int i=0; i<10; i++){
            acount.add(new account("Somg"+(i+1)));
            acount.get(i).deposit(10000);

            System.out.println("-----------------------");
            System.out.println(acount.get(i).showName()+":"+acount.get(i).showMoney());
        }

    }
}