package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {

        Fighter f1 = new Fighter(200, 25, "Fighter1");
        Fighter f2 = new Fighter(250, 15, "Fighter2");

        while (true){
            f1.attack(f2);
            if(!f2.isAlive()){
                System.out.println(f2.getName() + " は倒れた.");
                break;
            }

            f2.attack(f1);
            if(!f1.isAlive()){
                System.out.println(f1.getName() + " は倒れた.");
                break;
            }
        }

    }
}
