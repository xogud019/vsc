public class handPhoneSolution {
    public static void main(String[] args){
        int[] numbers ={7,0,8,2,8,3,1,5,7,6,2};
        String hand = "left";
        String answer = solution(numbers, hand);
        System.out.println(answer);
    }
    public static String solution(int[] numbers, String hand){
        String answer ="";
        int[][] board={{1,2,3},{4,5,6},{7,8,9},{100,0,100}};
        int temp=100;
        int temp1=100;
        int rx =3, ry=2;
        int lx =3, ly=0;
        int ix =0, iy=0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==1||numbers[i]==4||numbers[i]==7){
                answer += "L";
                temp= numbers[i];
            }
            else if(numbers[i]==3||numbers[i]==6||numbers[i]==9){
                answer+="R";
                temp1= numbers[i];
            }
            else{
                    
                for(int j=0; j<board.length;j++){
                    for(int k=0;k<board[j].length; k++){
                        if(board[j][k]==temp){
                            lx=j;
                            ly=k;
                            }
                        else if(board[j][k]==temp1){
                                rx =j;
                                ry= k;
                            }
                            else if(board[j][k]==numbers[i]){
                                ix=j;
                                iy=k;
                            }
                        }
                    }
                    if(Math.abs(ix-rx)+Math.abs(iy-ry)<Math.abs(ix-lx)+Math.abs(iy-ly)){
                        answer+="R";
                        temp1= numbers[i];
                        
                    }
                    else if(Math.abs(ix-rx)+Math.abs(iy-ry)==Math.abs(ix-lx)+Math.abs(iy-ly)){
                        if(hand.equals("right")){
                            answer+="R";                                temp1=numbers[i];
                            }
                        else{
                            answer+="L";
                            temp=numbers[i];
                        }
                    }
                    else{
                        answer+="L";                            temp= numbers[i];
                    }                            
            }
        }
        return answer;

    }
}