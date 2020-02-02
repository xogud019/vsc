public class j105card{
    private String cardVal;

    public String getCardVal(){
        return cardVal;
    }

    public j105card(){
        int deck = (int)(Math.random()*j104unit.SUIT.length);
        int suit = (int)(Math.random()*j104unit.VALU.length);
        cardVal = j104unit.SUIT[deck]+j104unit.VALU[suit];
    }

    public j105card(String s){
        this.cardVal =s;
    }
    
    public j105card(j105card card){
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
        j105card cb =(j105card)obj;
        if(cardVal.equals(cb.getCardVal())){
            return true;
        }
        else{
            return false;
        }
    }
}