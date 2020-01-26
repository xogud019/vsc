import java.util.ArrayList;
import java.util.List;

public class j56{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<=10; i++){
            list.add(i);
        }

        for(int i= 0; i<=list.size();i++){
            int m = list.get(i);
           
            System.out.println(m);
            // System.out.println(list.get(i));
        }
    }
}