public class j48{

    public static int sumEach(int n){
        int tot=0;

        while(n!=0){
            tot += n%10;
            n /=10;
        }

        return tot;
    }
    public static void main(String[] args){
        int n = 123;
        int result = 0;

        result = sumEach(n);

        System.out.println(result);
    }
}