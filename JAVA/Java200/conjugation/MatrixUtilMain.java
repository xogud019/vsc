public class MatrixUtilMain{
    public static void main(String[] args){
        int n= 3;
        int[][] nn = new int[n][n];
        int[][] mm = new int[n][n];
        int[][] cc = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                nn[i][j]=(int)(Math.random()*10)+1;
                mm[i][j]=(int)(Math.random()*10)+1;
            }
        }

        MatrixUtil mu = new MatrixUtil();
        cc=mu.mulMatrix(nn, mm);
        mu.print(nn);
        mu.print(mm);
        for(int i=0; i<cc.length; i++){
            for(int j=0; j<cc[i].length; j++){
                System.out.print(cc[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    }
}