public class j104card{
    private String cardVal;

    public String getCardVal(){
        return cardVal;
    }

    public j104card(String s){
        this.cardVal = s;
    }

    public j104card(){
        int suit = (int)(Math.random()*j104unit.SUIT.length);
        int val = (int)(Math.random()*j104unit.VALU.length);
        cardVal = j104unit.SUIT[suit]+j104unit.VALU[val];
    }

    public j104card(j104card card){
        this(card.getCardVal());
    }

    @Override
    public String toString(){
        return "["+cardVal+"]";
    }
}