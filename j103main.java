public class j103main{
    public static void main(String[] args){
        String c1 = "A", v1 = "1";
        String c2 = "K", v2 = "2";

        j103card card = new j103card();
        System.out.println(card);

        j103card card1 = new j103card("B");
        System.out.println(card1);

        j103card card2 = new j103card(card1);
        System.out.println(card2);

        j103card card3 = new j103card(c1+v1);
        System.out.println(card3);

        j103card card4 = new j103card(c2+v2);
        System.out.println(card4);

        System.out.println(card1.equals(card2));
        System.out.println(card1.getCardVal().equals(card2.getCardVal()));

    }
}