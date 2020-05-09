import java.util.*;
public class stackSolution{
    public static void main(String[] args){
        
        int[][] board = {{0,0,0,0,0},
                        {0,0,1,0,3},
                        {0,2,5,0,1},
                        {4,2,4,4,2},
                        {3,5,1,3,1}};
                        
        int[] moves ={1,5,3,5,1,2,1,4};
        int answer = solution(board, moves);
        System.out.println(answer);
    }   
    public static int solution(int[][] board, int[] moves){
        Stack<Integer> stack = new Stack<>();
        int answer =0;

        for(int i=0; i<moves.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[j][moves[i]-1]==0){
                    continue;
                }
                else{
                    if(stack.isEmpty()==true){
                        stack.add(board[j][moves[i]-1]);
                        board[j][moves[i]-1]=0;
                        break;
                    }
                    else{
                        if(stack.peek()==board[j][moves[i]-1]){
                            stack.pop();
                            board[j][moves[i]-1]=0;
                            answer++;
                            break;
                        }
                        else{
                            stack.add(board[j][moves[i]-1]);
                            board[j][moves[i]-1]=0;
                            break;
                        }
                    }
                }
            }
        }
        return answer*2;
        
    }
}