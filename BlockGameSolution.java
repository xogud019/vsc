public class BlockGameSolution{
    
    public static int solution(int[][] board){
        int result =0;
        int maxNumBlock = 0;
        int row = board.length;
        int col = board[0].length;
        /*
        int[][] tempArray1 = new int[2][3];
        int[][] tempArray2 = new int[3][2];
        */
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(board[i][j]>maxNumBlock){
                    maxNumBlock = board[i][j];
                }
            }
        }

        for(int i=1; i<maxNumBlock+1; i++){
            int[][] temp = new int[row][col];
            for(int j=0; j<row; j++){
                for(int k=0; k<col; k++){
                    if(board[j][k]==i){
                        temp[j][k]=board[j][k];
                    }
                }
            }
            fillBlackBlock(temp);
            print(temp);
            
            System.out.println(isCanClear(temp,i));
            
            
        }

        //print(board);
        return maxNumBlock;
        //return result;
    }

    public static void fillBlackBlock(int[][] board){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j]==0 && i!=0){
                    if(board[i-1][j] == 0 || board[i-1][j] == 9){
                        board[i][j] = 9;
                    }
                }

                else if(i==0){
                    if(board[i][j]==0){
                        board[i][j]=9;
                    }
                }
            }
        }
    }

    public static boolean isCanClear(int[][] board,int num){
        boolean isCC = false;
        int[][] rectangleType1 = new int[2][3];
        int[][] rectangleType2 = new int[3][2];
        //type1 check
        

        for(int j=0; j<board[0].length-2; j++){
            for(int i=0; i<board.length-1; i++){   
                int count = 0;
                int BlackBlockCount = 0;
                int numCount = 0;
                for(int k=i; k<rectangleType1.length+i; k++){
                    for(int l = j; l<rectangleType1[0].length+j; l++){
                        if(board[k][l]==0){
                            count++;
                        }
                        else if(board[k][l]==9){
                            BlackBlockCount++;
                        }
                        else if(board[k][l]==num){
                            numCount++;
                        }
                    }
                }
                if(count ==0 && BlackBlockCount != 6 &&numCount==4){
                    return isCC=true;
                }
            }
        }
        
        //type2 check
        num=1;
        for(int j=0; j<board[0].length-1; j++){
            for(int i=0; i<board.length-2; i++){  
                int count = 0;
                int BlackBlockCount = 0;
                int numCount = 0;
                for(int k=i; k<rectangleType2.length+i; k++){
                    for(int l = j; l<rectangleType2[0].length+j; l++){
                        if(board[k][l]==0){
                            count++;
                        }
                        else if(board[k][l]==9){
                            BlackBlockCount++;
                        }
                        else if(board[k][l]==num){
                            numCount++;
                        }
                    }
                }
                if(count ==0 && BlackBlockCount != 6 && numCount==4){
                    isCC=true;
                }
                
            }
        }
        
        return isCC;
    }
    public static boolean upClear(int[][] board){
        boolean isC = false;

        return isC;
    }

    public static void print(int[][] temp){
        for(int i=0; i<temp.length; i++){
            for(int j=0; j<temp[i].length; j++){
                    System.out.print(temp[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] board = {
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,4,0,0,0},
            {0,0,0,0,0,4,4,0,0,0},
            {0,0,0,0,3,0,4,0,0,0},
            {0,0,0,2,3,0,0,0,5,5},
            {1,2,2,2,3,3,0,0,0,5},
            {1,1,1,0,0,0,0,0,0,5}};
        
        int result= solution(board);

      //  System.out.println(result);
    }
}

/*
1       1         1      1
111     1       111     111
        11       
 1
 1
11

*/