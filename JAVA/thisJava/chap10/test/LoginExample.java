public class LoginExample{
    public static void main(String[] args){
        try{
            login("white","12345");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            login("red","06233");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void login(String id, String pwd) throws Exception{
        if(id.equals("red")){
            throw new NotExistIDException("id x");
        }

        if(pwd.equals("12345")){
            throw new WrongPwdException("pwd x");
        }
    }
}