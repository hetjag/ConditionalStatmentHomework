import java.util.Scanner;

public class VowelAndConsonant { // class name

    public static void main(String[] args){     // main method
        Scanner scanner = new Scanner(System.in);     // scanner method
        System.out.println("Enter any character from alphabets = "); // user can use this method for entering character
        char temp = scanner.next().charAt(0); //storing char value

        if(temp=='a'||temp=='e'||temp=='i'|| temp=='o'|| temp=='u'||temp=='A'||temp=='E'||temp=='I'||temp=='O'||temp=='U'){
            System.out.println("Entered character is Vowel"); // It will print vowel
        }
        else {
            System.out.println("Entered character is consonant"); // It will print consonant
        }
    }
}
