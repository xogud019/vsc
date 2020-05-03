import java.util.*;

public class LoginSystem {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        HashMap<Object,Object> record = new HashMap<Object,Object>();

        while(true){
            String ID = "";
            String PWD ="";
            int n;
            System.out.println("==========================");
            System.out.println("1.Login 2.exit");
            n = scan.nextInt();
            if(n==1){
                while(true){
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
                        System.out.println("you are User");
                        User user = new User(ID, PWD);
                        saveUserRecord(record, user);
        
                        while(true){
                            System.out.println("==========================");
                            System.out.println("1.setting 2.printStatue 3.quit");
                            n= scan.nextInt();
                            if(n==1){
                                user.setting();
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
                        System.out.println("==========================");
                        System.out.println("you are Manager");
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

    public static void saveUserRecord(HashMap record,User user){
        record.put(user.ID, user.getPWD());
    }

    public static void printUserRecord(HashMap record){
        for(Object key:record.keySet()){
            Object value = record.get(key);
            System.out.println(key+","+value);
        }
    }
}

//Implementing basic functions of objects using interfaces
interface basicFuntion{
    String ID="";
    String PWD="";
    public void setting();
    public void printStatue();
}
//User class 
class User implements basicFuntion{
    public String ID ="";
    private String PWD ="";
    private char right ='u';
    String name="";
    int age;

    public User(String ID, String PWD){
        this.ID = ID;
        this.PWD = PWD;
    }

    public String getPWD(){
        return this.PWD;
    }

    public void setting(){
        Scanner scan = new Scanner(System.in);
        System.out.print("insert your name:");
        this.name = scan.next();
        System.out.print("insert  your age:");
        this.age = scan.nextInt();
    }
    public void printStatue(){
        System.out.println("ID:"+this.ID);
        System.out.println("name:"+this.name);
        System.out.println("age:"+this.age);
    }

}
//Manager class
class Manager implements basicFuntion{
    private String ID ="xogud019";
    private String PWD ="tkfkd623";
    private char right ='m';

    public Manager(){

    }

    public String getID(){
        return this.ID;
    }

    public void setting(){

    }

    public void printStatue(){

    }
}


