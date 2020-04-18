class Card{
    int num=0;

    public Card(){
        this.num = (int)(Math.random()*100)+1;
    }

    Card upValue(Card c1, Card c2){ 
        if(c1.num>=c2.num){
            return c1;
        }
        else{
            return c2;
        }
    }

}
public class CardTest {
    public static void main(String[] args){
        Card c1 = new Card();
        Card c2 = new Card();

        Card bigger = c1.upValue(c1, c2);

        System.out.println(bigger.num);
    }
}