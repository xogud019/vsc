//j139+140
public class sNail{
    private int n;              //row
    private int m;              //column
    private int[][] nail;

    public sNail(int n, int m){
        super();
        this.n= n;
        this.m= m;
        this.nail = new int[n][m];
    }

    public void make(){
        int x = 0;
        int y = 0;
        int d =0;
        //int num=1;
        for(int i=0; i<nail.length; i++){
            for(int j=0; j<nail[0].length;j++){
                nail[x][y]=i*nail.length+j+1;
                if(d==0){
                    if(y+1<nail[0].length&&nail[x][y+1]==0){
                        y++;
                        //num++;
                    }
                    else{
                        d=1;
                        x++;
                        //num++;
                    } 
                }
                else if(d==1){
                    if(x+1<nail.length&&nail[x+1][y]==0){
                        x++;
                        //num++;
                    }
                    else{
                        d=2;
                        y--;
                        //num++;
                    }
                }
                else if(d==2){
                    if(y-1>=0&&nail[x][y-1]==0){
                        y--;
                        //num++;
                    }
                    else{
                        d=3;
                        x--;
                        //num++;
                    }
                }
                else if(d==3){
                    if(x-1>=0&&nail[x-1][y]==0){
                        x--;
                        //num++;
                    }
                    else{
                        d=0;
                        y++;
                        //num++;
                    }
                }
            }
        }
    }

    public void reverseMake(){
        int x = 0;
        int y = 0;
        int d = 0;

        for(int i=0; i<nail.length; i++){
            for(int j=0; j<nail[0].length;j++){
                nail[x][y]=i*nail.length+j+1;

                if(d==0){
                    if(x+1<nail[0].length&&nail[x+1][y]==0){
                        x++;
                    }
                    else{
                        d=1;
                        y++;
                    } 
                }
                else if(d==1){
                    if(y+1<nail.length&&nail[x][y+1]==0){
                        y++;
                    }
                    else{
                        d=2;
                        x--;
                    }
                }
                else if(d==2){
                    if(x-1>=0&&nail[x-1][y]==0){
                        x--;
                    }
                    else{
                        d=3;
                        y--;
                    }
                }
                else if(d==3){
                    if(y-1>=0&&nail[x][y-1]==0){
                        y--;
                    }
                    else{
                        d=0;
                        x++;
                    }
                }
            }
        }
    }

    public void print(){
        for(int i=0; i<nail.length; i++){
            for(int j=0; j<nail[0].length;j++){
                System.out.print(nail[i][j]+"\t");
            }
            System.out.println();
        }
    }
    /*
    public void clear(){
        for(int i=0; i<nail.length;i++){
            for(int j=0; j>nail[0].length; j++){
                nail[i][j]=0;
            }
        }
    }*/
}