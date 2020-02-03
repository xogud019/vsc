public class CardPrint{
    CardCase card = new CardCase();
    CardLaw rule = new CardLaw();

    private int TotalPlayer;
    private int TotalDealer;

    public CardPrint(){}

    public void make(){
        card.make();
    }

    public void shuffle(){
        card.shuffle();
    }

    public void print(){
        System.out.println("<Player`s card>");
        System.out.println("-----------------------");
        System.out.print("first card : ");
        System.out.println(card.getCards().get(0));
        System.out.print("first card`s num : ");
        System.out.println(num(0));

        System.out.print("second card : ");
        System.out.println(card.getCards().get(1));
        System.out.print("second card`s num : ");
        System.out.println(num(1));

        System.out.print("player`s sum of 2card : ");
        System.out.println(sumP());
        TotalPlayer = sumP();

        System.out.println("-----------------------");

        if(rule.natural(sumP(), sumD())){
            System.out.println("exception. so start now");
            TotalPlayer = sumP();
        }
        else if(rule.stand(sumP(), sumD())){
            standPrintPl();
        }
        else if(rule.thirdCardPlayer(sumP())){
            System.out.println("get the third card");
            System.out.println("third card : "+card.getCards().get(4));
            System.out.println("third card`s num : "+num(4));
            System.out.println("-----------------------");
            System.out.println("player`s sum of total card : "+total(sumP(),num(4)));
            TotalPlayer = total(sumP(),num(4));
        }

        System.out.println("-----------------------");
        System.out.println();

        System.out.println("<Banker`s card>");
        System.out.println("-----------------------");

        System.out.print("first card : ");
        System.out.println(card.getCards().get(2));
        System.out.print("first card`s num : ");
        System.out.println(num(2));

        System.out.print("second card : ");
        System.out.println(card.getCards().get(3));
        System.out.print("second card`s num : ");
        System.out.println(num(3));

        System.out.print("Banker`s sum of 2card : ");
        System.out.println(sumD());
        TotalDealer = sumD();

        System.out.println("-----------------------");

        if(rule.natural(sumP(), sumD())){
            System.out.println("exception. so start now");
            TotalDealer = sumD();
        }
        else if(rule.stand(sumP(), sumD())){
            standPrintDl();
        }
        else if(rule.thirdCardPlayer(sumP())){
            System.out.println("get the third card");
            System.out.println("third card : "+card.getCards().get(5));
            System.out.println("third card`s num : "+num(5));
            System.out.println("-----------------------");
            System.out.println("Banker`s sum of total card : "+total(sumD(),num(5)));
            TotalDealer = total(sumD(),num(5));
        }

        System.out.println("-----------------------");
        System.out.println();
    }

    public void standPrintPl(){
        System.out.println("stand");
        if(sumP()>5&&sumP()<8){
            if(sumD()<6){
                System.out.println("Banker gets third card");
            }
            else{
                System.out.println("start!");
                TotalPlayer = sumP();
            }
        }
        else if(sumD()==7){
            if(sumP()<6){
                System.out.println("get the third card");
                System.out.println("third card : "+card.getCards().get(4));
                System.out.println("third card`s num : "+num(4));
                System.out.println("-----------------------");
                System.out.println("player`s sum of total card : "+total(sumP(),num(4)));
                TotalPlayer = total(sumP(),num(4));
            }
            else{
                System.out.println("start!");
                TotalPlayer = sumP();
            }
        }
    }

    public void standPrintDl(){
        System.out.println("stand");
        if(sumP()>5&&sumP()<8){
            if(sumD()<6){
                System.out.println("get the third card");
                System.out.println("third card : "+card.getCards().get(5));
                System.out.println("third card`s num : "+num(5));
                System.out.println("-----------------------");
                System.out.println("Banker`s sum of total card : "+total(sumD(),num(5)));
                TotalDealer = total(sumD(),num(5));
            }
            else{
                System.out.println("start!");
                TotalDealer = sumD();
            }
        }
        else if(sumD()==7){
            if(sumP()<6){
                System.out.println("Player gets third card");
            }
            else{
                System.out.println("start!");
                TotalDealer = sumD();
            }
        }
    }

    public int num(int n){
        int num;
        Card str = card.getCards().get(n);
        char ch = str.getCardVal().charAt(1);
        switch(ch){
            case 'A': num = 1; 
            break;
            case 'T':
            case 'J':
            case 'Q':
            case 'K':num =0;
            break;
            default: num= ch-'0';
            break;
        }
        return num;
    }

    public int sumP(){
        int sumP = 0;
        for(int i=0; i<2; i++){
            sumP += num(i);
            if(sumP>9){
                sumP -=10;
            }
        }

        return sumP;
    }

    public int sumD(){
        int sumD = 0;
        for(int i=2; i<4; i++){
            sumD += num(i);
        }
        return sumD%10;
    }

    public int total(int x, int y){
        return (x+y)%10;
    }

    public int returnPlayer(){
        return TotalPlayer;
    }

    public int returnDealer(){
        return TotalDealer;
    }
}