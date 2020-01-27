import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class j93{   //RequesBillboardHow
    ArrayList<String> htmls = new ArrayList<>();
    ArrayList<j83> billboards = new ArrayList<j83>();
    boolean isConnection = false;

    public j93(){
        htmls.clear();
        billboards.clear();
    }

    public ArrayList<j83> getBillboard(){
        return billboards;
    }

    public void getAllHtml(String newUrls){
        htmls.clear();
        URL url = null;
        try{
            url= new URL(newUrls);

            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(),"euc-kr"),8);
            String line ="";
            while((line = reader.readLine())!=null){
                if(!line.trim().equals("")){
                    htmls.add(line.trim());
                }
            }
            isConnection = true;
        }

        catch(Exception e){
            isConnection = false;
            System.out.println(e.getMessage());
        }
    }

    public String getTimeDate(String newUrls){
        String s ="";
        URL url = null;
        try{
            url = new URL(newUrls);

            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(),"euc-kr"),8);
                String line = "";
                while((line = reader.readLine())!=null){
                    if(!line.trim().equals("")){
                        if(line.trim().contains("<time datetime=")){
                            s=line.trim();
                            s=s.substring(0,s.indexOf(">")-1);
                            s=s.substring(s.indexOf("\"")+1).trim();
                            break;
                    }
                }
            }
            isConnection = true;
        }
        catch(Exception e){
            isConnection = false;
            System.out.println(e.getMessage());
        }

        return s;
    }

    public synchronized void getBillboardData(String msg){
        billboards.clear();
        for(int i=0;i<htmls.size();i++){
            String ss= htmls.get(i);
            if(ss.contains(msg)){
                String rank = ss.substring(ss.indexOf("chart-row--")+"chart-row--".length());
                rank = rank.substring(0,rank.indexOf("js")-1).trim();
                String song =ss.substring(ss.indexOf("Song Hover-")+"Song Hover-".length());
                song =song.substring(0,song.indexOf("\"")).trim();

                int j=1;
                String imageurl = htmls.get(i+j);
                while(true){
                    if(imageurl.contains("images/pref_images")){
                        break;
                    }
                    else{
                        j++;
                        imageurl = htmls.get(i+j);
                    }
                }

                imageurl = imageurl.substring(imageurl.indexOf("https://"));
                imageurl = imageurl.substring(0,imageurl.indexOf(".jpg")+".jpg".length());

                int k =1;
                String artisturl = htmls.get(i+j+k);
                while(true){
                    if(artisturl.contains("chart-row __artist")){
                        break;
                    }
                    else{
                        k++;
                        artisturl = htmls.get(i+j+k);
                    }
                }
                artisturl = artisturl.substring(imageurl.indexOf("https://"));
                artisturl = artisturl.substring(0,imageurl.indexOf("\""));
                String artist = artisturl.substring(artisturl.lastIndexOf("/")+1);
                artist = toArtis(artist);

                int m = 1;
                String lastWeek = htmls.get(i+j+m+k);
                while(true){
                    if(lastWeek.contains("chart-row __last-week")){
                        break;
                    }
                    else{
                        m++;
                        lastWeek = htmls.get(i+j+k+m);
                    }
                }
                lastWeek = lastWeek.substring(imageurl.indexOf(">")+1);
                lastWeek = lastWeek.substring(0,imageurl.indexOf("<")).trim();

                j83 board = new j83(toInt(rank),replace(song),toInt(__toStr(lastWeek)),imageurl,artisturl,artist);
                billboards.add(board);
               
            }
        }
    }

    public void printHtml(){
        for(String ss:htmls){
            System.out.println(ss);
        }
    }

    public void printBillboard(){
        for(j83 bo:billboards){
            System.out.println(bo);
        }
    }

    public String replace(String msg){
        String ss = msg;
        ss = ss.replaceAll("&#039", "");
        ss = ss.replaceAll("&amp", "&");
        ss = ss.replaceAll("&quot", "\"");
        return ss.trim();
    }

    private String __toStr(String lastWeek){
        return lastWeek.contains("--")?101+"":lastWeek;
    }

    private int toInt(String msg){
        return Integer.parseInt(msg==null?"-1":msg.trim());
    }

    public String toArtis(String msg){
        return msg.replace("-", " ");
    }

    public static void main(String[] args){
        j93 j = new j93();
        String a = "https://www.billboard.com/charts/hot-100/";
        String rs = j.getTimeDate(a);
        System.out.println(rs);
        
        j.getAllHtml(a+rs);
        String str = "<article class=\"chart-row";
        j.getBillboardData(str);
        j.printBillboard();
    }
}