//j135
public class AmiCable{
    public static void printAmiCable(int t1, int t2){
        for(int i=t1; i<t2; i++){
            int a = i;
            int b = divideSum(a);
            int c = divideSum(b);

            if(a<b&&a==c){
                System.out.println(a+","+b+"is AmiCableNum");
                printDivide(a);
                printDivide(b);
            }
        }
    }

    private static int divideSum(int num){
        int tot=1;
        for(int i=2; i<num; i++){
            if(num%i==0){
                tot+=i;
            }
        }
        return tot;
    }

    private static void printDivide(int n){
        if(n==1){
            System.out.println("[1]");
        }
        else{
            System.out.print("[1,");
            for(int i=2; i<n;i++){
                if(n%i==0){
                    System.out.print(i+",");
                }
            }
            System.out.println(n+"]");
        }
    }
    
    public static void main(String[] args){
        printAmiCable(2, 2000);
        //int a=1;
        //System.out.println(a);
    }
}