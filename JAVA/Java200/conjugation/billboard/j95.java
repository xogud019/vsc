import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
public class j95/*billboardPrintJSON*/{
    public static void printToJSON(List<j83> blist,String fname){
        try(PrintWriter pw = new PrintWriter(new FileWriter(fname,false),true)){
            pw.println("{\"billboard\":[");
            for(int i=0;i<blist.size();i++){
                j83 bb = blist.get(i);
                pw.println(pair(bb)+",");
            }
            pw.println(pair(blist.get(blist.size()-1)));
            pw.println("]}");
        }
        catch(IOException e){
            
        }
    }

    private static String pair(j83 bb){
        String rank = pair("rank",bb.getRank()+"");
        String song = pair("song",bb.getSong()+"");
        String lastWeek = pair("lastWeek",bb.getLastweek()+"");
        String imagesrc = pair("imagesrc",bb.getImagesrc()+"");
        String artist = pair("artist",bb.getArtist()+"");
        return String.format("{%s,%s,%s,%s,%s}", rank,song,lastWeek,imagesrc,artist);    
    }

    private static String pair(String key,String value){
        String ss= String.format("\"%s\":\"%s\"", key,value);
        return ss;
    }

    private static String pairs(String key, String value){
        String ss= String.format("{\"%s\":\"%s\"}", key,value);
        return ss;
    }
}