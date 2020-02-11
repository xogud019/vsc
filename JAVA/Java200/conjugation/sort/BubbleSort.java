//j134
public class BubbleSort{
    public static void BSrot(int[] n){
        for(int i=0; i<n.length;i++){
            for(int j=0; j<n.length-1;j++){
                int temp;
                if(n[j]>n[j+1]){
                    temp= n[j];
                    n[j] = n[j+1];
                    n[j+1]=temp;
                }
            }
        }
    }

    public static void print(int[] n){
        for(int i=0; i<n.length; i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] n =new int[10];
        for(int i=0; i<n.length; i++){
            n[i]=(int)(Math.random()*100)+1;
        }
        BubbleSort.print(n);
        BubbleSort.BSrot(n);
        BubbleSort.print(n);
    }
}