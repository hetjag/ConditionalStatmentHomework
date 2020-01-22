import java.util.Scanner;

public class EligibleToVote { // class name

    public static void main(String[] args){   // main method
        Scanner scanner = new Scanner(System.in);     // scanner method

        System.out.println("Please enter age in years = "); // user can use this method for entering age in year
        int age = scanner.nextInt();  //storing int value
  // using if else programme
    if(age>=18){
        System.out.println("you are eligible for vote");
    }
    else {
        System.out.println("you are not eligible for vote");
    }



    }
}
