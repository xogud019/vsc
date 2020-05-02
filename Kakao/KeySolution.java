package Kakao;

public class KeySolution {
    public static void main(String[] args){
        int[][] key ={{0,0,0},{1,0,0},{0,1,1}};
        int[][] lock ={{1,1,1,1,0},{1,1,1,0,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        boolean result = solution(lock,key);
        System.out.println(result);
    }

    public static boolean solution(int[][] lock, int[][] key){
        boolean isUnLock = false;
        int[][] extendsLock = new int[lock.length*3][lock.length*3];
        int[][] temp = new int[extendsLock.length][extendsLock.length];

        for(int i=lock.length; i<lock.length*2; i++){
            for(int j=lock.length; j<lock.length*2; j++){
                extendsLock[i][j] = lock[i-lock.length][j-lock.length];
            }
        }
        if(keyCheck(extendsLock)==true){
            return isUnLock = true;
        }

        for(int w=0; w<4; w++){
            for(int i = 0; i<extendsLock.length-(key.length-1); i++){
                for(int j =0; j<extendsLock[i].length-(key.length-1); j++){
                    deepCopy(temp, extendsLock);
                    int row=0, col=0;
                    for(int k=i; k<key.length+i; k++){
                        for(int l= j; l<key.length+j; l++){
                            if(temp[k][l]==0&&key[row][col]==1){
                                temp[k][l]=key[row][col];
                                col++;
                            }
                            else if(temp[k][l]==1&&key[row][col]==0){
                                col++;
                            }
                            else if(temp[k][l]==1&&key[row][col]==1){
                                temp[k][l]+=key[row][col];
                                col++;
                            }
                            else{
                                col++;
                            }
                        }
                        col=0;
                        row++;
                    }
                    //print(temp);
                    //System.out.println("----------------");
                    if(keyCheck(temp)==true){
                        return isUnLock = true;
                    }
                }
            }
            //System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa");
            key= rotation(key);
        }
        return isUnLock;
    }

    public static void deepCopy(int[][] temp, int[][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                temp[i][j]= array[i][j];
            }
        }
    }
  
    public static int[][] rotation(int[][] key){
        int[][] rotateKey= new int[key.length][key.length];

        for(int i=0; i<key.length; i++){
            for(int j=0; j<key.length; j++){
                rotateKey[j][key.length-1-i]= key[i][j];
            }
        }
        return rotateKey;
    }
    
    public static boolean keyCheck(int[][] lock){
        boolean isUnlock =false;
        int count = 0;
        for(int i=lock.length/3; i<lock.length/3*2; i++){
            for(int j=lock[i].length/3; j<lock[i].length/3*2; j++){
                if(lock[i][j]==1){
                    count++;
                }
                else if(lock[i][j]==2){
                    return isUnlock;
                }
            }
        }
        if(count==(lock.length*lock.length)/9){
            isUnlock = true;
        }

        return isUnlock;
    }

      
    public static void print(int[][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    /* check
    public static boolean check(int[][] array,int[][] key){
        int[][] temp = array;
        boolean isT = false;
        for(int i=0; i<temp.length-2; i++){
            for(int j=0; j<temp.length-2; j++){
                int row=0, col =0;
                for(int k=i; k<key.length+i;k++){
                    for(int l= j; l<key.length+j; l++){
                        if(temp[k][l]==0&&key[row][col]==1){
                            temp[k][l]= key[row][col];
                            col++;
                        }
                        else if(temp[k][l]==1&&key[row][col]==0){
                            col++;
                        }
                        else{
                            col++;
                        }
                    }
                    col=0;
                    row++;
                }
                if(keyCheck(temp)==true){
                    return isT = true;
                }
                else{
                    temp = array;
                }
            }
        }

        return isT;
    }
    **/
    /*
    public static int[][] rightMove(int[][] key){
        int[][] rightMoveArray = new int[key.length][key.length];

        for(int i=0; i<key.length; i++){
            for(int j=0; j<key.length; j++){
                if(j==key.length-1){
                    rightMoveArray[i][0]=key[i][j]; 
                    break;       
                }
                rightMoveArray[i][j+1]=key[i][j];
            }
        }
        return rightMoveArray;
    }

    public static int[][] downMove(int[][] key){
        int[][] downMoveArray = new int[key.length][key.length];

        for(int i=0; i<key.length; i++){
            for(int j=0; j<key.length; j++){
                if(i==key.length-1){
                    downMoveArray[0][j]=key[i][j];
                }
                else{
                    downMoveArray[i+1][j]=key[i][j];
                }
            }
        }
        return downMoveArray;
    }
    */
    /*
    public static boolean unlock(int[][] lock, int[][] key){
        boolean isUnlook = false;
        int count=0;

        for(int i=0; i<)
        return isUnlook;
    }
    */
}

/**
 * class Solution {
    public boolean solution(int[][] key, int[][] lock) {
                boolean isUnLock = false;
        int[][] extendsLock = new int[lock.length*3][lock.length*3];
        int[][] temp = new int[extendsLock.length][extendsLock.length];

        for(int i=lock.length; i<lock.length*2; i++){
            for(int j=lock.length; j<lock.length*2; j++){
                extendsLock[i][j] = lock[i-lock.length][j-lock.length];
            }
        }
        if(keyCheck(extendsLock)==true){
            return isUnLock = true;
        }

        for(int w=0; w<3; w++){
            for(int i = 0; i<extendsLock.length-(key.length-1); i++){
                for(int j =0; j<extendsLock[i].length-(key.length-1); j++){
                    deepCopy(temp, extendsLock);
                    int row=0, col=0;
                    for(int k=i; k<key.length+i; k++){
                        for(int l= j; l<key.length+j; l++){
                            if(temp[k][l]==0&&key[row][col]==1){
                                temp[k][l]=key[row][col];
                                col++;
                            }
                            else if(temp[k][l]==1&&key[row][col]==0){
                                col++;
                            }
                            else if(temp[k][l]==1&&key[row][col]==1){
                                temp[k][l]+=key[row][col];
                                col++;
                            }
                            else{
                                col++;
                            }
                        }
                        col=0;
                        row++;
                    }
                    //print(temp);
                    //System.out.println("----------------");
                    if(keyCheck(temp)==true){
                        return isUnLock = true;
                    }
                }
            }
            key= rotation(key);
        }
        return isUnLock;
    }

    public static void deepCopy(int[][] temp, int[][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                temp[i][j]= array[i][j];
            }
        }
    }
  
    public static int[][] rotation(int[][] key){
        int[][] rotateKey= new int[key.length][key.length];

        for(int i=0; i<key.length; i++){
            for(int j=0; j<key.length; j++){
                rotateKey[j][key.length-1-i]= key[i][j];
            }
        }
        return rotateKey;
    }
    
    public static boolean keyCheck(int[][] lock){
        boolean isUnlock =false;
        int count = 0;
        for(int i=lock.length/3; i<lock.length/3*2; i++){
            for(int j=lock[i].length/3; j<lock[i].length/3*2; j++){
                if(lock[i][j]==1){
                    count++;
                }
            }
        }
        if(count==(lock.length*lock.length)/9){
            isUnlock = true;
        }

        return isUnlock;
    }

}
 */