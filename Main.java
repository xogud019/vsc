
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str = "))()))((((";
        System.out.println(recurCheck(str));
    }

    static 
    boolean isRight(String str) {
        int count = 0;
        boolean isRight = true;

        for(int i = 0 ; i < str.length(); i++) {
            if(str.charAt(i) == '(')
                count++;
            else
                count--;

            if(count < 0 ) {
                isRight = false;
            }
        }
        return isRight;
    }

    public static int firstBalance(String str) {
        int count = 0;

        for(int i = 0 ; i < str.length(); i++) {
            if(str.charAt(i) == '(')
                count++;
            else
                count--;

            if(count == 0 ) {
                return i;
            }
        }

        return -1;
    }

    public static String recurCheck(String str) {
        String u = "";
        String v = "";
        String resultStr = "";

        if(isRight(str)) 
            return str;
        else {
            
            if(str.length() >= 2) {
                u += str.substring(0, firstBalance(str) +1);
                v += str.substring(firstBalance(str) + 1, str.length());
            }

           
            if(isRight(u)) {
                return u + recurCheck(v);
            }else {
                resultStr += "("+recurCheck(v)+")";
                u = u.substring(1 , u.length() - 1);

                StringBuilder newU = new StringBuilder(u);
                for(int i = 0; i < u.length(); i++) {
                    if(u.charAt(i)=='(') {
                        newU.setCharAt(i, ')');
                    }else {
                        newU.setCharAt(i, '(');
                    }
                }
                resultStr += newU.toString();
                return resultStr;
            }
        }
    }
}