class Car{
    class Tire{
        String LF ="";
        String LB ="";
        String RF =""; 
        String RB ="";
    }
    String brand ="";
    Tire tire = new Tire();

    public Car(String brand,String LF,String LB, String RF, String RB){
        this.brand = brand;
        this.tire.LF = LF;
        this.tire.LB = LB; 
        this.tire.RF = RF;
        this.tire.RB = RB;
    }

    public void printStatCar(){
        System.out.println(this.brand);
        System.out.println(this.tire.LF);
        System.out.println(this.tire.LB);
        System.out.println(this.tire.RF);
        System.out.println(this.tire.RB);
    }
}

public class CarTest{
    public static void main(String[] args){
        Car car = new Car("Lamborgini","KTire","MTire","HTire","MTire");
        car.printStatCar();
    }
}