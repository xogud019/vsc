public class Unit{
    
    public static int toVal(Card c){
        return toVal(c.getCardVal().charAt(1));
    }

    public static int toVal(Card c, int index){
        return toVal(c.getCardVal().charAt(index));
    }

    public static int toVal(char cc){
        int tot=0;
        switch(cc){
            case 'A':tot=1;
            break;
            case 'T':tot=10;
            break;
            case 'J':tot=11;
            break;
            case 'Q':tot=12;
            break;
            case 'K':tot=13;
            break;
            default: tot=0;
            break;
        }
        return tot;
    }
}