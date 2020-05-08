package JAVA.Java200.conjugation;
public class j123{
    public static void printDivide(int n){
        if(n==1){
            System.out.println(n);
        }
        else{
            System.out.print("["+1+",");
            for(int i=2; i<n; i++){
                if(n%i==0){
                    System.out.print(i+",");
                }
            }
            System.out.print(n+"]");
        }
    }

    public static void printPrimeDivide(int n){
        int a = 2;
        while(n!=1){
            if(n%a==0){
                if(n/a==1){
                    System.out.println(a);
                }
                else{
                    System.out.print(a+"x");
                }
                n/=a;
            }
            else{
                a++;
            }
        }
    }

    public static void main(String[] args){
        int n= 12;
        printDivide(n);
        System.out.println();
        printPrimeDivide(n);
    }
}