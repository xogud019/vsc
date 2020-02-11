//j133
import java.util.Arrays;

public class Lotto6Num{
    private int[] lots;
    private int base;
    private int ballnum;

    public Lotto6Num(int base, int ballnum){
        this.base = base;
        this.ballnum=ballnum;
        lots = new int[ballnum];
    }

    public Lotto6Num(){
        this(45,6);
    }

    public void print(){
        for(int i=0; i<lots.length;i++){
            if(i==lots.length-1){
                System.out.print(lots[i]);
            }
            else{
                System.out.print(lots[i]+",");
            }
        }
        System.out.println();
    }

    private int rand(){
        return (int)(Math.random()*base)+1;
    }

    public boolean contain(int n){
        boolean isC= false;
        for(int i=0; i<lots.length;i++){
            if(lots[i]==n){
                isC=true;
                break;
            }
        }
        return isC;
    }

    public void make(){
        Arrays.fill(lots,0);
        int count =0;

        while(count!=ballnum){
            int temp = rand();
            if(!contain(temp)){
                lots[count++]=temp;
            }
        }
        Arrays.sort(lots);
    }

    public int[] getLots(){
        return lots;
    }

    public static void main(String[] args){
        Lotto6Num lotto = new Lotto6Num();
        lotto.make();
        lotto.print();
    }
}
