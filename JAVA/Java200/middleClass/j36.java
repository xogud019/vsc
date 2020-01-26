public class j36{
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
        int a = 25;
        double value =0.88;
        String s = textInfo(a, value);
        System.out.println(s);
    }
}