import java.util.ArrayList;

public class j85{
    public static void main(String[] args){
        ArrayList<j83> bill = new ArrayList<>();
        bill.add(new j83(1,"Despasito",1,"https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi"));
        bill.add(new j83(2,"That`s what i like",2,"https://www.billboard.com/images/pref_images/q59725qvpol.jpg","bruno mars"));
        bill.add(new j83(3,"I`m The One",3,"https://www.billboard.com/images/pref_images/q64532pl64x.jpg","dj khaled"));

        System.out.println(bill.size());
        showAbout(bill.get(0));

        bill.remove(1);
        System.out.println(bill.size());
        System.out.println("---------------------------------");
        for(j83 bb:bill){
            showAbout(bb);
        }

    }

    public static void showAbout(j83 bb){
        System.out.println("1---------------");
        String sf = String.format("%d,%s,%d,%s,%s",bb.getRank(),bb.getSong(),bb.getLastweek(),bb.getImagesrc(),bb.getArtist());
        System.out.println(sf);
    }

}