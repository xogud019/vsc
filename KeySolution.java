
public class KeySolution {
    public static void main(String[] args){
        int[][] key ={{0,0,0},{1,0,0},{0,1,1}};
        int[][] lock ={{1,1,1},{1,1,0},{1,0,1}};
        boolean result = false;

        result = solution(lock,key);
        System.out.println(result);
    }

    public static boolean solution(int[][] lock, int[][] key){
        boolean isUnLock = false;
        int[][] extendsLock = new int[lock.length*3][lock.length*3];
        int[][] temp = extendsLock;
        for(int i=lock.length; i<lock.length*2; i++){
            for(int j=lock.length; j<lock.length*2; j++){
                extendsLock[i][j] = lock[i-lock.length][j-lock.length];
            }
        }

        for(int i=0; i<extendsLock.length-2; i++){
            for(int j=0; j<extendsLock.length-2; j++){
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
                    return isUnLock = true;
                }
                else{
                    temp = extendsLock;
                }
            }
        }
        //print(extendsLock);
        return isUnLock;
    }
    public static void print(int[][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
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
            for(int j=lock.length/3; j<lock.length/3*2; j++){
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