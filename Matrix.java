//j145
import java.util.Arrays;

public class Matrix{
    private double[][] matrix;
    private double[] matrix1;

    public Matrix(int n){
        matrix1 = new double[n];
    }
    public Matrix(int m, int n){
        matrix = new double[m][n];
    }

    public Matrix(){
        this(3,3);
    }

    public Matrix(Matrix mat){
        this(mat.getMatrix1());
    }

    public Matrix(Matrix mat){
        this(mat.getMatrix());
    }

    public Matrix(double[] deep){
        matrix1 = deepCopy1(deep);
    }

    public Matrix(double[][] deep){
        matrix = deepCopy(deep);
    }

    public void clear(){
        int m= matrix.length;
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                Arrays.fill(matrix[i],0);
            }
        }
    }

    public double[][] deepCopy(double[][] deep){
        int m = deep.length;
        int n = deep[0].length;
        double[][] paste= new double[m][n];
        for(int i=0;i<m;i++){
            System.arraycopy(deep[i], 0, paste[i], 0, n);
        }
        return paste;
    }

    public double[] deepCopy1(double[] deep){
        int m = deep.length;
        double[] paste= new double[m];
        for(int i=0;i<m;i++){
            paste[i]=deep[i];
        }
        return paste;
    }

    public double[][] getMatrix(){
        return deepCopy(matrix);
    }

    public double[] getMatrix1(){
        return deepCopy1(matrix1);
    }
    public Matrix makeMatrix(){
        return new Matrix(matrix);
    }

    public void print(){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    }

    public void print1(){
        for(int i=0; i<matrix1.length; i++){
            System.out.print(matrix1[i]+"\t");
        }
        System.out.println();
        System.out.println("------------------------------");
    }
}