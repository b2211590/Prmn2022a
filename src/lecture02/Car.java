package lecture02;

public class Car {
    int fuel;
    Tire[] tires;
    Engine engine;

    Car(Tire[] tires, Engine engine){
        fuel = 0;
        this.tires = tires;
        this.engine = engine;
    }

    void run(){
        if(fuel >= 1){
            fuel--;
            System.out.println("燃料を 1 消費して走りました.");
        }else{
            System.out.println("燃料が 0 以下だったため走れませんでした.");
        }
    }

    void startEngine(){
        engine.start();
    }
}
