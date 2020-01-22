import java.util.Scanner;

//This programme is showing city name using alphabet from a to f

public class AlphabetCityName {
    public static void main(String[] args){       // main  method
        Scanner scanner = new Scanner(System.in);     // scanner method
        System.out.println("Enter alphabet between a to f = "); // user can use this method for entering number
        char temp = scanner.next().charAt(0);    //
        char alphabet=Character.toLowerCase(temp); // convert in lowercase

        switch (alphabet){    //  variable name

            case 'a' :   // declare alphabet
                System.out.println("Ahmedabad");  // city name
                break;
            case 'b' :  // declare alphabet
                System.out.println("Bombay");     // city name
                break;
            case 'c' :   // declare alphabet
                System.out.println("Culcatta");   // city name
                break;
            case 'd' :    // declare alphabet
                System.out.println("Delhi");     // city name
                break;
            case 'e' :    // declare alphabet
                System.out.println("England");    // city name
                break;
            case 'f' :   // declare alphabet
                System.out.println("Fedra");     // city name
                break;

            default:     // declare invalid entry
                System.out.println("Entered alphabet is invalid entry " + alphabet);
















        }





    }
}
