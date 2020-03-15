//kakao 19`6
public class MatchingScoreSolution{
    
    public static int solution(String[] pages, String word){
        int index= 0;
        int count = 0;
        int lCount = 0;
        int[] basicScore = new int[pages.length];
        double[] linkScore = new double[pages.length];
        double[] matchScore = new double[pages.length];
        double temp=0;
        String[] ownArray = new String[pages.length];
        String[][] linkArray = new String[pages.length][pages.length-1];

        for(int i=0; i<pages.length; i++){
            int  a= pages[i].indexOf("content=");
            int  b= pages[i].indexOf("/>");
            String s = pages[i].substring(a+8,b);
            String[] array = s.split(" ");
            ownArray[i] = array[0];
        }
        
        for(int i=0; i<pages.length; i++){
            int n = 0;
            int a = pages[i].indexOf("<body>");
            int b = pages[i].indexOf("</body>");
            String s = pages[i].substring(a,b);
            String[] array = s.split(" ");
            for(int j=0; j<array.length; j++){
                if(array[j].toUpperCase().contains(word.toUpperCase())){
                    count++;
                }
                else if(array[j].contains("href")){
                    lCount++;
                    linkArray[i][n]= array[j];
                    n++;
                }
            }
            basicScore[i] = count;
            linkScore[i] = (double)count/lCount;
            temp += linkScore[i];
            count =0;
            lCount =0;
        }
        
        for(int i=0; i<linkArray.length; i++){
            for(int j=0; j<linkArray[i].length; j++){
                System.out.print(linkArray[i][j]+" ");
            }
            System.out.println();
        }
        
        /*
        for(int i=0; i<matchScore.length; i++){
            if(linkArray[i][0]!=null&&linkArray[i][1]!=null){
                matchScore[i] = basicScore[i]+temp-linkScore[i];
            }
            else if(linkArray[i][0]!=null&&linkArray[i][1]==null){
                matchScore[i] = basicScore[i]+temp-linkScore[i]- 
            }
            else if(linkArray[i][0]==null&&linkArray[i][1]==null){

            }
            System.out.println(matchScore[i]);
        } 
        */
        return index;
    }
    public static void main(String[] args){
        int index=0;
        String word= "blind";
        String[] pages={
        "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n <meta charset=\"utf-8\">\n <meta property=\"og:pages\" content=\"https://a.com\"/>\n</head> \n<body>\nBlind Lorem Blind ipsum dolor Blind test sit amet, consectetur adipiscing elit. \n<a href=\"https://b.com\"> Link to b </a>\n</body>\n</html>", 
        "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n <meta charset=\"utf-8\">\n <meta property=\"og:pages\" content=\"https://b.com\"/>\n</head> \n<body>\nSuspendisse potenti. Vivamus venenatis tellus non turpis bibendum, \n<a href=\"https://a.com\"> Link to a </a>\nblind sed congue urna varius. Suspendisse feugiat nisl ligula, quis malesuada felis hendrerit ut.\n<a href=\"https://c.com\"> Link to c </a>\n</body>\n</html>", 
        "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n <meta charset=\"utf-8\">\n <meta property=\"og:pages\" content=\"https://c.com\"/>\n</head> \n<body>\nUt condimentum urna at felis sodales rutrum. Sed dapibus cursus diam, non interdum nulla tempor nec. Phasellus rutrum enim at orci consectetu blind\n<a href=\"https://a.com\"> Link to a </a>\n</body>\n</html>"};
        index = solution(pages,word);
        System.out.println(index);
    }
}