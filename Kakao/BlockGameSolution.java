package Kakao;
public class BlockGameSolution{
    
    public static int solution(int[][] board){
        int count =0, maxNum = 0;
        int[][] temp = board;
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j]>maxNum){
                    maxNum=board[i][j];
                }
            }
        }
        
        for(int i=0; i<maxNum; i++){
            fillBlack(temp);
            if(isCanClear1(temp,maxNum)==true){
                count++;
                fillZero(temp);
            }
            else if(isCanClear2(temp,maxNum)==true){
                count++;
                fillZero(temp);
            }
        }
        print(temp);
        return count;
    }

    public static boolean isCanClear1(int[][] board,int maxNum){
        boolean isC = false;
        int num=1;
        int count = 0;
        while(true){
            for(int i=0; i<board.length-1; i++){
                for(int j=0; j<board[i].length-2; j++){
                    int count9 =0;
                    int numCount =0;
                    int[][] rec1 = {{board[i][j],board[i][j+1],board[i][j+2]},
                                    {board[i+1][j],board[i+1][j+1],board[i+1][j+2]}};
                    for(int k=0; k<rec1.length; k++){
                        for(int l=0; l<rec1[k].length; l++){
                            //System.out.print(rec1[k][l]+" ");
                            if(rec1[k][l]==9){
                                count9++;
                            }
                            else if(rec1[k][l]==num){
                                numCount++;
                            }
                        }
                        //System.out.println();
                        if(count9==2&&numCount==4){
                            board[i][j]=0;
                            board[i][j+1]=0;
                            board[i][j+2]=0;
                            board[i+1][j]=0;
                            board[i+1][j+1]=0;
                            board[i+1][j+2]=0;
                            return isC=true;
                        }
                    }
                }
            }
            num++;
            count++;
            if(count==maxNum){
                break;
            }
        }
        return isC;
    }

    public static boolean isCanClear2(int[][]board,int maxNum){
        boolean isC = false;
        int num=1;
        int count = 0;
        while(true){
            for(int i=0; i<board.length-2; i++){
                for(int j=0; j<board[i].length-1; j++){
                    int count9 =0;
                    int numCount =0;
                    int[][] rec2 = {{board[i][j],board[i][j+1]},
                                    {board[i+1][j],board[i+1][j+1]},
                                    {board[i+2][j],board[i+2][j+1]}};
                    for(int k=0; k<rec2.length; k++){
                        for(int l=0; l<rec2[k].length; l++){
                            //System.out.print(rec2[k][l]+" ");
                            if(rec2[k][l]==9){
                                count9++;
                            }
                            else if(rec2[k][l]==num){
                                numCount++;
                            }
                        }
                        //System.out.println();
                        if(count9==2&&numCount==4){
                            board[i][j]=0;
                            board[i][j+1]=0;
                            board[i+1][j]=0;
                            board[i+1][j+1]=0;
                            board[i+2][j]=0;
                            board[i+2][j+1]=0;
                            return isC=true;
                        }
                    }
                    //System.out.println();
                }
            }
            num++;
            count++;
            if(count==maxNum){
                break;
            }
        }
        return isC;
    }

    public static void print(int[][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void fillBlack(int[][] board){
        for(int j=0; j<board[0].length; j++){
            for(int i=0; i<board.length; i++){
                if(board[i][j]!=0&&i!=0){
                    board[i-1][j]=9;
                    break;
                }
                else if(board[i][j]==0&&i==board.length-1){
                    board[i][j]=9;
                }
                else if(board[i][j]!=0&&i==0){
                    break;
                }
            }
        }
    }
    
    public static void fillZero(int[][] board){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j]==9){
                    board[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args){
        
        int[][] board = {
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,4,0,0,0},
            {6,0,0,0,0,4,4,0,0,0},
            {6,0,0,0,3,0,4,0,0,0},
            {6,6,0,2,3,0,0,0,5,5},
            {1,2,2,2,3,3,0,0,0,5},
            {1,1,1,0,0,0,0,0,0,5}};
        
        /*
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
        */
        int result= solution(board);

        System.out.println(result);
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