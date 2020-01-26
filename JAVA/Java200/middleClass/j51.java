public class j51{
    public static int BITMASK =1;

    public static String shifts(int n){
        String s ="";
        for(int i=0;i<=15;i++){
            s=(n & BITMASK)+s;
            n>>=1;
        }

        return s;
    }

    public static void main(String[] args){
        int intNum1 = 111;
        int intNum2 = -111;

        System.out.printf("%d : %s\n",intNum1,shifts(intNum1));
        System.out.printf("%d : %s\n",intNum2,shifts(intNum2));
    }
}