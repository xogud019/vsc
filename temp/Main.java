
public class Main {

    public static void main(String[] args) {
        String balancedParenthesis = "()()((()))())))(((";
        Main ss = new Main();
        System.out.print(ss.solution(balancedParenthesis));
    }

    public String solution(String balancedParenthesis) {
        return getCorrectParenthesis(balancedParenthesis);
    }

    private boolean isCorrectParenthesis(String balancedParenthesis) {
        int strLen = balancedParenthesis.length();
        int open = 0;
        for (int i = 0; i < strLen; i++) {
            if (balancedParenthesis.charAt(i) == '(') {
                open++;
            } else {
                if (open == 0) return false;
                open--;
            }
        }
        return true;
    }

    private String getCorrectParenthesis(String balancedParenthesis) {
        if (balancedParenthesis.length() == 0) return balancedParenthesis;

        int open = 0;
        int close = 0;
        for (char c : balancedParenthesis.toCharArray()) {
            if (c == '(') open++;
            else close++;
            if (open == close) break;
        }
        int uLen = open + close;
        String u = balancedParenthesis.substring(0, uLen);
        String v = balancedParenthesis.substring(uLen);

        if (isCorrectParenthesis(u)) {
            return u + getCorrectParenthesis(v);
        } else {
            
            String uDash = "(" + getCorrectParenthesis(v) + ")";
            for (int i = 1; i < uLen - 1; i++) {
                if (u.charAt(i) == '(') {
                    uDash += ")";
                } else {
                    uDash += "(";
                }
            }
            return uDash;
        }
    }
}