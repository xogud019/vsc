//114main
public class OddMagicSquareMain{
    public static void main(String[] args){
        int n;
        do{
            n=(int)(Math.random()*10)+3;
        }while(n%2==0);
        
        OddMagicSquare oms = new OddMagicSquare(n);
        oms.make();
        oms.print();
        oms.printAll();

    }
}