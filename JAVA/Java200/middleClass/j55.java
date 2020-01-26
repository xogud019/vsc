public class j55{
    public static void print(int ... mm){
        for(int m:mm){
            System.out.println(m);
        }
    }

    public static void main(String[] args){
        int[]mm= {1,2,3,4,5};
        print(mm);
        int a = 1;
        int b = 2;
        print(a,b);
    }
}