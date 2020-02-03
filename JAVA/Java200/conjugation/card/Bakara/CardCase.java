import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CardCase{
    private List<Card> card = new ArrayList<>();

    public CardCase(){
        card.clear();
    }

    public List<Card> getCards(){
        return card;
    }

    public int count(){
        return card.size();
    }

    public Card getCard(int index){
        return card.get(index);
    }

    public void make(){
        card.clear();
        int suit = Card.SUIT.length;
        int val = Card.VALU.length;
        int count = 0;
        while(count != suit*val){
            Card c = new Card();
            if(!card.contains(c)){
                card.add(c);
                count++;
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(card);
    }

    public void print(){
        int valu = Card.VALU.length;
        for(int i = 0; i<card.size();i++){
            Card c = card.get(i);
            System.out.print(c.toString()+"\t");
            if((i+1)%valu==0){
                System.out.println();
            }
        }
    }

    public void sort(){
        card.sort(new CardCompare());
    }

}
