public class j44{

    public static void showOddEven(int n){
        do{
           
            if(n%2 ==0){
                n = n/2;
            }
            else{
                n = n*3+1;
            }
            System.out.println("["+n+"]");
        
        }while(n!=1);
    }
    public static void main(String[] args) {
        int n= 124;
        showOddEven(n);
    }
}