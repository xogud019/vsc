//j149
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sudoku{
    boolean isSuffle = true;
    double[][] sudoku;
    double[][] basic;
    int n;
    private double[][] x2 = {{0,1,0},{0,0,1},{1,0,0}};
    private double[][] x1 = {{0,0,1},{1,0,0},{0,1,0}};

    public Sudoku(){
        this(3);
    }

    public Sudoku(int n) {
        this.n = n;
        sudoku = new double[n*n][n*n];
        basic = new double[n][n];
    }

    private void clear() {
        for (int i = 0; i < sudoku.length; i++) {
            Arrays.fill(sudoku[i], 0);
        }
    }

    public boolean isSuffle() {
        return isSuffle;
    }

    public void setShuffle(boolean isSuffle) {
        this.isSuffle = isSuffle;
    }

    private void init() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                basic[i][j] = i * n + j + 1;
                sudoku[i][j] = basic[i][j];
            }
        }
    }

    private void shuffle() {
        if (isSuffle()) {
            Matrix msd = MatrixUtil.toTwoOne(new Matrix(basic));
            double[][] mms = msd.getMatrix();
            ArrayList<Double> list = new ArrayList<Double>();
            for(int i = 0; i<mms[0].length; i++){
                list.add(mms[0][i]);
            }

            Collections.shuffle(list);
            for(int i = 0; i<mms[0].length; i++){
                mms[0][i] = list.get(i);
            }

            msd = MatrixUtil.toOneTwo(new Matrix(mms), n, n);
            basic = msd.getMatrix();
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    sudoku[i][j]= basic[i][j];
                }
            }
        }
    }

    public void print(){
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<sudoku.length; i++){
            sb.append("[\t");
            for(int j= 0; j<sudoku[i].length; j++){
                sb.append((int)sudoku[i][j]+"\t");
            }
            sb.append("]");
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public void print2(){
        System.out.println(new Matrix(sudoku));
    }


    public void make(){
        clear();
        init();
        shuffle();
        makeS1();
        makeS2();
        makeS3();
        makeS4();
        makeS5();
        makeS6();
        makeS7();
        makeS8();
    }
    
    private void makeS1(){
        Matrix s0 = new Matrix(basic);
        Matrix s1 = MatrixUtil.mulMatrix(new Matrix(x2), s0);

        for(int i=0; i<n; i++){
            for(int j = 0; j<n; j++){
                sudoku[i][j+n] = s1.getMatrix()[i][j];
            }
        }
    }

    private void makeS2(){
        Matrix s0 = new Matrix(basic);
        Matrix s2 = MatrixUtil.mulMatrix(new Matrix(x1), s0);

        for(int i=0; i<n; i++){
            for(int j = 0; j<n; j++){
                sudoku[i][j+2*n] = s2.getMatrix()[i][j];
            }
        }
    }

    private void makeS3(){
        Matrix s0 = new Matrix(basic);
        Matrix s3 = MatrixUtil.mulMatrix(s0,new Matrix(x1));

        for(int i=0; i<n; i++){
            for(int j = 0; j<n; j++){
                sudoku[i+n][j] = s3.getMatrix()[i][j];
            }
        }
    }

    private void makeS4(){
        Matrix s0 = new Matrix(basic);
        Matrix s1 = MatrixUtil.mulMatrix(new Matrix(x2), s0);
        Matrix s4 = MatrixUtil.mulMatrix(s1, new Matrix(x1));

        for(int i=0; i<n; i++){
            for(int j = 0; j<n; j++){
                sudoku[i+n][j+n] = s4.getMatrix()[i][j];
            }
        }
    }

    private void makeS5(){
        Matrix s0 = new Matrix(basic);
        Matrix s1 = MatrixUtil.mulMatrix(new Matrix(x1), s0);
        Matrix s5 = MatrixUtil.mulMatrix(s1, new Matrix(x1));

        for(int i=0; i<n; i++){
            for(int j = 0; j<n; j++){
                sudoku[i+n][j+2*n] = s5.getMatrix()[i][j];
            }
        }
    }

    private void makeS6(){
        Matrix s0 = new Matrix(basic);
        Matrix s6 = MatrixUtil.mulMatrix(s0,new Matrix(x2));

        for(int i=0; i<n; i++){
            for(int j = 0; j<n; j++){
                sudoku[i+2*n][j] = s6.getMatrix()[i][j];
            }
        }
    }

    private void makeS7(){
        Matrix s0 = new Matrix(basic);
        Matrix s1 = MatrixUtil.mulMatrix(new Matrix(x2),s0);
        Matrix s7 = MatrixUtil.mulMatrix(s1,new Matrix(x2));

        for(int i=0; i<n; i++){
            for(int j = 0; j<n; j++){
                sudoku[i+2*n][j+n] = s7.getMatrix()[i][j];
            }
        }
    }

    private void makeS8(){
        Matrix s0 = new Matrix(basic);
        Matrix s1 = MatrixUtil.mulMatrix(new Matrix(x1),s0);
        Matrix s8 = MatrixUtil.mulMatrix(s1,new Matrix(x2));

        for(int i=0; i<n; i++){
            for(int j = 0; j<n; j++){
                sudoku[i+2*n][j+2*n] = s8.getMatrix()[i][j];
            }
        }
    }

}