public class j61{

    public static final int BITMASK = 1;

    public String makeBit(int n){
        char[] val = new char[32];
        for(int i = 31 ; i>=0;i--){
            if((n&BITMASK)==1){
                val[i] = '1';
            }
            else{
                val[i]='0';
            }
            n>>>=1;
        }
        return new String(val);
    }

    public static void main(String[] args){
        int ival = 2345;
        int lval = -2345;
        j61 bit = new j61();
        String vals = bit.makeBit(ival);
        System.out.println(vals);

        vals = bit.makeBit(lval);
        System.out.println(vals);
    }
}