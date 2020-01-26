public class j49{

    public static boolean isPrime(int n){
        boolean isT= false;

        for (int i= 2; i<=(int)Math.sqrt(n);i++){
            if(n%i!=0){
                isT = true;
            }
            else{
                isT = false;
            }
        }

        return isT;
    }
    public static void main(String[] args){
        int n = 4;
        boolean a = false;

        a= isPrime(n);

        System.out.println(a);

    }
}