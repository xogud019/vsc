import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class j75{
    public static void main(String[] args){
        String st = "2020-01-20";
        Calendar d2 = todate(st);
        System.out.println(toYMD(d2));

        String st1= goGo(st,-7);
        System.out.println(st1);
        Calendar d3 = todate(st1);
        System.out.println(toYMD(d3));

        TimeZone tz = TimeZone.getDefault();
        Calendar cal = Calendar.getInstance(tz);
        System.out.println(toYMD2(cal));

        TimeZone tzNY = TimeZone.getTimeZone("America/New_York");
        Calendar calNY = Calendar.getInstance(tzNY);
        System.out.println(toYMD2(calNY));

    }

    public static Calendar todate(String ss){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dd = new Date();
        try{
            dd = sdf.parse(ss);
        }
        catch(ParseException e){
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(dd);
        
        return cal;
    }

    public static String toYMD(Calendar dd){
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(dd.getTime());
    }

    public static String toYMD2(Calendar dd){
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(dd.getTime());
    }

    public static String goGo(String ss, int day){
        Calendar cal = todate(ss);
        cal.add(Calendar.DAY_OF_YEAR, day);
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(cal.getTime());
        
    }
}