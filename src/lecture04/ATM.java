package lecture04;

import java.util.ArrayList;

public class ATM {

    private final ArrayList<Account> accountList = new ArrayList<>();

    public void registerAccount (String name, String number) {
        accountList.add(new Account(name, number));
        System.out.println(name + " さんのアカウントを口座番号:" + number + " で登録しました.");
    }

    public boolean existsAccount (String name, String number) {
        for (Account account : accountList) {
            if (account.getName().equals(name) && account.getNumber().equals(number)) {
                return true;
            }
        }
        return false;
    }

    public void deposit (String name, long money) {
        for (Account account : accountList) {
            if (account.getName().equals(name)) {
                account.setBalance(money);
                System.out.println("口座番号:" + account.getNumber() + " に " + money + " 円入金しました.");
            }
        }
    }

    public void withdraw (String name, long money) {
        for (Account account : accountList) {
            if (account.getName().equals(name)) {
                if (money <= account.getBalance()) {
                    account.setBalance(account.getBalance() - money);
                    System.out.println("口座番号:" + account.getNumber() + " から " + money + " 円引き出しました.");
                }
                else {
                    System.out.println("口座番号:" + account.getNumber() + " から " + money + " 円引き出せませんでした.残高:" + account.getBalance() + " 円です.");
                }
            }
        }
    }

    public void checkAccount (String name, String number) {
        if (existsAccount(name, number)) {
            System.out.println("名前:" + name + " 口座番号:" + number + " は存在します.");
        }
        else {
            System.out.println("名前:" + name + " 口座番号:" + number + " は存在しません.");
        }
    }

}
