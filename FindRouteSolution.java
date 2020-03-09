//kakao 19`5
import java.util.*;

public class FindRouteSolution{
    public static void solution(int[][] nodeInfo){
        int degree = nodeInfo[nodeInfo.length-1][nodeInfo[1].length-1];
        int[] pre = new int[nodeInfo.length];

        pre = findPreOrder(nodeInfo, 1, pre, degree);
        for(int i=0; i<pre.length; i++){
            System.out.print(pre[i]+" ");
        }
    }

    public static int[] findPreOrder(int[][] nodeInfo,int count, int[] pre, int degree){
        if(count>degree){
            return pre;
        }
        else{
            for(int i=0; i<nodeInfo.length; i++){
                if(nodeInfo[i][1]==count&&i==0){
                    pre[i] = nodeInfo[i][0];
                }
                else if(){

                }
            }
        }
    }

    public static void findPostOrder(int[][] nodeInfo, int degree){

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
    public static void main(String[] args){
        int[][] nodeInfo ={{5,3},{11,4},{13,3},{3,4},{6,1},{1,3},{8,5},{7,2},{2,2}};
        int[][] result = nodeInfo;

        sort(result);
        solution(nodeInfo);
        System.out.print("[");
        for(int i=0; i<result.length; i++){
            System.out.print("[");
            for(int j=0; j<result[i].length; j++){
                System.out.print(result[i][j]);
                if(j!=result[i].length-1){
                    System.out.print(",");
                }
                else{
                    System.out.print("]");
                }
                
            }
            if(i!=result.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}

