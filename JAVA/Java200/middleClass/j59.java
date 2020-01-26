import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class j59{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        int s = 0;

        for(int i= 0; i<=100; i++){
            list.add(i);
        }

        s= list.stream().reduce(0,Integer::sum);
        System.out.println(s);
        s= 0;

        s=list.stream().filter(i-> i%2==1).reduce(0,Integer::sum);
        System.out.println(s);
        s = 0;

        s=list.stream().filter(i-> i%2==0).reduce(0,Integer::sum);
        System.out.println(s);

        s=list.stream().filter(i-> i%2==0).reduce(0,(x,y)->x+y);
        System.out.println(s);
        s= 0;

        s=list.stream().filter(i-> i%2==1).reduce(0, new BinaryOperator<Integer>(){
                                                                                @Override
                                                                                public Integer apply(Integer t,Integer u){
                                                                                    return t+u;
                                                                                }
                                                                            });
        System.out.println(s);
    }
}