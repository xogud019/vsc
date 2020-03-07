//kakao 19`2
public class FailureRateSolution{
    
    public static void solution(int N, int[] stages){
        if((N>500||N<1)||(stages.length<1||stages.length>200000)){
            System.out.println("too many or a few stages or N");
            return;
        }
        double[] failRate = new double[N];
        int[] result = new int[N];
        int totalPlayer = stages.length;
        int count=0;

        for(int i=0; i<N; i++){
            result[i]= i+1;
        }
        
        for(int i=0; i<N; i++){
            double temp= 0.0;
            for(int j=0; j<stages.length; j++){
                if(stages[j]==i+1){
                    count++;
                }
            }
            temp = (double)count/totalPlayer;
            if(count==0){
                failRate[i]=0;
            }
            else{
                failRate[i]=temp;
            }
            totalPlayer -=count;
            temp = 0;
            count = 0;
        }
        sort(failRate,result);

        System.out.print("[");
        for(int i=0; i<N; i++){
            System.out.print(result[i]);
            if(i!=N-1){
                System.out.print(",");
            }
            else{
                System.out.println("]");
            }
        }
    }

    public static void sort(double[] failRate, int[] result){
        int n = result.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(failRate[j]<failRate[j+1]){
                    double temp = failRate[j];
                    int temp1 = result[j];
                    failRate[j] = failRate[j+1];
                    result[j] = result[j+1];
                    failRate[j+1] = temp; 
                    result[j+1] = temp1; 
                }
                else if(failRate[j]==failRate[j+1]){
                    if(result[j]>result[j+1]){
                        double temp = failRate[j];
                        int temp1 = result[j];
                        failRate[j] = failRate[j+1];
                        result[j] = result[j+1];
                        failRate[j+1] = temp; 
                        result[j+1] = temp1;
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        
        int N = 5;
        int[] stages={2,1,2,6,2,4,3,3};
        /**int N =4;
        int[] stages = {4,4,4,4,4};*/
        solution(N, stages);
    }
}