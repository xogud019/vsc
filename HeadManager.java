public class HeadManager{
    private String ID ="";
    private String PWD = "";
    private boolean isHM = false;
    private LocalManager[] LMgr = new LocalManager[100];
    private Truck[] truck= new Truck[100];
    int i = 0;
    int j = 0;

    public HeadManager(String id, String pwd){
        this.ID = id;
        this.PWD = pwd;
    }

    private String getID(){
        return ID;
    }

    private String getPWD(){
        return PWD;
    }

    public boolean login(String id, String pwd){
        if(id==getID()){
            if(pwd==getPWD()){
                System.out.println("you are HeadMgr");
                this.isHM = true;
            }
            else{
                System.out.println("login failed");
            }
        }
        else{
            System.out.println("login failed");
        }
        return isHM;
    }

    public void createLocalMgr(LocalManager lM1,int earn, int age, String name, String local){
        if(isHM ==true){
            if(j<100){
                lM1.MonthlyEarn = earn;
                lM1.age =age;
                lM1.name = name;
                lM1.local = local;
                lM1.holdTruckNum = 0;
                LMgr[j] = lM1;
                j++;
            }
            else{
                System.out.println("Local Manager is full");
            }
        }
        else{
            System.out.println("you are not HeadMgr");
        }
    }
    
    public void printLocalMgrStat(){
        if(isHM ==true){
            if(j==0){
                System.out.println("no Local Manager");
            }
            else{
                for(int k=0; k<j; k++){
                    System.out.println("-----------------");
                    System.out.print("MonthlyEarn="+LMgr[k].MonthlyEarn+"\n");
                    System.out.print("age="+LMgr[k].age+"\n");
                    System.out.print("name="+LMgr[k].name+"\n");
                    System.out.print("local="+LMgr[k].local+"\n");
                    System.out.print("holdTruckNum="+LMgr[k].holdTruckNum+"\n");
                }
                System.out.println("-----------------");
            }
        }
        else{
            System.out.println("you are not HeadMgr");
        }
    }
    private void getLoaclMgrStat(){
        if(isHM ==true){

        }
        else{
            System.out.println("you are not HeadMgr");
        }
    }

    public void modifyLocalMgrStat(int n,int earn, int age, String name, String local){
        if(isHM ==true){
            if(j>n){
                LMgr[n].MonthlyEarn = earn;
                LMgr[n].age =age;
                LMgr[n].name = name;
                LMgr[n].local = local;
            }
            else{
                System.out.println("that LM is not exist");
            }
        }
        else{
            System.out.println("you are not HeadMgr");
        }
    }

    public void setNewTruck(Truck t1,String model, String usage, int charge, int privitNum){
        if(isHM ==true){
            if(i<100){
                t1.model= model;
                t1.usage= usage;
                t1.charge = charge;
                t1.privitNum = privitNum;
                truck[i]= t1;
                i++;
            }
            else{
                System.out.println("Storege is full");
            }
        }
        else{
            System.out.println("you are not HeadMgr");
        }
    }

    public void modifyTruck(){
        if(isHM ==true){

        }
        else{
            System.out.println("you are not HeadMgr");
        }
    }

    public void printAllTruck(){
        if(isHM ==true){
            if(i==0){
                System.out.println("no truck");
            }
            else{
                for(int k=0; k<i; k++){
                    System.out.println("-----------------");
                    System.out.print("model="+truck[j].model+"\n");
                    System.out.print("usage="+truck[j].usage+"\n");
                    System.out.print("charge="+truck[j].charge+"\n");
                    System.out.print("privitNum="+truck[j].privitNum+"\n");
                }
                System.out.println("-----------------");
            }
        }
        else{
            System.out.println("you are not HeadMgr");
        }
    }

    public void printRecentTruck(){
        if(isHM ==true){
            if(i==0){
                System.out.println("no truck");
            }
            else{
                System.out.println("-----------------");
                System.out.print("model="+truck[i].model+"\n");
                System.out.print("usage="+truck[i].usage+"\n");
                System.out.print("charge="+truck[i].charge+"\n");
                System.out.print("privitNum="+truck[i].privitNum+"\n");
                System.out.println("-----------------");
            }
        }
        else{
            System.out.println("you are not HeadMgr");
        }
    }

}