public class WrongPwdException extends Exception {
    public WrongPwdException(){}
    public WrongPwdException(String message){
        super(message);
    }
}