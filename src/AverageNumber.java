import java.util.Scanner;
// This programme is showing average of five number
public class AverageNumber {    // class name

 public static void main(String[] args){   //main method

        Scanner scanner = new Scanner(System.in);  // declare scanner method
        System.out.print("Input first number: ");
         int num1 = scanner.nextInt();             // declare int value

        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();// declare int value

        System.out.print("Input third number: ");
        int num3 = scanner.nextInt();// declare int value

        System.out.print("Input fourth number: ");
        int num4 = scanner.nextInt();// declare int value

        System.out.print("Enter fifth number: ");
        int num5;
        num5 = scanner.nextInt();// declare int value


        System.out.println("Average of five numbers is: " +
                (num1 + num2 + num3 + num4 + num5) / 5); // average number of 5
    }
}


