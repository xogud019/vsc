public class j29{
    public static final int age = 26;

    public static double getBioRhythm(long days, int index, int max){
        return max*Math.sin((days%index)*2*Math.PI/index);
    }

    public static void main(String[] args){
        int days =365;
        int index = age;
        double phyAge = getBioRhythm(days, index, 100);
        System.out.println(phyAge);
    }
}