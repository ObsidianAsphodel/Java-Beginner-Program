import java.util.Scanner;

//Class
public class Main {
    // method initilization - required method
    public static void main(String[] args) {
        // prints out a singular line.
        // two print calls would be on the same line while printLn will be two seperate
        // lines
        // \n denotes a new line. Acts like printLn
        System.out.println("Coffee Beans are Delicious on a Sunday Boat\n");
        // Quotes inside of a print call
        System.out.println("\"Sunday Boat\"");
        System.out.println("it's pretty cool");
        // String
        // variable intilization, declaration and assignment
        int newInt = 5;
        float newFloat = 5.5f;
        int b = 2;
        int c = 3;

        System.out.println(newInt + newFloat);
        System.out.println(c = c + b);
        System.out.println(newInt + newFloat);

        // Scanner is used to get user input
        // You have to create an instance of scanner in order to use it
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        // Accepts a string. String must be capitalized
        String name = scanner.nextLine();
        // Accepts an int. int must be lowerCase
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        // This is needed to clear the scanner
        scanner.nextLine();
        System.out.println("What's your favorite food?");
        String favoriteFood = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
        System.out.println("And you love " + favoriteFood);
        ;
        scanner.close();
    }
}