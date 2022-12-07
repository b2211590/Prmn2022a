package lecture06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            integers.add(random.nextInt(5) + 1);
        }

        Scanner input = new Scanner(System.in);

        System.out.println("サイコロを5つ振りました.");
        System.out.print("何番目(0~4)のサイコロの値を確認しますか? :");

        try {
            int index = input.nextInt();
            System.out.println(index + " 番目の値：" + integers.get(index));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Arraylistの範囲外アクセスを確認しました.");
            System.out.println("プログラムを終了します.");
        }



    }
}
