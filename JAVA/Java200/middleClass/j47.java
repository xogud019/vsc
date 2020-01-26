public class j47{
    public static void main(String[] args){
        int range = 10;
        int start = 1;
        int a=0,b=0,c=0;
        while(a==b||b==c||a==c){
            a= (int)(range*Math.random()+start);
            b= (int)(range*Math.random()+start);
            c= (int)(range*Math.random()+start);
            System.out.printf("a=> %d, b=> %d, c=> %d",a,b,c);
            System.out.println();
        }

        System.out.printf("a=> %d, b=> %d, c=> %d",a,b,c);
    }
}