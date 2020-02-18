public class test{
    public static double[] toTwoOne(double[][] n){
        int a = n.length;
        int m = n[0].length;
        double []c = new double[a*m];
        for(int i=0; i<a*m; i++){
            c[i]=n[i/a][i%m];
        }
        return c;
    }

    public static double[][] toOneTwo(double[] n){
        int count = n.length;
        int a = Math.abs(count);
        int m = Math.abs(count);
        double[][] c= new double[a][m];

        for(int i=0; i<count; i++){
            c[i/a][i%m]=n[i];
        }

        return c;
    }

    public static void main(String[] args){
        double[][] a = {{1,2,3},{2,3,4},{3,4,5}};
        double[] n= new double[a.length*a[0].length];
        double[][] c= new double[Math.abs(n.length)][Math.abs(n.length)];
        n = toTwoOne(a);
        c = toOneTwo(n);

        for(int i=0; i<n.length; i++){
            System.out.print(n[i]+"\t");
        }
        System.out.println();
        System.out.println("--");

        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[i].length; j++){
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }

    }
}