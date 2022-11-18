package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1つ目の整数を入力してください:");
        Integer i1 = Integer.parseInt(input.nextLine(), 10);

        System.out.print("2つ目の整数を入力してください:");
        Integer i2 = Integer.parseInt(input.nextLine(), 10);

        System.out.println(i1 + " + " + i2 + " = " + (i1 + i2));
    }
}
