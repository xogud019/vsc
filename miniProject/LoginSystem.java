import java.util.*;

public class LoginSystem {
    //Map that stores user information
    public static HashMap<String,String> record = new HashMap<>();
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        while(true){
            String ID = "";
            String PWD ="";
            int n;
            System.out.println("==========================");
            System.out.println("1.Login 2.exit");
            n = scan.nextInt();
            if(n==1){
                while(true){    //First login/exit menu
                    System.out.println("==========================");
                    System.out.print("insert ID(If you want to return to the previous menu, enter end):");
                    ID = scan.next();
                    if(ID.equals("end")){
                        break;
                    }
                    System.out.print("insert PWD:");
                    PWD = scan.next();
                    
                    if(login(ID, PWD)==true){
                        System.out.println("==========================");
                        User user = new User(ID, PWD);
                        if(checkUser(record,user)==true){
                            saveUserRecord(record, user);
                            System.out.println("you are User");
                        }
                        else{
                            System.out.println("wrong");
                            break;
                        }
                        
                        while(true){        //User menu
                            System.out.println("==========================");
                            System.out.println("1.setting 2.printStatue 3.quit");
                            n= scan.nextInt();
                            if(n==1){
                                user.setting();
                                record.put(user.ID, user.getPWD());
                            }
                            else if(n==2){
                                user.printStatue();
                            }
                            else if(n==3){
                                break;
                            }
                            else{
                                System.out.println("try again");
                            }
                        }
                    }
                    else{
                        Manager manager = new Manager();
                        if(PWD.equals(manager.getPWD())){
                            System.out.println("==========================");
                            System.out.println("you are Manager");
                        }
                        else{
                            System.out.println("wrong");
                        }

                        while(true){        //Manager menu
                            System.out.println("==========================");
                            System.out.println("1.setting 2.printStatue 3.manage user 4.quit");
                            n= scan.nextInt();
                            if(n==1){
                                manager.setting();
                            }
                            else if(n==2){
                                manager.printStatue();
                            }
                            else if(n==3){
                                while(true){
                                    System.out.println("==========================");
                                    System.out.println("1.print all user 2.remove all user 3quit");
                                    int m = scan.nextInt();
                                    if(m==1){
                                        manager.userManager(1);
                                    }
                                    else if(m==2){
                                        manager.userManager(2);
                                    }
                                    else if(m==3){
                                        break;
                                    }
                                    else{
                                        System.out.println("try again");
                                    }
                                }
                            }
                            else if(n==4){
                                break;
                            }
                            else{
                                System.out.println("try again");
                            }

                        }
                        
                    }
                    
                    
                }
            }
            else if(n==2){
                System.out.println("system end");
                scan.close();
                break;
            }
            else{
                System.out.println("try again");
            }
        }
    }
    //Check if account is user or manager
    public static boolean login(String ID, String PWD){
        boolean isU = false;
        Manager manager = new Manager();
        if(ID.equals(manager.getID())){
            return isU;
        }
        else{
            return isU=true;
        }

    }
    //Check if the account has been logged in
    public static boolean checkUser(HashMap<String,String> record,User user){
        boolean isU = false;
        if(!record.containsKey(user.ID)){
            return isU=true;
        }
        else{
            if(record.get(user.ID).equals(user.getPWD())){
                return isU=true;
            }
            else{
                return isU;
            }
        }
        
    }
    //Store user information
    public static void saveUserRecord(HashMap<String,String> record,User user){
        record.put(user.ID, user.getPWD());
    }
}

//Implementing basic functions of objects using interfaces
interface basicFuntion{
    String ID="";
    String PWD="";
    public void setting();
    public void printStatue();
    public String getPWD();
    public void setPWD(String PWD);
}
//User class 
class User implements basicFuntion{
    public String ID ="";
    private String PWD ="";
    
    public User(String ID, String PWD){
        this.ID = ID;
        this.PWD = PWD;
    }

    public void setPWD(String PWD){
        this.PWD = PWD;
    }

    public String getPWD(){
        return this.PWD;
    }

    public void setting(){
        Scanner scan = new Scanner(System.in);
        System.out.print("insert your PWD:");
        if(this.getPWD().equals(scan.next())){
            System.out.print("insert  your new PWD:");
            this.setPWD(scan.next());
        }
        else{
            System.out.println("wrong");
        }        
    }
    public void printStatue(){
        System.out.println("ID:"+this.ID);
    }

}
//Manager class
class Manager implements basicFuntion{
    private String ID ="xogud019";
    private String PWD ="tkfkd623";

    public Manager(){
        
    }

    public String getID(){
        return this.ID;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    public String getPWD(){
        return this.PWD;
    }

    public void setPWD(String PWD){
        this.PWD = PWD;
    }

    public void setting(){
        Scanner scan = new Scanner(System.in);
        System.out.print("insert your ID:");
        if(this.getID().equals(scan.next())){
            System.out.print("insert  your PWD:");
                if(this.getPWD().equals(scan.next())){
                    System.out.println("insert your new ID");
                    this.setID(scan.next());
                    System.out.println("insert your new PWD");
                    this.setPWD(scan.next());
            }
        }
        else{
            System.out.println("wrong");
        }    
    }

    public void userManager(int n){
        Scanner scan = new Scanner(System.in);
        if(n==1){
            for(String k: LoginSystem.record.keySet()){
                System.out.println(k+","+LoginSystem.record.get(k));
            }   
        }
        else if(n==2){
            LoginSystem.record.clear(); 
        }
        else{
            System.out.println("wrong");
        }
        
    }

    public void printStatue(){
        System.out.println("ID:"+this.ID);
    }
}


