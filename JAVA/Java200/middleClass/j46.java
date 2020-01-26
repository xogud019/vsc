public class j46{
    public static void main(String[] args){
        int range = 10;
        int start = 1;
        int a=0,b=0,c=0;
        while(true){
            a= (int)(range*Math.random()+start);
            b= (int)(range*Math.random()+start);
            c= (int)(range*Math.random()+start);
            System.out.printf("a=> %d, b=> %d, c=> %d",a,b,c);
            System.out.println();

            if(a!=b&&a!=c&&c!=b){
                break;
            }
        }

        System.out.printf("a=> %d, b=> %d, c=> %d",a,b,c);
    }
}