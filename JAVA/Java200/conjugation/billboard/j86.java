import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class j86{
    public static void main(String[] args) {
        j83 b1= new j83(1,"Despasito",1,"https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi");
        j83 b2= new j83(2,"That`s what i like",2,"https://www.billboard.com/images/pref_images/q59725qvpol.jpg","bruno mars");
        j83 b3= new j83(3,"I`m The One",3,"https://www.billboard.com/images/pref_images/q64532pl64x.jpg","dj khaled");
        ArrayList<j83> bill = new ArrayList<>();
        bill.add(b1);
        bill.add(b2);
        bill.add(b3);

        File fp = new File("billboard");
        if(!fp.exists()){
            fp.mkdirs();
        }
        try(PrintWriter pw = new PrintWriter(new FileWriter("billboard\\bill.txt",false),true)){
            for(j83 bb:bill){
                pw.println(bb);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}