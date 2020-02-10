//j124
public class MoneyDeposit{
    public static double saveUs(int money,int month, double ratio){
        double tot = 0.0;
        double a = money;
        double r= ratio/100/12;

        for(int i=0; i<month; i++){
            a= a*(1+r);
            tot +=a;
        }
        return tot;

    }
    public static void main(String[] args){
        double result = saveUs(800000,36,1.5);
        System.out.println(result);
        System.out.printf("%.0f\n",result);
    }
}