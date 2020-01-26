public class j45{
    public static void showOddEven(int n){
        for(;n!=1;){
            if(n%2 ==0){
                n = n/2;
            }
            else{
                n = n*3+1;
            }
            System.out.println("["+n+"]");
        }
    }

    public static void main(String[] args){
        int n = 121;
        showOddEven(n);
    }
}