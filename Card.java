public class Card{
    public static final int SUTDA = 2;
    public static final String[] SUIT = {"H","C"};
    public static final String[] VALU = {"A","2","3","4","5","6","7","8","9","1"};
    
    private String cardVal;

    public String getCardVal(){
        return cardVal;
    }

    public Card(){
        int deck = (int)(Math.random()*SUIT.length);
        int suit = (int)(Math.random()*VALU.length);
        cardVal = SUIT[deck]+VALU[suit];
    }

    public Card(String s){
        this.cardVal =s;
    }
    
    public Card(Card card){
        this.cardVal =card.getCardVal();
    }

    @Override
    public String toString(){
        return "["+cardVal+"]";
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result =1;
        result = prime + result +((cardVal==null)?0:cardVal.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        Card cb =(Card)obj;
        if(cardVal.equals(cb.getCardVal())){
            return true;
        }
        else{
            return false;
        }
    }
    
}