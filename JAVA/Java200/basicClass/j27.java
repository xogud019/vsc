public class j27{

    static final int a = 26;
    public static void main(String[] args){
        int b= a;
        int days= 365;

        double value= (days%b)*2 *Math.PI/b;

        System.out.println(value);
    }
}