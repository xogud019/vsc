public class j63{

    public static void main(String[] args){
        try{
            int x =5;
            int y =20;

            int z = y/(x-5);
            System.out.println(z);
        }
        catch(ArithmeticException e){
            System.out.println("divder is 0");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("end");
        }

    }
}