public class j39{
    public static int intNum(char c){
        int tot= 0;
        switch(c){
            case 'A' : tot = 1;
            break;
            case 'J' : tot = 10;
            break;
            case 'Q' : tot = 11;
            break;
            case 'K' : tot = 12;
            break;
            default : tot= c-'0';
            break;
        }
        return tot;
    }

    public static void main(String[] args){
        char c= 'B';
        int result = intNum(c);

        System.out.println(c + "=>" + result);
    }
}