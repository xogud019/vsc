public class j32{
    public static void main(String[] args){
        int a = 1;
        int aa =11;
        int b = 2;
        int bb = 22;

        int[] A= {a,aa};
        int[] B = {b,bb};
        System.out.println(A[0] + "\t" + A[1]);

        int[][] C = { {a, aa},{b,bb} };
        System.out.println(C[0][0] + "\t" + C[0][1]);
    }
}