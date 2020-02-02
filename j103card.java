public class j103card{
    private String cardVal;

    public j103card(){
        this.cardVal = "A";
        //this("A");
    }
    
    public j103card(String s){
        this.cardVal = s;
    }

    
    public j103card(j103card card){
        this.cardVal = card.getCardVal();
        //this(card.getCardVal());
    }

    public String getCardVal(){
        return cardVal;
    }
    
    @Override
    public String toString(){
        return "["+cardVal+"]";
    }
}