//j137
public class HanoiMain{
    public static void main(String[] args){
        int tray=5;

        Hanoi h = new Hanoi(tray);
        int [][]a= h.getRings();
        HanoiUtil.showHanoi(a);
        HanoiUtil.moveHanoi(a, tray, 'a', 'b', 'c');
    }
}