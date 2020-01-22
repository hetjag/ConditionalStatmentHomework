import java.util.Scanner;

public class CalculatorSymbol {  // class name
    public static void main(String[] args){    // main method

        Scanner scanner = new Scanner(System.in);     // scanner method

        System.out.println("Please enter first number = "); // user can use this method for entering first number
        int num1 = scanner.nextInt();  //storing int value

        System.out.println("Please enter second number = ");// user can use this method for entering second number
        int num2 = scanner.nextInt(); //storing int value

        System.out.println("Please enter operator symbol ");
        char temp = scanner.next().charAt(0); //storing char value


        switch (temp){

            case '+' :
                System.out.println("Addition = " + num1 +" + "+ num2 +" = " + (num1 + num2)); // declare multiplication method

            case '-' :
                System.out.println("subtraction = " + num1 +" - "+ num2 +" = " + (num1 - num2)); // declare multiplication method

            case '/' :
                System.out.println("division = " + num1 +" / "+ num2 +" = " + (num1 / num2)); // declare multiplication method
            case '*' :
                System.out.println("multiplication = " + num1 +" * "+ num2 +" = " + (num1 * num2)); // declare multiplication method

            default:
                System.out.println("entered wrong symbol "); // entered wrong symbol


        }
    }


}
