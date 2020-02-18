//j144
public class Apartment{
    private char[] pass= {'0','1','2','3','4','5','6','7','8','9'};
    private int d=0;
    
    public Apartment(int d){
        this.d=d;
    }

    public int findApart(char region[][], int x, int y, char step, int depth){
        int count =0;
        int right = region.length;
        int bottom = region[0].length;

        if(x<0||x>=bottom||y<0||y>=right||region[x][y]!='*'){
            return 0;
        }

        region[x][y]= pass[depth%10];
        count = 1+findApart(region, x, y-1, step, depth+1)
                +findApart(region, x+1, y, step, depth+1)
                +findApart(region, x, y+1, step, depth+1)
                +findApart(region, x-1, y, step, depth+1);
        
        if(d>0){
            count = 1+findApart(region, x+1, y-1, step, depth+1)
                    +findApart(region, x+1, y+1, step, depth+1)
                    +findApart(region, x-1, y+1, step, depth+1)
                    +findApart(region, x-1, y-1, step, depth+1);
            
        }
        
        region[x][y]=step;
        print(region);
        return count;
    }

    public static void print(char c[][]){
        int count = c.length;
        for(int i=0; i<count; i++){
            for(int j=0; j<count; j++){
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int d = 0;
        Apartment apt= new Apartment(d);
        char region[][] = {{'*','0','0'},{'0','*','0'},{'0','*','*'}};

        int right = region.length;
        int bottom = region[0].length;
        int count =0;
        char steps[] = new char[26];
        for(int i=0; i<steps.length; i++){
            steps[i]= (char)('A'+1);
        }

        int []sizes = new int[bottom+right];
        int blockNums = 0;
        for(int iy=0; iy<right; iy++){
            for(int ix=0; ix<bottom; ix++){
                count = apt.findApart(region, ix, iy, steps[blockNums], 0);
                if(count>0){
                    sizes[blockNums++] = count;
                }
            }
        }

        System.out.print("Apt`s num->"+blockNums);
        for(int ix=0; ix<blockNums; ix++){
            System.out.println(steps[ix]+"apt`s num->"+sizes[ix]);
        }

    }
}