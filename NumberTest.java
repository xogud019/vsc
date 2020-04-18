class Number{
    int ranNum = (int)(Math.random()*100)+1;

    public String[] match(int[] n){
        String[] result = new String[n.length];

        for(int i=0; i<n.length; i++){
            if(this.ranNum>n[i]){
                result[i]="UP";
            }
            else if(this.ranNum<n[i]){
                result[i]="DOWN";
            }
            else{
                result[i]="MATCH";
            }
        }

        return result;
    }
}
public class NumberTest {
    public static void main(String[] args){
        int[] n= new int[10];
        for(int i = 0; i<n.length; i++){
            n[i]= (int)(Math.random()*100)+1;
        }
        Number num = new Number();
        String[] result = new String[n.length];
        result= num.match(n);

        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();

    }
}