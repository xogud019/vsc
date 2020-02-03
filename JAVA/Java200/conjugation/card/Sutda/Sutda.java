//j111
import java.util.Date;
import java.util.Scanner;

public class Sutda{
    Cardcase card = new Cardcase();
    CardRule rule = new CardRule();
    Card[] card1 = new Card[Card.SUTDA];
    Card[] card2 = new Card[Card.SUTDA];

    public Sutda(){
        card.make();
    }

    private void divide(){
        for(int i=0; i<Card.SUTDA;i++){
            card1[i]=card.getCard(i);
            card2[i]=card.getCard(i+Card.SUTDA);
        }
    }

    private void divide2(){
        for(int i=0,j=0; i<card1.length;i++,j+=2){
            card1[i]= card.getCard(j);
            card2[i]= card.getCard(j+1);
        }
    }

    public void play(){
        Scanner scan = new Scanner(System.in);
        System.out.println("!!Welcome"+new Date()+"!!");
        System.out.println("Start");
        String ss ="N";

        do{
            card.shuffle();
            divide2();
            int v1= rule.rule(card1[0], card1[1]);
            int v2= rule.rule(card2[0], card2[1]);

            if(v1>v2){
                System.out.println("WIN");
            }
            else if(v1<v2){
                System.out.println("LOSE");
            }
            else{
                System.out.println("DRAW");
            }
            System.out.println("!!Welcome"+new Date()+"!!");
            System.out.println("Do you want to play? (Y/N)");
            ss= scan.next();
        }while((ss.toUpperCase()).equalsIgnoreCase("Y"));
        System.out.println("EXIT");
    }
}