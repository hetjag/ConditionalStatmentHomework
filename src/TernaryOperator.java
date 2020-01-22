import java.util.Scanner;

public class TernaryOperator {   // class name

    public static void main(String[] args){    // main method

        Scanner scanner = new Scanner(System.in);     // scanner method
        System.out.println("Please enter number = "); // user can use this method for entering number
        int num = scanner.nextInt();


     String myNumber = (num%2==0) ? " Even " : " Odd " ; // using ternary operator
     System.out.println(num + " is " + myNumber);





    }





}
