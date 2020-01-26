import java.util.Arrays;

public class j77{
    public static void main(String[] args){
        int[] a;
        a= new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;

        int[] b = new int[]{6,7,8,9,0};
        int[] c = {11,21,13,41,15};

        int[] e = new int[5];
        Arrays.fill(e,-1);
        System.arraycopy(c, 0, e, 0, c.length);
        Arrays.sort(e);
        print(e);
        e= new int[]{1,2,3,4,5,6};
        print(e);
        int index = Arrays.binarySearch(e, 5);
        System.out.println(index);
    }

    public static void print(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
    }
}