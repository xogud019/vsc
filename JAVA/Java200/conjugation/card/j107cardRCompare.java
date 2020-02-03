import java.util.Comparator;

public class j107cardRCompare implements Comparator<Card>{
    @Override
    public int compare(Card c1, Card c2){
        for(int i=0; i<Card.SUIT.length*Card.VALU.length;i++){
           if(c1.getCardVal().charAt(i)>c2.getCardVal().charAt(i)){
                return -1;
            }
            else if(c1.getCardVal().charAt(i)<c2.getCardVal().charAt(i)){
                return 1;
            }
            else{
                if(j104unit.toVal(c1.getCardVal().charAt(i+1))>j104unit.toVal(c2.getCardVal().charAt(i+1))){
                    return -1;
                }
                else if(j104unit.toVal(c1.getCardVal().charAt(i+1))<j104unit.toVal(c2.getCardVal().charAt(i+1))){
                    return 1;
                }
        
            }
        }
        return 0;
    }
}