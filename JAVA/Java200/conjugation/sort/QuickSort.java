public class QuickSort{
    public QuickSort(){
    }
    
    public void QSort(int[] n,int start, int end){
        int mid = n[(start+end)/2];
        int left = start;
        int right = end;

        do{
            while((n[left]<mid)&&(left<end)){
                left++;
            }
            while((mid<n[right])&&(right>start)){
                right--;
            }

            if(left<=right){
                int temp = n[left];
                n[left] = n[right];
                n[right] = temp;
                left++;
                right--;
            }
        }while(left<right);

        if(start<right){
            QSort(n, start, right);
        }

        if(left<end){
            QSort(n, left, end);
        }
    }

    public void QSrot(int[] n){
        QSort(n, 0, n.length-1);
    }

    public void print(int[] n){
        for(int i=0; i<n.length; i++){
            System.out.print(n[i]+"\t");
            if((i+1)%10==0){
                System.out.println();
            }
        }
    }
}