import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class j92{
    ArrayList<String> htmls = new ArrayList<>();
    boolean isConnection = false;

    public j92(){
        htmls.clear();
    }

    public void getAllHtml(String newUrls){
        htmls.clear();
        URL url = null;
        try{
            url = new URL(newUrls);

            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(),"euc-kr"),8);
            String line = "";
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

    public void printHtml(){
        for(String ss:htmls){
            System.out.println(ss);
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

    public static void main(String[] args){
        j92 j = new j92();
        String a = "https://www.billboard.com/charts/hot-100/";
        String rs = j.getTimeDate(a);
        System.out.println(rs);

        j.getAllHtml(a+rs);
        j.printHtml();
    }

}