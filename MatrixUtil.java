//j146+147
public class MatrixUtil{
    public static Matrix addMatrix(Matrix a, Matrix b){
        int n = a.getMatrix().length;
        int m = a.getMatrix()[0].length;
        double [][]c = new double[n][m];

        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[i].length; j++){
                c[i][j]= a.getMatrix()[i][j]+b.getMatrix()[i][j];
            }
        }
        return new Matrix(c);
    }

    public static Matrix differMatrix(Matrix a, Matrix b){
        int n = a.getMatrix().length;
        int m = a.getMatrix()[0].length;
        double [][]c = new double[n][m];

        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[i].length; j++){
                c[i][j]= a.getMatrix()[i][j]-b.getMatrix()[i][j];
            }
        }
        return new Matrix(c);
    }

    public static Matrix mulMatrix(Matrix a, Matrix b){
        int n = a.getMatrix().length;
        int m = a.getMatrix()[0].length;
        int p = b.getMatrix()[0].length;
        double [][]c = new double[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<p; j++){
                for(int k=0; k<n; k++){
                    c[i][j]+= a.getMatrix()[i][k]*b.getMatrix()[k][j];
                }
            }
        }
        return new Matrix(c);
    }

    public static Matrix revMatrix(Matrix a){
        double[][] matricex = a.getMatrix();
        double[][] matrices = new double[matricex.length][matricex[0].length*2];

        for(int i=0; i<matricex.length; i++){
            for(int j=0; j<matricex[i].length; j++){
                matrices[i][j] = matricex[i][j];
            }
        }

        for(int i=0; i<matricex.length; i++){
            matrices[i][i+matricex[i].length] = 1.0;
        }
        
        int row = matrices.length;
        int col = matrices[0].length;

        for(int k=0; k<row; k++){
            double max =0.0;
            int pivotRow = k;
            for(int j=k; j<row; j++){
                double tempMax = Math.abs(matrices[j][k]);
                if(max< tempMax){
                    max = tempMax;
                    pivotRow = j;
                }
            }

            if(k!=pivotRow){
                for(int j=0; j<col; j++){
                    double temp = matrices[k][j];
                    matrices[k][j]=matrices[pivotRow][j];
                    matrices[pivotRow][j]= temp;
                }
            }
            double pivot = matrices[k][k];
            for(int j=k; j<col; j++){
                matrices[k][j]/=pivot;
            }

            for(int i=0; i<row; i++){
                if(i!=k){
                    double delta = matrices[i][k];
                    for(int j=k; j<col; j++){
                        matrices[i][j]-=delta*matrices[k][j];
                    }
                }
            }
        }
        double[][] result = new double[matricex.length][matricex.length];
        for(int i=0; i<matricex.length; i++){
            for(int j=0; j<matricex[i].length; j++){
                result[i][j]= matrices[i][j+matricex[i].length];
            }
        }
        return new Matrix(result);
    }
    //1`s array -> 2`s array
    public static Matrix toOneTwo(Matrix A){
        
    }
    //2`s array -> 1`s array
    public static Matrix toTwoOne(Matrix A){
        int n = A.getMatrix().length;
        int m = A.getMatrix()[0].length;
        double []c = new double[n*m];
        
        return new Matrix(c);

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