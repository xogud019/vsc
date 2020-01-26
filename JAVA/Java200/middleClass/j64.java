public class j64{
    public static void main(String[] args){
        Object ob1 = new Object();
        Object ob2 = new Object();

        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());
        System.out.println(ob1==ob2);
        System.out.println(ob1.equals(ob2));
        System.out.println(ob1);
        System.out.println(ob2.toString());

        System.out.println(ob1.getClass().getName());
        String str = ob1.getClass().getName()+"@";
        System.out.println(str);

        Object ob3 = new String("good");
        System.out.println(ob3.toString());
        System.out.println(ob3 instanceof Object);
        System.out.println(ob3 instanceof String);

        String hello= "hello";
        System.out.println(hello.getClass());
        
    }
}