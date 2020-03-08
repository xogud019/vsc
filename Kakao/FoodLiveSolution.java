//kakao 19`4 accuracy
public class FoodLiveSolution{
    public static int solution(int[] foodTimes, int k){
        //error list
        if(foodTimes.length<1||foodTimes.length>2000){
            System.out.println("foodtime length error");
            return -2;
        }
        for(int i=0; i<foodTimes.length; i++){
            if(foodTimes[i]<1||foodTimes[i]>1000){
                System.out.println("food time elements error");
                return -3;
            }
        }
        if(k<1||k>2000000){
            System.out.println("k size error");
            return -4;
        }
        //error end
        int[] food = foodTimes;
        int count=0;
        int N=0;

        while(true){
            if(isEnd(N, food.length)){
                N=0;
            }

            if(count == k){
                int foodCount=0;
                while(food[N]==0){
                    if(isEnd(N, food.length)){
                        N=0;
                    }
                    foodCount++;
                    N++;
                    if(foodCount==food.length){
                        return -1;
                    }
                }
                return N+1;
            }

            if(food[N] ==0){
                N++;
            }else{
                food[N] -= 1;
                N++;
            }

            count++;
        }
    }

    public static boolean isEnd(int N, int length){
        boolean isE = false;
        if(N%length==0){
            return isE = true;
        }
        else{
            return isE;
        }
    }

    public static void main(String[] args){
        int[] foodTimes ={2,1,1};
        int k= 3;
        
        int n=solution(foodTimes, k);
        System.out.println(n);
    }
}