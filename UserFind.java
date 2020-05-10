import java.util.*;
public class UserFind {
    static int answer;
    static ArrayList<String> list = new ArrayList<>();
    static ArrayList<String> list1 = new ArrayList<>();
    public static void main(String[] args){
        String[] user_id = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
        String[] banned_id = {"fr*d*", "*rodo", "******", "******"};

        System.out.println(solution(user_id, banned_id));
        
    }

    public static int solution(String[] user_id, String[] banned_id){
        makeList(user_id, banned_id, list);
        erase(list, list1);
        int level=0;
        int index=0;
        int max = banned_id.length;
        boolean[] cList = new boolean[max];
        for(int i=0; i<list1.size(); i++){
            Arrays.fill(cList, false);
            if(check(list1.get(i), banned_id[0])==true){
                dfs(list1.get(i),banned_id,level,max,cList,index);
            }
            
        }
        /*
        for(int i=0; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }
        */
        return answer;
    }

    public static void dfs(String s,String[] banned_id,int level, int max,boolean[] cList,int index){
        if(level==max){
            answer++;
        }
        else{
            
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

    public static void makeList(String[] user_id, String[] banned_id,ArrayList<String> list){
        for(int i=0; i<banned_id.length; i++){
            for(int j=0; j<user_id.length; j++){
                if(banned_id[i].length()!=user_id[j].length()){
                    continue;
                }
                else{
                    boolean isC = true;
                    for(int k=0; k<banned_id[i].length(); k++){
                        if(banned_id[i].charAt(k)!='*'&&(banned_id[i].charAt(k)!=user_id[j].charAt(k))){
                            isC = false;
                            break;
                        }
                    }
                    if(isC ==true){
                        list.add(user_id[j]);
                    }
                }
            }
        }
    }

    public static void erase(ArrayList<String> list, ArrayList<String> list1){
        for(int i=0; i<list.size(); i++){
            if(!list1.contains(list.get(i))){
                list1.add(list.get(i));
            }
        }
    }
    
}

