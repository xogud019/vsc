//114main
public class OddMagicSquareMain{
    public static void main(String[] args){
        //int n = (int)(Math.random()*10)+1;
        int n = 2;
        OddMagicSquare oms = new OddMagicSquare(n);
        oms.make();
        oms.print();
    }
}