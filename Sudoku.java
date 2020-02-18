import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sudoku{
    boolean isSuffle = true;
    double[][] sudoku;
    double[][] basic;
    int n;

    public Sudoku(){
        this(3);
    }

    public Sudoku(int n){
        this.n= n;
        sudoku = new double[n][n];
        basic = new double[n][n];
    }

    private void clear(){
        for(int i=0; i<sudoku.length; i++){
            Arrays.fill(sudoku[i],0);
        } 
    }

    public boolean isSuffle(){
        return isSuffle;
    }

    public void setShuffle(boolean isSuffle){
        this.isSuffle = isSuffle;
    }

    public void init(){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                basic[i][j]= i*n+j+1;
                sudoku[i][j]= basic[i][j];
            }
        }
    }

    public void shuffle(){
        if(isSuffle()){
            Matrix msd = MatrixUtil.toTwoOne(new Matrix(basic));
        }
    }

}