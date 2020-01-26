public class CatchOrder{
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
            System.out.println("not enouht args");
        }
        catch(Exception e){
            System.out.println("run error");
        }
        finally{
            System.out.println("run again");
        }
    }
}