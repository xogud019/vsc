public class j95main1{
    public static void main(String[] args){
        j93 rfw = new j93();
        String a = "https://www.billboard.com/charts/hot-100/";
        String rs = rfw.getTimeDate(a);
        System.out.println(rs);
        rfw.getAllHtml(a+rs);

        String str ="<article class =\"chart-row";
        rfw.getBillboardData(str);

        j95.printToJSON(rfw.getBillboard(),"billboard\\"2020-01-27".json");

    }
}