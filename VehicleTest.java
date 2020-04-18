class Vehicle{
    public class Taxi{
        String style="";
        public Taxi(String style){
            this.style = style;
        }
    }

    public class Bus{
        int BusNum = 0;
        public Bus(int num){
            this.BusNum = num;
        }
    }
    Taxi taxi;
    Bus bus;
    public Vehicle(String style){
        this.taxi = new Taxi(style);
    }

    public Vehicle(int BusNum){
        this.bus = new Bus(BusNum);
    }

    public void printBus(){
        System.out.println(bus.BusNum);
    }
    public void printtaxi(){
        System.out.println(taxi.style);
    }
}
public class VehicleTest {
    public static void main(String[] args){
        Vehicle bus= new Vehicle(22);
        bus.printBus();
        bus.printtaxi();
    }
}