public class j53{
    public static void main(String[] args){
        int oddTot =0;
        int evenTot = 0;
        
        for (int i=0; i<=100; i++){
            if(i%2!=0){
                oddTot +=i;
            }
            else{
                evenTot +=i;
            }
        }

        System.out.println(oddTot);
        System.out.println(evenTot);
        System.out.println(oddTot+evenTot);
    }
}