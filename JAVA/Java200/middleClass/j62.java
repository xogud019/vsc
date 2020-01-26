public class j62{
    public static void main(String[] args){
        String nNum = "123";
        String cNum = "KIM";

        try{
            int a = Integer.parseInt(cNum);
            System.out.println(a);
        }
        catch(NumberFormatException e){
            System.out.println("idiot");
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("another idiot");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("end");
        }
    }
}