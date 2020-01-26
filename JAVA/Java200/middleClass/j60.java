import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class j60{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        int s = 0;
        for(int  i =0; i<=10;i++){
            list.add(i);
        }

        list = list.stream().filter(i-> i%2==1).map(i->i*i).collect(Collectors.toList());
        list.forEach(i->{System.out.println(i);});

        s=list.stream().reduce(0,Integer::sum);
        System.out.println(s);
    }
}