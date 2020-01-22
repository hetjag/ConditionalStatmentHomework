import java.util.Scanner;

public class GrossSalary { // class name

    public static void main(String[] args){ // main method


        Scanner scanner = new Scanner(System.in);     // scanner method
        System.out.println("Please enter employee Id = "); // user can enter employee Id with this
        String Idnum = scanner.nextLine();        //

        System.out.println("Please enter name = "); // user can enter name with this
        String name = scanner.nextLine();

        System.out.println("Please enter basic salary = ");  // user can enter basic salary with this
        int basicSalary = scanner.nextInt();

        double HRA = basicSalary*.10;  // declare parcentage of HRA
        double TA = basicSalary*.08;   // declare parcentage of TA
        double DA = basicSalary*.09; // declare parcentage of DA
        double PF = basicSalary*.20;// declare parcentage of PF
        double Grosssalary = basicSalary+HRA+TA+DA-PF; // declare gross salary

      System.out.println("Gross salary is = "+ (basicSalary+HRA+TA+DA-PF));









    }
}
