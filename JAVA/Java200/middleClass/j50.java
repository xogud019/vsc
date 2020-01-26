public class j50{
    public static String shifts(int a){
        String s = "";

        for(int i=0;i<=15;i++){
            int aa =a%2;
            s= (aa>=0)?aa+s:(-aa)+s;
            a>>=1;
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