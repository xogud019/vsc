public class j78{
    public static void main(String[] args){
        String[] myNum = new String[]{"1995-01-01","1994-03-20"};
        String[] myNum2 = {"1995-01-01","1994-03-20"};
        
        System.out.println(myNum2[0]);
        print(myNum);

        myNum = new String[]{"1999-02-12","1992-03-04","1992-05-31"};
        print(myNum);

        String[] tos = new String[myNum.length];
        System.arraycopy(myNum, 0, tos, 0, myNum.length);
        print(tos);
    }

    /*public static void print(String[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
    }*/

    public static void print(String[] a){
        for(String ss:a){
            System.out.printf(ss+"\t");
        }
        System.out.println();
    }
}