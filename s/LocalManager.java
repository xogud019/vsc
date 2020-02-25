public class LocalManager {
    int MonthlyEarn;
    int age;
    String name;
    String local;
    int holdTruckNum;

    public LocalManager(){

    }

    public void callHeadMgr(){

    }

    public void setHoldTruckNum(int num){
        int max=10;
        if(num>max){
            System.out.println("too much have");
        }
        else{
            this.holdTruckNum = num;
        }
    }

    public void printRecentTruck(){

    }

    public void printStat(){
        System.out.println("-----------------");
        System.out.print("MonthlyEarn="+this.MonthlyEarn+"\n");
        System.out.print("age="+this.age+"\n");
        System.out.print("name="+this.name+"\n");
        System.out.print("local="+this.local+"\n");
        System.out.print("holdTruckNum="+this.holdTruckNum+"\n");
        System.out.println("-----------------");
    }


}