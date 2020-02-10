//j128
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class ThirTeenFriday{
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        int count =0;

        for(int year =2000; year<=currentYear; year++){
            for(int month=0; month<12; month++){
                cal.set(year,month,13);
                if(cal.get(Calendar.DAY_OF_WEEK)==Calendar.FRIDAY){
                    System.out.println((++count)+"\t"+sdf.format(cal.getTime()));
                }
            }
        }
    }
}