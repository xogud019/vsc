import java.util.*;

public class TextGame {
    public static void main(String[] args){
        String[][] board = new String[10][10];
        board= CreateBoard();
        Scanner scan = new Scanner(System.in);

        Player player= new Player();
        Gold gold = new Gold();
        Monster monster = new Monster();
        while(true){
            board[player.x][player.y]="P";
            board[monster.x][monster.y]="M";
            board[gold.x][gold.y]="G";
            print(board);
            System.out.print("input: w, a, s, d :");
            char c=scan.next().charAt(0);
            board[player.x][player.y]="0";
            player.move(c);
            board[monster.x][monster.y]="0";
            monster.move(c);
            if(board[player.x][player.y]=="G"){
                System.out.println("you Win");
                scan.close();
                break;
            }
            else if(monster.x==player.x&&monster.y==player.y){
                System.out.println("you ard lose");
                scan.close();
                break;
            }
        }
        
      
    }

    public static void print(String[][] array){
        for(int i =0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static String[][] CreateBoard(){
        String[][] board = new String[10][10];
        for(int i =0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(i==0||j==0||i==9||j==9){
                    board[i][j]="#";
                }
                else{
                    board[i][j]="0";
                }
            }
        }
        return board;
    }
}

interface Sprite{
    public void move(char c);
}

class Player implements Sprite{
    int x =3, y=3;

    public void move(char c){
        if(c=='w'){
            x--;
            if(x<1){
                x=8;
            }
        }
        else if(c=='a'){
            y--;    
            if(y<1){
                y=8;
            }
        }
        else if(c=='d'){
            y++;
            if(y>8){
                y=1;
            }
        }
        else if(c=='s'){
            x++;
            if(x>8){
                x=1;
            }
        }
    }
}

class Monster implements Sprite{
    int x=7,y=7;
    public void move(char c){
        x+= (Math.random()-0.5)>0? 1:-1;
        if(x>8){
            x=1;
        }
        else if(x<1){
            x=8;
        }
        y+= (Math.random()-0.5)>0? 1:-1;
        if(y>8){
            y=1;
        }
        else if(y<1){
            y=8;
        }
    }
}

class Gold implements Sprite{
    int x=0;
    int y=0;

    public Gold(){
        do{
            this.x= (int)(Math.random()*8)+1;
            this.y= (int)(Math.random()*8)+1;
        }while((this.x==3&&this.y==3)||(this.x==7&&this.y==7));
    }
    public void move(char c){

    }
}