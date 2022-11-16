package lecture01;

import java.util.Scanner;

public class kadai3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input your age:");
        int age = input.nextInt();

        if(age < 20){
            System.out.println("I am " + age + " years old so I cannot drink liquor.");
        }else{
            System.out.println("I am " + age + " years old so I can drink liquor.");
        }
    }
}
