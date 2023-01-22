
package UserInputScanner;

//import for reading user input

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out if for output
        System.out.println("Start of program: ");
        //System.in if for user input
        Scanner scanner = new Scanner(System.in);

        //testing code
//        System.out.println("Enter 10 integers: ");
//        int sum = 0;
//        int counter = 0;
//        while (counter < 10) {
//            System.out.println("Enter number #" + (counter + 1) + ":");
//            boolean nextIntStatus = scanner.hasNextInt();
//            if (nextIntStatus) {
//                sum += scanner.nextInt();
//                counter++;
//            } else {
//                System.out.println("Wrong input");
//            }
//            scanner.nextLine();
//        }
//        System.out.println("Sum is: " + sum);

        //reading an int
        System.out.println("Enter an int: ");
        //checking if I have a next int in next read
//        boolean status = scanner.hasNextInt();
//        System.out.println("status is =" + status);
        int intValue = scanner.nextInt();
//        if (intValue < 0) intValue = Math.abs(intValue);
        System.out.println("My int is: " + intValue);

        //reading and double
        System.out.println("Enter an double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("My double is: " + doubleValue);
        scanner.nextLine();

        //reading nextLine for String
        System.out.println("Enter an line of text: ");
        String stringValue = scanner.nextLine();
        System.out.println("My line is: " + stringValue);
        //close scanner
        scanner.close();
    }
}