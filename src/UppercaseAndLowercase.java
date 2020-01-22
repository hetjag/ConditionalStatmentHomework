import java.util.Scanner;

public class UppercaseAndLowercase { // class name

    public static void main(String[] args){ // main method
        Scanner scanner = new Scanner(System.in);     // scanner class
        System.out.println("Enter alphabets in uppercase = "); // user can use this method for entering alphabets in uppercase
        char temp = scanner.next().charAt(0);    // print the char
        char answer = Character.toLowerCase(temp);

        System.out.println("Print lower case = "+answer); // It will print lowercase charactor

    }

}







