public class j38{

    public static String textInfo(j38E index, double value){
        String result = "";
        switch(index){
            case PHY : result = "body:";
            break;
            case MIND : result = "mind:";
            break;
            case EMO : result  = "emotion";
            break;
            }
            return result +(value*100);
    }
    public static void main(String[] args){
        j38E index = j38E.PHY;
        double value = 0.88;
        System.out.println(index.getPei());
        String s= textInfo(index, value);
        System.out.println(s);
        System.out.println(index.ordinal());
        System.out.println(index.name());
        System.out.println(index);
        System.out.println(index.getPei());
    }
}