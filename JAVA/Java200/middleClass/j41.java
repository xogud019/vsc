public class j41{
    public static boolean YoonYear(int year){
        boolean a = true;
        if((year%4==0)&&(year%100!=0)||(year%400 == 0)){
            a = true;
        }
        else{
            a = false;
        }
        return a;
    }

    public static void main(String[] args) {
        boolean a = false;
        int year = 2020;
        a= YoonYear(year);
        System.out.println(a);
    }
}