//XML
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class j96{
    public static void printToXML(List<j83> blist,String fname){
        try(PrintWriter pw = new PrintWriter(new FileWriter(fname,false),true)){
            pw.println("<?XML version ='1.0' encoding = 'utf-8'?>");
            pw.println("<billboards>");
            for(j83 bb:blist){
                pw.println(pairxs(bb));
            }
            pw.println("</billboards>");
        }
        catch(IOException e){
        
        }
    }

    private static String rp(String msg){
        String st= msg;
        st = st.replace("&", "&amp;");
        st = st.replace(">", "&gt;");
        st = st.replace("<", "&lt;");
        st = st.replace("\'", "&apos;");
        st = st.replace("\"", "&quot;");
        return st;
    }

    private static String pairx(String key,String value){
        String ss =String.format("<%s>%s</%s>", key,value,key);
        return ss;
    }

    private static String pairxs(j83 bb){
        String rank = pairx("rank",rp(bb.getRank()+""));
        String song = pairx("song",rp(bb.getSong()+""));
        String lastWeek = pairx("lastWeek",rp(bb.getLastweek()+""));
        String imagesrc = pairx("imagesrc",rp(bb.getImagesrc()+""));
        String artist = pairx("artist",rp(bb.getArtist()+""));
        return String.format("<billboard>\n%s %s %s %s %s\n</billboard>", rank,song,lastWeek,imagesrc,artist);
    }
    
}