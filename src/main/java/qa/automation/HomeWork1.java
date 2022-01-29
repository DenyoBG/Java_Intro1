package qa.automation;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        System.out.println("Please enter your user name:");

        Scanner scanner = new Scanner (System.in);

        String userName = scanner.next();

        System.out.println("Please tell us your favourite hobbies:");

        String hobby = scanner.next();

        System.out.println("User Name: " + userName + "\nFavourite hobbies: " + hobby);
    }
}

