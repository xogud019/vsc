//j113
public class Bakara{
    CardPrint cp = new CardPrint();
    int whoWin = -1;
    public void start(){
        cp.make();
        cp.shuffle();
    }

    public void result(){
        whoWin = -1;
        cp.print();
        System.out.println("result :");
        System.out.println("---------------");
        System.out.println("Player : "+cp.returnPlayer());
        System.out.println("Dealer : "+cp.returnDealer());
        
        if(cp.returnPlayer()<cp.returnDealer()){
            System.out.println("Banker WIN!");
            whoWin=2;
        }
        
        else if(cp.returnPlayer()>cp.returnDealer()){
            System.out.println("Player WIN!");
            whoWin=1;
        }
        else{
            System.out.println("DRAW!");
            whoWin =3;
        }
    }

    public int getWhoWin(){
        return whoWin;
    }
}