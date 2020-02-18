//j146+147
public class MatrixUtil{
    public int[][] sumMatrix(int[][] n, int[][] m){
        int[][] c= new int[n.length][n.length];
        for(int i=0; i<n.length; i++){
            for(int j=0; j<n[0].length; j++){
                c[i][j]= n[i][j]+m[i][j];
            }
        }
        return c;
    }

    public int[][] differMatrix(int[][] n, int[][] m){
        int[][] c= new int[n.length][n.length];
        for(int i=0; i<n.length; i++){
            for(int j=0; j<n[0].length; j++){
                c[i][j]= n[i][j]-m[i][j];
            }
        }
        return c;
    }

    public int[][] mulMatrix(int[][] n, int[][] m){
        int[][] c= new int[n.length][n.length];
        for(int i=0; i<n.length; i++){
            for(int j=0; j<m[i].length; j++){
                for(int k=0; k<n[i].length; k++){
                    c[i][j]+= n[i][k]*m[k][j];
                }
            }
        }
        return c;
    }

    public double[][] revMatrix(int[][] n){
    
    }

    public void print(int[][] n){
        for(int i=0; i<n.length; i++){
            for(int j=0; j<n[i].length; j++){
                System.out.print(n[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    }
}