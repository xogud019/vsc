//j150
public class FifteenPuzzleMain{
    public static void main(String[] args){
        int[][]m = {{1,2,3,4},{5,6,0,7},{9,10,11,8},{13,14,15,12}};
        FifteenPuzzle puz = new FifteenPuzzle(m);
        puz.testPuzzles();
        FifteenPuzzle puz2 = new FifteenPuzzle();
        puz2.makePuzzle(true);
        puz2.print();
    }
}