import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class j94/*billboardPrinter*/{
    public static void printToCSV(List<j83> blist,String fname){
        try(PrintWriter pw = new PrintWriter(new FileWriter(fname,false),true)){
            for(j83 bb:blist){
                pw.println(bb);
            }
        }
        catch(IOException e){
            
        }
    }
}
