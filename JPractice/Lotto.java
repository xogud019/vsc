package JPractice;
public class Lotto{
    private int num[];
    private int stand[];

    public Lotto(){
        num = new int[7];
        stand = new int[7];
    }

    public void makeLotto(){
        createLottoNum(num);
    }

    public void makeBasic(){
        createLottoNum(stand);
    }

    public int[] getNum(){
        return num;
    }

    public int[] getBasic(){
        return stand;
    }

    public void getRank(){
        String s= prize();
        System.out.println(s);
    }

    public void showLottoNum(){
        for(int i=0; i<7; i++){
            System.out.print(num[i]+"\t");
        }
        System.out.println();
    }

    private void show(int[] num){
        for(int i=0; i<7; i++){
            System.out.print(num[i]+"\t");
        }
        System.out.println();
    }

    private String prize(){
        String s="";
        int[] n = getNum();
        int[] ss= getBasic();
        int count =0;
        int bonus =0;

        for(int i=0; i<6; i++){
            for(int j=0; j<6;j++){
                if(n[i]==ss[j]){
                    count++;
                }
            }
        }
        show(ss);

        if(ss[6]==n[6]){
            bonus =1;
        }

        if(count==6&&bonus==1){
            s= "first";
        }
        else if((count==6&&bonus==0)||(count==5&&bonus==1)){
            s= "second";
        }
        else if((count==5&&bonus==0)||(count==4&&bonus==1)){
            s= "third";
        }
        else if((count==4&&bonus==0)||(count==3&&bonus==1)){
            s="forth";
        }
        else if((count==3&&bonus==0)||(count==2&&bonus==1)){
            s="fifth";
        }
        else{
            s="no prize";
        }
        
        return s;
    }
    private void createLottoNum(int[] num){
        while(true){
            for(int i=0; i<7; i++){
                num[i] = (int)(Math.random()*45+1);
            }
            if(isNoOverlap(num) == true){
                break;
            }
        }
        sort(num);
    }

    private boolean isNoOverlap(int[] num){
        int[] cheakArr = new int[46];
        for(int i=0; i<6; i++){
            cheakArr[num[i]-1]+=1;
                if(cheakArr[num[i]-1]==2){
                    return false;
                }   
        }
        return true;
    }

    private void sort(int[] num){
        int temp;
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                if(num[j]>num[j+1]){
                    temp = num[j+1];
                    num[j+1]= num[j];
                    num[j]=temp;
                }
            }
        }
    }

    
}
