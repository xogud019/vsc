//kakao 19`6
package Kakao;

public class MatchingScoreSolution{
    
    public static int solution(String[] pages, String word){
        int index= 0;
        int count = 0;
        int lCount = 0;
        int[] basicScore = new int[pages.length];
        double[] linkScore = new double[pages.length];
        double[] matchScore = new double[pages.length];
        String[] ownArray = new String[pages.length];
    
        for(int i=0; i<pages.length; i++){
            int  a= pages[i].indexOf("content=");
            int  b= pages[i].indexOf("/>");
            String s = pages[i].substring(a+8,b);
            String[] array = s.split(" ");
            ownArray[i] = array[0];
        }
        
        for(int i=0; i<pages.length; i++){
            int a = pages[i].indexOf("<body>");
            int b = pages[i].indexOf("</body>");
            String s = pages[i].substring(a,b);
            String[] array = s.split(" ");
            for(int j=0; j<array.length; j++){
                if(array[j].toUpperCase().contains(word.toUpperCase())){
                    if(array[j].toUpperCase().contains(word.concat(word).toUpperCase())){
                        count+=0;
                    }
                    else{
                    count++;
                    }
                }
                else if(array[j].contains("href")){
                    lCount++;
                }
            }
            basicScore[i] = count;
            matchScore[i] += basicScore[i];
            linkScore[i] = (double)count/lCount;
            count =0;
            lCount =0;
        }
        for(int i=0; i<pages.length; i++){
            for(int j=0; j<pages.length; j++){
                int a = pages[j].indexOf("href");
                String s = pages[j].substring(a);
                String[] array = s.split(" ");
                for(int k=0; k<array.length; k++){
                    if(array[k].contains(ownArray[i])){
                        matchScore[i]+=linkScore[j];
                    }
                }
            }
        }
       
        for(int i=0; i<pages.length-1; i++){
            if(matchScore[i+1]>matchScore[i]){
                index++;
            }
        }
      
        return index;
    }
    public static void main(String[] args){
        int index=0;
        
        String word = "Muzi";
        String[] pages={
        "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n <meta charset=\"utf-8\">\n <meta property=\"og:url\" content=\"https://careers.kakao.com/interview/list\"/>\n</head> \n<body>\n<a href=\"https://programmers.co.kr/learn/courses/4673\"></a>#!MuziMuzi!)jayg07con&&\n\n</body>\n</html>",
        "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n <meta charset=\"utf-8\">\n <meta property=\"og:url\" content=\"https://www.kakaocorp.com\"/>\n</head> \n<body>\ncon%\tmuzI92apeach&2<a href=\"https://hashcode.co.kr/tos\"></a>\n\n\t^\n</body>\n</html>"};
        
        /*
        String word= "blind";
        String[] pages={
        "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n <meta charset=\"utf-8\">\n <meta property=\"og:pages\" content=\"https://a.com\"/>\n</head> \n<body>\nBlind Lorem Blind ipsum dolor Blind test sit amet, consectetur adipiscing elit. \n<a href=\"https://b.com\"> Link to b </a>\n</body>\n</html>", 
        "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n <meta charset=\"utf-8\">\n <meta property=\"og:pages\" content=\"https://b.com\"/>\n</head> \n<body>\nSuspendisse potenti. Vivamus venenatis tellus non turpis bibendum, \n<a href=\"https://a.com\"> Link to a </a>\nblind sed congue urna varius. Suspendisse feugiat nisl ligula, quis malesuada felis hendrerit ut.\n<a href=\"https://c.com\"> Link to c </a>\n</body>\n</html>", 
        "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n <meta charset=\"utf-8\">\n <meta property=\"og:pages\" content=\"https://c.com\"/>\n</head> \n<body>\nUt condimentum urna at felis sodales rutrum. Sed dapibus cursus diam, non interdum nulla tempor nec. Phasellus rutrum enim at orci consectetu blind\n<a href=\"https://a.com\"> Link to a </a>\n</body>\n</html>"};
        */
        index = solution(pages,word);
        System.out.println(index);
    }
}