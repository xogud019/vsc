import java.util.ArrayList;

public class j80{
    public static void main(String[] args){
        int intNum1= 123;
        long longNum1=  345L;
        double doubleNum1 = 123.123;
        Integer intWrap1= intNum1;
        Long longWarp1= longNum1;
        Double doubleWrap1 = doubleNum1;
        double dd =doubleWrap1;
        Integer intWrap2=intNum1;
        intNum1= intWrap2;

        System.out.println(intNum1);

        ArrayList<Integer> ilist= new ArrayList<>();
        ilist.add(5);
        int a = ilist.get(0);
        System.out.println(a);

        int b = Integer.parseInt("123");
        System.out.println(b);

    }
}