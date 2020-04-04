//kakao 19`5  not perfect
import java.util.*;

public class FindRouteSolution{
    public static void solution(int[][] nodeInfo){
        int[][] tree = nodeInfo;
        sort(tree);
        Tree t =new Tree();
        Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();
        Queue<Integer> q3 = new LinkedList<Integer>();
        Queue<Integer> q4 = new LinkedList<Integer>();
        Queue<Integer> q5 = new LinkedList<Integer>();

        for(int i=0; i<tree.length; i++){
            if(tree[i][1]==1){
                q1.add(tree[i][0]);
            }
            else if(tree[i][1]==2){
                q2.add(tree[i][0]);
            }
            else if(tree[i][1]==3){
                q3.add(tree[i][0]);
            }
            else if(tree[i][1]==4){
                q4.add(tree[i][0]);
            }
            else if(tree[i][1]==5){
                q5.add(tree[i][0]);
            }
        }
        
        Node n9 = t.createNode(null, q5.poll(), null);
        Node n7 = t.createNode(null, q4.poll(), null);
        Node n8 = t.createNode(n9, q4.poll(), null);
        Node n4 = t.createNode(null, q3.poll(), null);
        Node n5 = t.createNode(n7, q3.poll(), null);
        Node n6 = t.createNode(n8, q3.poll(), null);
        Node n2 = t.createNode(n4, q2.poll(), n5);
        Node n3 = t.createNode(null, q2.poll(), n6);
        Node n1 = t.createNode(n2, q1.poll(), n3);

        t.setRoot(n1);
        t.preOrder(n1);
        System.out.println();
        t.postOrder(n1);
        
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
        solution(nodeInfo);
    
    }
}

