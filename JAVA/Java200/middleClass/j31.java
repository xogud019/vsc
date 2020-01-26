public class j31{
    public static void main(String[] args){
        j31F a= j31F.apple;
        j31F b = j31F.banana;
        j31F c = j31F.mango;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a.name());
        System.out.println(a.ordinal());
        System.out.println(b.ordinal());

        j31F[] f = j31F.values();
        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[2]);
    }
}