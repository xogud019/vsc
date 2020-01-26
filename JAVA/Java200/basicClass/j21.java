public class j21{
    public static void main(String[] args){
        int[] score = {98,89,87};
        int sum = 0;
        for(int i=0; i<=2;i++){
            sum += score[i];
        }

        System.out.println(sum);
        System.out.println((double)sum/3);

    }
}