public class j79{
    public static void main(String[] args){
        System.out.println("Second Demamtion Matrix:1");
        int [][]a = new int[4][3];
        a[0][0] = 1;
        a[0][1] = 2;
        println(a);

        System.out.println("Second Demamtion Matrix:2");
        int[][] b = new int[3][];
        b[0] = new int[4];
        b[1] = new int[5];
        b[2] = new int[3];
        println(b);

        System.out.println("Second Demamtion Matrix:3");
        int[][] c = new int[][]{{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7}}; 
        println(c);

        System.out.println("Second Demamtion Matrix:4");
        int[][] d= {{1,2,3,4,5},{2,3,4,5,6}};
        println(d);

        System.out.println("copy1");
        int[][] e= new int[c.length][c[0].length];
        for(int i=0; i<c.length;i++){
            System.arraycopy(c[i], 0, e[i], 0, e[i].length);
        }
        println(e);

    }

    public static void println(int [][]a){
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a[i].length;j++){
                System.out.print("["+a[i][j]+"]");
            }
            System.out.println();
        }
    }
}