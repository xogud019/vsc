public class TryCatchFinallyRunTimeExample{
    public static void main(String[] args){
        String data1 = null;
        String data2 = null;
        try{
            data1 = args[0];
            data2 = args[1];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("not enough args");
            System.out.println("how tu run");
            System.out.println("num1 num2");
            return;
        }

        try{
            int value1= Integer.parseInt(data1);
            int value2= Integer.parseInt(data2);
            int result = value1+value2;
            System.out.println(result);
        }
        catch(NumberFormatException e){
            System.out.println("cant casting");
        }
        finally{
            System.out.println("run again");
        }
    }
}