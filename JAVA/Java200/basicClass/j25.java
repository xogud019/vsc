import java.util.Scanner;

public class j25{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("integer");
        int a = scanner.nextInt();
        System.out.println(a);
    
        System.out.println("double");
        double b = scanner.nextDouble();
        System.out.println(b);

        System.out.println("string");
        String c = scanner.next();
        System.out.println(c);
    }
}