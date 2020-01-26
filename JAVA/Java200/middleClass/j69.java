public class j69{
    public static void main(String[] args){
        StringBuffer sb1 = new StringBuffer();
        sb1.append("hi ").append("see you again ").append("i love you");
        System.out.println(sb1.toString()+sb1.hashCode());

        sb1.replace(0, 2, "no no no ");
        System.out.println(sb1.toString()+sb1.hashCode());

        sb1.reverse();
        System.out.println(sb1.toString()+sb1.hashCode());

        sb1.delete(10,15);
        System.out.println(sb1.toString()+sb1.hashCode());

        replaces(sb1);
        System.out.println(sb1.toString()+sb1.hashCode());
    }

    public static void replaces(StringBuffer sb){
        sb.reverse();
        sb.replace(0, 3, "go go go ");
    }
}