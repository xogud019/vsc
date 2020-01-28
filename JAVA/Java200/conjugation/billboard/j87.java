import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class j87{
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new FileReader("billboard\\bill.txt"))){
            String msg= "";
            while((msg=br.readLine())!=null){
                System.out.println(msg);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
        
    }
}