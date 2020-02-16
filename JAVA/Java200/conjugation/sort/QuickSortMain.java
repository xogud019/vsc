public class QuickSortMain{
    public static void main(String[] args){
        int n = 100;
        int[] m = new int[n];

        for(int i=0; i<m.length; i++){
            m[i] = (int)(Math.random()*100)+1;
            System.out.print(m[i]+"\t");
            if((i+1)%10==0){
                System.out.println();
            }
        }
        System.out.println();

        QuickSort qs = new QuickSort();
        qs.QSrot(m);
        qs.print(m);
    }
}