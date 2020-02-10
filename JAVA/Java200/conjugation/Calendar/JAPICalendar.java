//j130
import java.util.Calendar;

public class JAPICalendar{
    public void showCal(int year){
        String s1 = String.format("\t\t\t%dyear", year);
        System.out.println(s1);
        for(int i=1; i<=12; i++){
            showCal(year,i);
        }
    }

    public void showCal(int year, int month){
        String s1 = String.format("\t%dyear\t%dmonth", year,month);
        String t1 = String.format("sun\tmon\ttue\twed\tthu\tfri\tsat");
        System.out.println(s1);
        System.out.println(t1);
        Calendar cal =Calendar.getInstance();
        cal.set(year,month-1,1);
        int dateOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        for(int i=1;i<dateOfWeek;i++){
            System.out.print("\t");
        }

        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        for(int i=1; i<lastDay;i++){
            System.out.printf("%d\t",i);
            if((i+dateOfWeek)%7==0){
                System.out.println();
            }
        }
        System.out.println("\n=--------------------------------------");
    }
    
    public static void main(String[] args){
        JAPICalendar jcal = new JAPICalendar();
        jcal.showCal(2020,2);
    }
}