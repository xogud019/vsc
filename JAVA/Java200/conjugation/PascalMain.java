//j141
public class PascalMain{
    public static void main(String[] args){
        int[][] pt= Pascal.triAngle(10);
        for(int i=0; i<pt.length; i++){
            for(int j=0; j<pt[i].length; j++){
                System.out.print(pt[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        int[] bt = Pascal.phibo(20);
        for(int i=0;i<bt.length; i++){
            System.out.print(bt[i]+"\t");
        }
    }
}