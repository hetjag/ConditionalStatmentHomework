import java.util.Scanner;

public class NumbersValue { // class name

    public static void main(String[] args){ // main method

        Scanner scanner = new Scanner(System.in);     // scanner method

        System.out.println("Please enter first number = "); // user can use this method for entering first number
        int a = scanner.nextInt();  //storing int value

        System.out.println("Please enter second number = ");// user can use this method for entering second number
        int b = scanner.nextInt(); //storing int value

        int c = a;

      a = b;
      b = c;

        System.out.println(" first number after swapping :"+a); // swapping value of a and b
        System.out.println(" Second number after swapping :"+b); // swapping value of a and b


    }
}
