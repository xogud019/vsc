public class MultiCatch{
    public static void main(String[] args){
        try{
            String data1 = args[0];
            String data2 = args[1];
            int value1= Integer.parseInt(data1);
            int value2= Integer.parseInt(data2);
            int result = value1+value2;
            System.out.println(result);
        }
        catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println("not enough args or can`t castion");
        }
        catch(Exception e){
            System.out.println("Unknown Error");
        }
        finally{
            System.out.println("run again");
        }
    }
}