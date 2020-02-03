import java.util.Comparator;

public class CardCompare implements Comparator<Card>{
    @Override
    public int compare(Card c1, Card c2){
        for(int i=0; i<Card.SUIT.length*Card.VALU.length;i++){
           if(c1.getCardVal().charAt(i)>c2.getCardVal().charAt(i)){
                return 1;
            }
            else if(c1.getCardVal().charAt(i)<c2.getCardVal().charAt(i)){
                return -1;
            }
            else{
                if(Unit.toVal(c1.getCardVal().charAt(i+1))>Unit.toVal(c2.getCardVal().charAt(i+1))){
                    return 1;
                }
                else if(Unit.toVal(c1.getCardVal().charAt(i+1))<Unit.toVal(c2.getCardVal().charAt(i+1))){
                    return -1;
                }
        
            }
        }
        return 0;
    }
}