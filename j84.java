public class j84{
    public static void main(String[] args){
        j83 b1= new j83(1,"Despasito",1,"https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi");
        j83 b2= new j83(2,"That`s what i like",2,"https://www.billboard.com/images/pref_images/q59725qvpol.jpg","bruno mars");
        j83 b3= new j83(3,"I`m The One",3,"https://www.billboard.com/images/pref_images/q64532pl64x.jpg","dj khaled");

     /*   showAbout(b1);
        showAbout(b2);
        showAbout(b1,b2);
        showAbout(b1,b2,b3);*/

        j83[] b= new j83[3];
        b[0] = b1;
        b[1] = b2;
        b[2] = b3;

        showAbout(b);
    }

    public static void showAbout(j83 bb){
        System.out.println("1---------------");
        String sf = String.format("%d,%s,%d,%s,%s",bb.getRank(),bb.getSong(),bb.getLastWeek(),bb.getImageSrc(),bb.getArtist());
        System.out.println(sf);
    }

    public static void showAbout(j83 ... b){
       System.out.println("2=================>");
        for(j83 bill:b){
            showAbout(bill);
        }
        System.out.println("<===============2");
    
    }
}