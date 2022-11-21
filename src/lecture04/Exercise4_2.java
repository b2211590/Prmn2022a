package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {

        ATM atm = new ATM();

        String name = "田村跳飛";
        String number = "12345";

        atm.checkAccount(name, number);
        atm.registerAccount(name, number);
        atm.checkAccount(name, number);
        atm.deposit(name, 1000);
        atm.withdraw(name, 2000);
        atm.withdraw(name, 500);

    }
}
