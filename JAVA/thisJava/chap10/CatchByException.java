public class CatchByException{
    public static void main(String[] args){
        try{
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1+ value2;
            System.out.println(result);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("not enough");
            System.out.println("how to run");
            System.out.println("input num1 num2");
        }
        catch(NumberFormatException e){
            System.out.println("can`t castion");
        }
        finally{
            System.out.println("run again");
        }
    }
}