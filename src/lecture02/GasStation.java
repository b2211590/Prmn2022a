package lecture02;

public class GasStation {

    void refuel(Car car){
        car.fuel += 20;
        System.out.println("燃料を 20 増やしました.");
    }
}
