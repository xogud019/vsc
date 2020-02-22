public class SudokuMain{
    public static void main(String[] args){
        Sudoku sd = new Sudoku(3);
        sd.setShuffle(true);
        sd.make();
        sd.print();
    }
}