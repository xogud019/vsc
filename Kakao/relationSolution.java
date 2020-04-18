//kakao 19`s 3pro
package Kakao;
import java.util.*;
public class relationSolution{
    public static int Solution(String[][] relation){
        int row = relation.length;
        int col = relation[0].length;

        HashSet<String> relationSet = new HashSet<String>();
        HashSet<Integer> candidateKey= new HashSet<Integer>();

        for(int i=1; i<(1<<col);i++){
            //empty set Exclusion
            relationSet.clear();
            for(int j=0; j<row; j++){
                String data ="";
                for(int k=0; k<col; k++){
                    if((i&(1<<k))!=0){
                        data+= relation[j][k];
                        
                    }
                }
                relationSet.add(data);
                System.out.print(relationSet);
                System.out.println();
            }
            if(relationSet.size()==row){
                insert(candidateKey, i);
            }
            System.out.println(i+"end");
        }
        return candidateKey.size();
    }

    private static void insert(HashSet<Integer> candidateKey,int n){
        for(int k:candidateKey){
            if((k&n)==k){
                System.out.println(k);
                return;
            }
        }
        candidateKey.add(n);
        System.out.println("add");
    }

    public static void main(String[] args){
        String[][] relation={{"100","ryan","music","2"},
                            {"200","apeach","math","2"},
                            {"300","tube","computer","3"},
                            {"400","con","computer","1"},
                            {"500","muzi","music","3"},
                            {"600","apeach","music","2"}};
        int key =Solution(relation);
        System.out.println(key);
    }
}