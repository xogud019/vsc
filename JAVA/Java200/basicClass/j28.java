public class j28{
    public static final int age= 26;

    public static void main(String[] args){
        int index = age;
        int days = 365;
        double phyAge = 100*Math.sin((days%index)*2*Math.PI/index);
        System.out.println(phyAge);
    }
}