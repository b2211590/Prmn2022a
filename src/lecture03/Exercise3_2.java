package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        System.out.print("何行分入力しますか？:");
        int lines = input.nextInt();

        input.nextLine();

        for (int i = 0; i < lines; i++) {
            System.out.print((i + 1) + "行目:");
            strings.add(input.nextLine());
        }

        int i = 1;

        System.out.println("入力された文字列");
        for (String string : strings) {
            System.out.println("[" + i + "] " + string);
            i++;
        }
    }
}
