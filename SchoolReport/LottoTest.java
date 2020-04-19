class Lotto{
    static int ticketNum = 0;
    private String area = "";
    int price=0;
    int[] numArray = new int[6];
    

    public Lotto(String area, int price){
        this.area = area;
        this.price = price;
        for(int i=0; i<6; i++){
            numArray[i] = (int)(Math.random()*45)+1;
        }
        ticketNum++;
    }

    
    public void createLottoNum(){
        for(int i=0; i<6; i++){
            this.numArray[i] = (int)(Math.random()*45)+1;
        }
    }

    public void show(){
        for(int i=0; i<6; i++){
            System.out.print(this.numArray[i]+" ");
        }
        System.out.println();
    }
    
}
public class LottoTest {
    public static void main(String[] args){
        Lotto l1 = new Lotto("Pusan",1000);
        Lotto l2 = new Lotto("Pusan",5000);
        Lotto l3 = new Lotto("Pusan",3000);
        Lotto l4 = new Lotto("Pusan",10000);
        Lotto l5 = new Lotto("Pusan",5000);

        l1.createLottoNum();
        l2.createLottoNum();
        l3.createLottoNum();
        l4.createLottoNum();
        l5.createLottoNum();

        l1.show();
        l2.show();
        l3.show();
        l4.show();
        l5.show();
    }
}