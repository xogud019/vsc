public class j94main{
    public static void main(String[] args){
        j93 rfw = new j93();
        String a = "https://www.billboard.com/charts/hot-100/";
        String rs = rfw.getTimeDate(a);
        System.out.println(rs);
        rfw.getAllHtml(a+rs);

        String str ="<article class =\"chart-row";
        rfw.getBillboardData(str);

        j94.printToCSV(rfw.getBillboard(), "billboard\\"+rs+".csv");

    }
}