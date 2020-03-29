public class test{
    public static void main(String[] args){
        int[][] array = {
            {9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9},
            {9,9,9,9,9,9,9,9,9,9},
            {1,9,9,9,9,9,9,9,9,9},
            {1,1,1,9,9,9,9,9,9,9}};
        
        int n=array.length;
        int m = array[0].length;
        
        boolean isCC = false;
        int[][] rectangleType1 = new int[2][3];
        
        //type1 check
        int num=1;

        for(int j=0; j<m-2; j++){
            for(int i=0; i<n-1; i++){    
                int count = 0;
                int BlackBlockCount = 0;
                int numCount = 0;
                //System.out.println(i);
                for(int k=i; k<rectangleType1.length+i; k++){
                    for(int l = j; l<rectangleType1[0].length+j; l++){
                        //System.out.print(array[k][l]+" ");
                        
                        if(array[k][l]==0){
                            count++;
                        }
                        else if(array[k][l]==9){
                            BlackBlockCount++;
                        }
                        else if(array[k][l]==1){
                            numCount++;
                        }
                        
                    }
                   // System.out.println();
                }  
                
                if(count ==0 && BlackBlockCount == 2 &&numCount==4){
                    isCC=true;
                }
                
                //System.out.println(count);
                //System.out.println(BlackBlockCount);
                //System.out.println(numCount);
                num++; 
            }
        }

        System.out.println(isCC);

    }

}