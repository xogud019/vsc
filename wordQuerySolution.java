public class wordQuerySolution {
    public static void main(String[] args){
        String[] word ={"frodo", "front", "frost", "frozen", "frame", "kakao"};
        String[] query = {"fro??", "????o", "fr???", "fro???", "pro?"};
        int[] result = new int[query.length];
        result = solution(word, query);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]+" ");
        }
        System.out.println();
    }

    public static int[] solution(String[] word, String[] query){
        int[] result = new int[query.length];

        return result;
    } 
}