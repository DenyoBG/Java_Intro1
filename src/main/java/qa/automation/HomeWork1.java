package qa.automation;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args){

        System.out.println("Please enter your user name: ");

        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();

        System.out.println("Please enter your favourite hobbies: ");

        String hobby = scanner.nextLine();


        System.out.println("Please enter your age: ");

        int age = scanner.nextInt();

        System.out.println("Please enter your user name: " + userName + "\nPlease enter your favourite hobbies: " + hobby + "" +
                "\nPlease enter your age: " + age);





    }
}