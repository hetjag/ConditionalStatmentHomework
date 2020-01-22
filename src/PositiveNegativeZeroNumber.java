import java.util.Scanner;

public class PositiveNegativeZeroNumber { // class name

    public static void main(String[] args){  // main method

        Scanner scanner = new Scanner(System.in);     // scanner method
        System.out.println("Please enter number = "); // user can use this method for entering number
        int num = scanner.nextInt(); //storing int value

       // using if else programme
        if(num>0){

            System.out.println(" number is positive = " + num);
        }
        else if(num<0){
            System.out.println(" number is negative = "+ num);
        }
         else {
             System.out.println(" number is zero = " +num);
        }

    }
}
