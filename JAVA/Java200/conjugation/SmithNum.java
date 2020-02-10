//j127
public class SmithNum{
    public static int sumEach(int n){
        int tot=0;
        while(n!=0){
            tot+=n%10;
            n/=10;
        }
        return tot;
    }

    public static boolean isPrime(int n){
        boolean isT= true;
        for(int i=2; i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                isT=false;
                break;
            }
        }

        return isT;
    }

    public static int sumSmith(int n){
        int tot=0;
        int a=2;
        while(n!=1){
            if(n%a==0){
                tot+=sumEach(a);
                n/=a;
            }
            else{
                a++;
            }
        }
        return tot;
    }

    public static void printSmith(int t1, int t2){
        for(int i=t1; i<t2; i++){
            if(!isPrime(i)&&sumEach(i)==sumSmith(i)){
                System.out.print(i+"is smith num");
                j123.printPrimeDivide(i);
            }
        }
    }

    public static void main(String[] args){
        printSmith(100, 200);
    }
}