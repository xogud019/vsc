import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class j57{
    public static void main(String[] args){
        List<Integer>mmlists = Arrays.asList(1,3,5,7,9);
        mmlists.forEach(m->{System.out.println(m);});

        Consumer<Integer>consume = (Integer m)->{System.out.println(m);};
        mmlists.forEach(consume);
    }
}