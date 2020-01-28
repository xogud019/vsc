public class j83main{
    public static void main(String[] args){
        j83 b1 = new j83(1,"Despasito",1,"https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi");
        showAbout(b1);
        System.out.println();
        
        j83 b =b1;
        showAbout(b);
    }

    public static void showAbout(j83 bb){
        String sf = String.format("%d,%s,%d,%s,%s",bb.getRank(),bb.getSong(),bb.getLastweek(),bb.getImagesrc(),bb.getArtist());
        System.out.printf(sf);
    }
}