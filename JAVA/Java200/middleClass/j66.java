public class j66{
    public static void main(String[] args){
        String s1 = "Asia";
        String s2 = "Europe";
        String s3 = new String("Asia");
        String s4 = "Asia";

        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

        String s5 = String.format("%s-%s",s1,s2);
        System.out.println(s5);

        String s6 = s1+"-"+s2+1+2;
        System.out.println(s6);

        String s7 = 1+2+s1+"-"+s2;
        System.out.println(s7);
        
    }
}