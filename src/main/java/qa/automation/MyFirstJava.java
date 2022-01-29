package qa.automation;

import java.util.Scanner;

public class MyFirstJava {
    //psvm - fast key
    public static void main(String[] args) {
        // sout- fast key
        System.out.println("Please enter your first name:");

        //Scanner is a class for reading values from the console
        Scanner scanner = new Scanner(System.in);

        //a string variable that will store the value entered from the user-text
        String firstName = scanner.next();

        //System.out.println("Your name is: " + firstName);

        System.out.println("Please enter your age:");

        //integer - value that will store the age entered from the user - number
        int userAge = scanner.nextInt();

        // \n - нов ред
        /* System.out.println("Your name is: " + firstName + "\nYour age is: " + userAge); */

        //System.out.println("Your name is: " + firstName);
        //System.out.println("Your age is: " + userAge);

        if (userAge >= 18){
            System.out.println(firstName + " Can drink!!!");
        }

        if (userAge < 18){
            System.out.println(firstName + " Can't drink!!!");
        }

        if (userAge >= 65){
            System.out.println(firstName + " is retired");
        }

    }

}
