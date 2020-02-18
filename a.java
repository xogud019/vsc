public class a{
    public static void main(String[] args){
        //double[][] basic ={{1,2,3},{2,3,4},{3,4,5}};
        //double[][] basic1 ={{2,3,1},{4,1,-3},{-1,2,2}};
        double[] y = {-4,-2,2};

        Matrix s1= new Matrix(y);
        s1.print1();
        /*
        Matrix A = new Matrix(basic1);
        A.print();
        Matrix B = new Matrix(y);
        B.print();
        Matrix R = MatrixUtil.revMatrix(A);
        R.print();
        Matrix E = MatrixUtil.mulMatrix(R, A);
        E.print();
        Matrix X = MatrixUtil.mulMatrix(R, B);
        X.print();
        /*Matrix s0 = new Matrix(basic);
        s0.print();
        double[][] x2= {{0,1,0},{0,0,1},{1,0,0}};
        double[][] x1= {{0,0,1},{1,0,0},{0,1,0}};

        Matrix mx2 = new Matrix(x2);
        Matrix mx1 = new Matrix(x1);

        Matrix s1 = MatrixUtil.addMatrix(mx2, s0);
        s1.print();
        Matrix s2 = MatrixUtil.differMatrix(mx1, s0);
        s2.print();
        Matrix s3 = MatrixUtil.mulMatrix(s0, mx1);
        s3.print();*/
    }
}