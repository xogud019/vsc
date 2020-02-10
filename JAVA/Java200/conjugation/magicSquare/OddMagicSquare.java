//j114+j115
public class OddMagicSquare{
    private int [][] magic;
    private int n; //magic square`s size:n*n

    public int[][] getMagic(){
        return magic;
    }

    public OddMagicSquare(int n){
        magic = new int[n][n];
        this.n = n;
    }

    public OddMagicSquare(){
        this(5);
    }

    public void make(){
        int x=0;
        int y=n/2;

        for(int i=1; i<=n*n;i++){
            int temX = x;
            int temY = y;
            System.out.print("("+x + y+")"+"\t");
            magic[x][y] = i;

            if(x-1<0){
                x=n-1;
            }
            else{
                x--;
            }

            if(y-1<0){
                y=n-1;
            }
            else{
                y--;
            }

            if(magic[x][y]!=0){
                x= temX+1;
                y= temY;
            }
        }
    }

    public void print(){
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(magic[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public void printAll(){
        System.out.println();
        System.out.println(n + "is magic? "+isMagic());
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                System.out.print(magic[i][j]+"\t");
            }
            System.out.println();
        }
    }

    private int sumRow(int row){
        int tot = 0;
        for(int i=0; i<n;i++){
            tot += magic[row][i];
        }
        return tot;
    }

    private int sumCal(int cal){
        int tot =0;
        for(int i=0; i<n; i++){
            tot += magic[i][cal];
        }
        return tot;
    }

    private int sumRDia(){
        int tot= 0;
        for(int i=0; i<n; i++){
            tot += magic[i][n-1-i];
        }
        return tot;
    }

    private int sumDia(){
        int tot =0;
        for(int i=0; i<n; i++){
            tot += magic[i][i];
        }
        return tot;
    }

    private boolean isMagic(){
        boolean isM = true;
        int[] m= new int[2*n+2];

        for(int i=0; i<n; i++){
            m[i] = sumRow(i);
            m[i+n] = sumCal(i);
        }
        m[2*n] = sumDia();
        m[2*n+1] = sumRDia();

        for(int i=0; i<m.length; i++){
            if(m[0]==0||m[0]!=m[i]){
                isM=false;
                break;
            }
        }

        return isM;

    }
}