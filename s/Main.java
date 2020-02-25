public class Main{
    public static void main(String[] args){
        boolean isT = false;
        HeadManager kim = new HeadManager("dkdksnsnru", "tkfkd214");
        isT = kim.login("dkdksnsnru", "tkfkd214");
        System.out.println(isT);
        LocalManager song = new LocalManager();
        LocalManager s1 = new LocalManager();
        kim.createLocalMgr(song, 10000, 24, "seohyun", "busan");
        kim.createLocalMgr(s1, 1000, 20, "seo", "busan");
        kim.printLocalMgrStat();
        song.setHoldTruckNum(3);
        kim.printLocalMgrStat();
        song.printStat();
        kim.printRecentMgrStat();
    }
}