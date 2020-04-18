//chap5 mini Project
import java.util.*;
public class loginSystem {
    public static void main(String[] args){
        ArrayList<User> user = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        while(true){
            System.out.println("====================");
            System.out.println("1.Sign Up");
            System.out.println("2.Login");
            System.out.println("3.Print All User");
            System.out.println("4.Exit");
            System.out.println("====================");
            System.out.print("input the number : ");
            int n = scan.nextInt();
            if(n==1){
                System.out.print("ID:");
                String id=scan1.nextLine();
                System.out.print("PWD:");
                String pwd=scan1.nextLine();
                user.add(new User(id, pwd));
            }
            else if(n==2){
                boolean isT= false;
                System.out.print("ID:");
                String id=scan1.nextLine();
                System.out.print("PWD:");
                String pwd=scan1.nextLine();
                for(int i=0; i<User.UserCount; i++){
                    if(id.equals(user.get(i).ID)&&pwd.equals(user.get(i).PWD)){
                        isT=true;
                    }
                }
                if(isT == true){
                    System.out.println("Login success");
                }
                else{
                    System.out.println("error");
                }
            }
            else if(n==3){
                for(int i=0; i<User.UserCount; i++){
                    user.get(i).printAllUser();
                }
            }
            else if(n==4){
                System.out.println("System close");
                break;
            }
            else{
                System.out.println("input 1~4");
            }
        }
        scan.close();
        scan1.close();
    }
}

class User{
    String ID="",PWD="";
    static int UserCount=0;

    public User(String ID, String PWD){
        this.ID = ID;
        this.PWD = PWD;
        UserCount++;
    }
    
    public void printAllUser(){
        System.out.println("("+this.ID+","+this.PWD+")");
    }
}
