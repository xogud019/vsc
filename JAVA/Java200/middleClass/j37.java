public class j37{
    public static final int a = 23;
    public static final int b = 25;
    public static final int c = 28;

    public static String textInfo(int index, double value){
        String result = "";
        switch(index){
            case 23 : result = "body:";
            break;
            case 25 : result = "mind:";
            break;
            case 28 : result  = "emotion";
            break;
            }
            return result +(value*100);
    }

    public static void main(String[] args){
        int age = a;
        double max = 0.88;
        String s = textInfo(age, max);

        System.out.println(s);
    }
}