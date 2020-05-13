import java.util.*;
public class UserFind {
    static int answer;
    static ArrayList<String> list=new ArrayList<>();
    public static void main(String[] args){
        String[] user_id = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
        String[] banned_id = {"fr*d*", "*rodo", "******", "******"};

        System.out.println(solution(user_id, banned_id));   
    }

    public static int solution(String[] user_id, String[] banned_id){
        boolean[] visited = new boolean[user_id.length];
        dfs(user_id, banned_id, 0, 0, visited);
        return answer;
    }

    public static void dfs(String[] user_id, String[] banned_id,int level, int index, boolean[] visited){
        if(level == banned_id.length){
            
        }
    }

    public static boolean check(String s1, String s2){
        boolean isT = false;
        if(s1.length()!=s2.length()){
            return isT;
        }
        else{
            for(int i=0; i<s1.length(); i++){
                if(s2.charAt(i)!='*'&&(s1.charAt(i)!=s2.charAt(i))){
                    return isT;
                }
            }
            return isT=true;
        }
    }
}

