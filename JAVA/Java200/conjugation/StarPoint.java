//j121+j122
public class StarPoint{
    public static void printReverseRectangle(int n){
        for(int i=0; i<n; i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<2*(n-i);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printDiaRectangle(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<Math.abs(i-n/2); j++){
                System.out.print(" ");
            }
            for(int k=0; k<n-2*Math.abs(i-n/2); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n= 5;
        printReverseRectangle(n);
        System.out.println("===============================");
        printDiaRectangle(n);
    }
}