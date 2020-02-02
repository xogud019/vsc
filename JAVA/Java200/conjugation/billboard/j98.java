import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javafx.scene.image.Image;

public class j98/*ImageFXListRequest*/{
    private Map<String, java.awt.Image> images;
    public j98/*ImageFXListRequest*/(){
        images = Collections.synchronizedMap(new LinkedHashMap<String,Image>(10,1.53f,true));
    }

    public synchronized Image loadImage(String imagesrc){
        Image mimage = null;
        if(images.containsKey(imagesrc)){
            mimage = images.get(imagesrc);
        }
        else{
            if(imagesrc!=null&&!imagesrc.contains("q____")){
                try{
                    mimage = new Image(imagesrc,100,100,true,true);
                }
                catch(Exception e){
                    mimage =null;
                }
            }
        }
        return mimage==null? new Image(getClass().getResourceAsStream("billboard.jpg")):mimage;
    }

    public synchronized void getAllImagas(ArrayList<Billboard> bills){
        images.clear();
        List<Billboard> newbills = Collections.synchronizedList(bills);
        for(Billboard bb:newbills){
            new Thread(() ->{
                if(!images.containsKey(bb.getImagesrc())){
                    images.put(bb.getImagesrc(),loadImage(bb.getImagesrc()));
                    System.out.println(bb.getImagesrc()+"\t\t\t---Map에 image저장---->>>>>>>");
                }
            }).start();
        }
    }

    public synchronized void printImage(){
        System.out.println(images.size());
        Iterator<String> imagekeys=  images.keySet().iterator();
        while(imagekeys.hasNext()){
            String key = imagekeys.next();
            System.out.println("key->"+key);
        }
    }

    public static void main(String[] args){
       // ImageFXListRequest req = new ImageFXListRequest();
        j98 req = new j98();
        RequestFromBillboardHot rfw = new RequestFromBillboardHot();
        String a = "https://www.billboard.com/charts/hot-100/";
        String rs = rfw.getTimeDate(a);
        System.out.println(rs+"----------------Billboard Chart");
        rfw.getAllHtml(a);
        String str = "<article class=\"chart-row";
        rfw.getBillboardData(str);
        ArrayList<Billboard> bills = rfw.getBillboard();
        req.getAllImagas(bills);
        req.printImage();
        
    }
}