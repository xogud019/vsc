import java.util.ArrayList;
import java.util.Observable;

import javafx.collections.FXConllections;
import javafx.collections.ObservableList;

//Billboard Convert
public class j100C{
    public static j100 toBill(Billboard b){
        j100 bp = new j100();
        bp.setRank(b.getRank());
        bp.setSong(b.getSong());
        bp.setArtist(b.getArtist());
        bp.setImagesrc(b.getImagesrc());
        bp.setLastweek(b.getLastweek());
        return bp;
    }

    public static ArrayList<j100>toBill(ArrayList<Billboard> blist){
        ArrayList<j100> bplist = new ArrayList<>();
        for(Billboard bb:blist){
            bplist.add(toBill(bb));
        }

        return bplist;
    }

    public static ObservableList<j100> toBillboard(ArrayList<j100> alist){
        ObservableList<j100> bList = FXConllections.ObservableArrayList(alist);
        return bList;
    }

    public static ObservableList<j100> toObservBill(ArrayList<Billboard> alists){
        return toBillboard(toBill(alists));
    }

    public static void main(String[] args){
        RequestFromBillboardHot rfw = new RequestFromBillboardHot();
        j98 req = new j98();
        String a = "https://www.billboard.com/charts/hot-100/";
        String rs = rfw.getTimeDate(a);
        System.out.println(rs+"------------------------Billboard Chart!!!");
        rfw.getAllHtml(a+rs);
        String str = "<article class=\"chart-row";
        rfw.getBillboardData(str);
        ArrayList<Billboard> bills = rfw.getBillboard();
        
        req.getAllImagas(bills);
        ObservableList<j100> obsbills = j100C.toObservBill(bills);
        for(j100 bp:obsbills){
            System.out.println(bp);
        }
    }
}