public class j105main{
    public static void main(String[] args){
        j105card card1 = new j105card("A3");
        j105card card2 = new j105card("A3");
        j105card card3 = new j105card(card1);

        System.out.println(card1.hashCode());
        System.out.println(card2.hashCode());
        System.out.println(card1.getCardVal());
        System.out.println(card2.getCardVal());
        System.out.println(card1.equals(card2));
        System.out.println(card1.equals(card3));
        
        for(int i=0; i<j104unit.SUIT.length;i++){
            for(int j =0; j<j104unit.VALU.length;j++){
                j105card card = new j105card();
                System.out.printf("%s\t",card);
            }

            System.out.println();
        }
    }
}