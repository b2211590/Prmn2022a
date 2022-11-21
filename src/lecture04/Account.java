package lecture04;

public class Account {
    private final String name;
    private final String number;
    private long balance;

    public Account(String name, String number) {
        this.name = name;
        this.number = number;
        this.balance = 0;
    }

    public void setBalance(long balance) {
        if(balance >= 0) {
            this.balance = balance;
        }
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }
}
