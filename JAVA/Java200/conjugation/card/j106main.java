public class j106main{
    public static void main(String[] args){
        j106cardcase cards = new j106cardcase();
        cards.make();
        CardRule rule = new CardRule();

        for(int i =0; i<5; i++){
            System.out.println("------------------");
            cards.shuffle();
            cards.print();
            int a = rule.rule(cards.getCard(0), cards.getCard(2));
            int b = rule.rule(cards.getCard(1), cards.getCard(3));

            System.out.println(cards.getCard(0)+" "+cards.getCard(2)+" "+a);
            System.out.println(cards.getCard(1)+" "+cards.getCard(3)+" "+b);
        }
        System.out.println("----------------");
    }
}