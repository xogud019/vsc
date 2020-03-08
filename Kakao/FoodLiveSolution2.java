//kakao 19`4 efficiency
public class FoodLiveSolution2{
    public static int solution(int[] foodTimes, long k){
        //error list
        if(foodTimes.length<1||foodTimes.length>200000){
            System.out.println("foodtime length error");
            return -2;
        }
        for(int i=0; i<foodTimes.length; i++){
            if(foodTimes[i]<1||foodTimes[i]>100000000){
                System.out.println("food time elements error");
                return -3;
            }
        }
        if(k<1||k>20000000000000L){
            System.out.println("k size error");
            return -4;
        }
        //error end
        int[] food = foodTimes;
        int[] index = new int[food.length];
        int count=0;
        int totalCount=0;
        int N=0;

        for(int i=0; i<index.length; i++){
            index[i]= i+1;
        }
        //using a sort: 7->5
        sort(food, index);

        while(true){
            if(isEnd(N, food.length)){
                N=0;
            }

            if(count == k){
                int foodCount=0;
                while(food[N]==0){
                    N++;
                    if(isEnd(N, food.length)){
                        N=0;
                    }
                    foodCount++;
                    if(foodCount==food.length){
                        return totalCount;
                    }
                }
                return totalCount;
            }
            else{
                if(food[N]==0){
                    totalCount++;
                    int foodCount =0;
                    while(food[N]==0){
                        N++;
                        if(isEnd(N, food.length)){
                            N=0;
                        }
                        totalCount++;
                        foodCount++;
                        if(foodCount==food.length){
                            return -1;
                        }
                    }
                    totalCount++;
                    food[N] -=1;
                    N++;
                }
                else{
                    totalCount++;
                    food[N] -=1;
                    N++;
                }
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

    public static void sort(int[] food, int[] index){
        for(int i=0; i<food.length; i++){
            for(int j=0; j<food.length-1; j++){
                if(food[j]<food[j+1]){
                    int temp= food[j];
                    int temp1= index[j];
                    food[j]= food[j+1];
                    index[j]= index[j+1];
                    food[j+1]= temp;
                    index[j+1]= temp1;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] foodTimes ={3,1,2};
        long k= 5;
        int n=solution(foodTimes, k);
        System.out.println(n);
    }
}