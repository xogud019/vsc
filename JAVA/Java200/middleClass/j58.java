import java.util.ArrayList;
import java.util.List;

public class j58{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int s = 0;
        for(int i= 1; i<=10; i++){
            list.add(i);
        }

        for(int m:list){
            if(m%2!= 0){
                s += m*m;
                System.out.println(m*m);
            }
        }

        System.out.println(s);
    }
}