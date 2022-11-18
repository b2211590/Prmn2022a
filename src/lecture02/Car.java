package lecture02;

public class Car {
    int fuel;

    Car(){
        fuel = 0;
    }

    void run(){
        if(fuel >= 1){
            fuel--;
            System.out.println("燃料を 1 消費して走りました.");
        }else{
            System.out.println("燃料が 0 以下だったため走れませんでした.");
        }
    }
}
