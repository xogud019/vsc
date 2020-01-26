public class j40{

    public static double toMoney(String s){
        double tot = 0.0;
        switch(s){
            case "USD" : tot = 1301.3;
            break;
            case "JYP" : tot = 110.4;
            break;
            case "CNY" : tot = 10.1;
            break;
            default : tot = 1.0;
            break; 
        }

        return tot;
    }
    public static void main(String[] args){
        String money = "USD";
        double result = toMoney(money);
        System.out.println(result);
    }
}