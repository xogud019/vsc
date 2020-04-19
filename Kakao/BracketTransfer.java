
public class BracketTransfer {
    public static void main(String[] args){
        String s = "()()((()))())))(((";
        String result = Solution(s);
        System.out.print(result);
        
    }

    public static String Solution(String s){
        
        String result =test(s);
        return result;

    }
    
    public static String test(String s){
        String ss = s;
        
        String u=s.substring(0,balancedBracket(ss));
        String v=s.substring(balancedBracket(ss),ss.length());
        if(ss==""){
            return "";
        }
        else{
            if(rightBracket(u)==true&&rightBracket(v)!=true){
                return u+test(v);
            }
            else if(rightBracket(u)==true&&rightBracket(v)==true){
                return u+v;
            }
            else{
                String m = "("+test(v)+")";
                String n="";
                String temp = u.substring(1,u.length()-1);
                for(int i =0; i<temp.length(); i++){
                    if(temp.charAt(i)=='('){
                        n+=')';
                    }
                    else if(temp.charAt(i)==')'){
                        n+='(';
                    }
                }
                return m+n;
            }
        }
    }
    
    public static int balancedBracket(String s){
        int LCount =0;
        int RCount = 0;

        for(int i=0; i<s.length(); i++){
            if('('==s.charAt(i)){
                LCount++;
            }
            else if(')'==s.charAt(i)){
                RCount++;
            }

            if((LCount==RCount)&&LCount!=0){
                break;
            }
        }
        return LCount+RCount;
    }

    public static boolean rightBracket(String s){
        boolean isR = false;

        for(int i=0; i<s.length()/2; i++){
            if((s.charAt(i)==s.charAt(s.length()-1-i))||s.charAt(0)==')'){
                return isR;
            }
        }

        return isR=true;
    }
}
/*
class Solution {
    public String solution(String s) {
        String result =test(s);
        return result;

    }
    
    public static String test(String s){
        String ss = s;
        
        String u=s.substring(0,balancedBracket(ss));
        String v=s.substring(balancedBracket(ss),ss.length());
        if(ss==""){
            return "";
        }
        else{
            if(rightBracket(u)==true&&rightBracket(v)!=true){
                return u+test(v);
            }
            else if(rightBracket(u)==true&&rightBracket(v)==true){
                return u+v;
            }
            else{
                String m = "("+test(v)+")";
                String n="";
                String temp = u.substring(1,u.length()-1);
                for(int i =0; i<temp.length(); i++){
                    if(temp.charAt(i)=='('){
                        n+=')';
                    }
                    else if(temp.charAt(i)==')'){
                        n+='(';
                    }
                }
                return m+n;
            }
        }
    }
    
    public static int balancedBracket(String s){
        int LCount =0;
        int RCount = 0;

        for(int i=0; i<s.length(); i++){
            if('('==s.charAt(i)){
                LCount++;
            }
            else if(')'==s.charAt(i)){
                RCount++;
            }

            if((LCount==RCount)&&LCount!=0){
                break;
            }
        }
        return LCount+RCount;
    }

    public static boolean rightBracket(String s){
        boolean isR = false;

        for(int i=0; i<s.length()/2; i++){
            if((s.charAt(i)==s.charAt(s.length()-1-i))||s.charAt(0)==')'){
                return isR;
            }
        }

        return isR=true;
    }
}
*/