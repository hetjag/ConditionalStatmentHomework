import java.util.Scanner;

public class FindValueOfNumberAlphabetAndSymbol {  //class name

    public static void main(String[] args) {  // main method
        Scanner scanner = new Scanner(System.in);     // scanner method
        System.out.println("Enter any character = "); // user can use this method for entering charactor
        char temp = scanner.next().charAt(0); //storing char value
    // using if else programme
        if ((temp>='0') && ( temp<='9')){  // used condition for number

            System.out.println("charactor is number ");

        }
        else if(((temp>='a') && (temp<='z')) || ((temp>='A') && (temp<='Z'))) {// used condition for alphabets

            System.out.println("charactor  is alphabets ");
        }

       else {
           System.out.println("charactor is symbol ");  //
        }


    }
}