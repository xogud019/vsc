public class j30{
    public static final int age =26;

    public double getBioRhythm(long days, int index, int max){
        return max*Math.sin((days%index)*2*Math.PI/index);
    }

    public static void main(String[] args){
        int index = age;
        int max = 100;
        int days =365;
        j30 a = new j30();

        double phyAge = a.getBioRhythm(days, index, max); 

        System.out.println(phyAge);
    }
}