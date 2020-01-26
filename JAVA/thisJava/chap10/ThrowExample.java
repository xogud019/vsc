public class ThrowExample{
    public static void main(String[] args){
        try{
            findClass();
        }
        catch(ClassNotFoundException e){
            System.out.println("no");
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String2");
    }
}