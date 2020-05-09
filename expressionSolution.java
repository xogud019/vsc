public class expressionSolution {
    public static void main(String[] args){
        String ex = "100-200*300-500+20";
        int result = 0;
        result = solution(ex);
        
        System.out.println(result);
    }
    
    public static int solution(String ex){
        int result = 0;
        String temp ="";
        int[] resultArray= new int[6];
        String[] operArray = new String[100];
        int count=0;
        for(int i=0; i<ex.length(); i++){
            if(ex.charAt(i)=='-'||ex.charAt(i)=='*'||ex.charAt(i)=='+'){
                operArray[count]=Character.toString(ex.charAt(i));
                count++;
            }
        }
        print(operArray);
        
        String[][] array={{"\\+","\\-","\\*"},{"\\+","\\*","\\-"},{"\\-","\\*","\\+"},{"\\-","\\+","\\*"},{"\\*","\\+","\\-"},{"\\*","\\-","\\+"}};
        for(int i=0; i<array.length; i++){
            temp =ex;
            for(int j=0; j<array[i].length; j++){
                String[] numArray= temp.split(array[i][j]);
                
            }
            
        }
        return result;
    }

    public static void print(String[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void printC(char[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}