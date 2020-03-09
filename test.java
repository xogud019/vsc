import java.util.*;

public class test{
    public static void main(String[] args){
        int[][] nodeInfo ={
            {5,3},
            {11,5},
            {13,3},
            {3,5},
            {6,1},
            {1,3},
            {8,6},
            {7,2},
            {2,2}};

        sort(nodeInfo);

        for(int i=0; i<nodeInfo.length; i++){
            for(int j=0; j<nodeInfo[i].length; j++){
                System.out.print(nodeInfo[i][j]);
            }
            System.out.println();
        }
        int[] a= new int[10];
        System.out.println();
        System.out.println(Math.pow(2, 5)-1);
    }

    public static void sort(int[][] a){
        for(int j=0; j<a.length; j++){
            for(int i=0; i<a.length-1; i++){
                if(a[i][1]>a[i+1][1]){
                    int temp = a[i][0];
                    int temp1 = a[i][1];
                    a[i][0]= a[i+1][0];
                    a[i][1]= a[i+1][1];
                    a[i+1][0]=temp;
                    a[i+1][1]=temp1;
                }
                else if(a[i][1]==a[i+1][1]){
                    if(a[i][0]>a[i+1][0]){
                        int temp = a[i][0];
                        int temp1 = a[i][1];
                        a[i][0]= a[i+1][0];
                        a[i][1]= a[i+1][1];
                        a[i+1][0]=temp;
                        a[i+1][1]=temp1;
                    }
                }
            }    
        }
    }
}
    