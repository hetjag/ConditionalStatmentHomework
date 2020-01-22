import java.util.Scanner;

public class SalesCommission { // class name

    public static void main(String[] args){  // main method

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter sales Id = ");
        String salesId = scanner.nextLine();   //Create scanner Object and pass string in it

        //Print the string
        System.out.println("Please enter seller's name = ");
        String SellerName = scanner.nextLine();
         // Print the int
        System.out.println("Please enter sales amount = ");
        int salesAmount = scanner.nextInt();

        // Print the int
        System.out.println("Please enter basic salary = ");
        int basicSalary = scanner.nextInt();
        // double value
        double commissionRate = 0.0;
        // if else method
       if(salesAmount>=50000){
           commissionRate=salesAmount*.35;
       }
       else if(salesAmount>=30000){
           commissionRate=salesAmount*.20;
       }
       else if(salesAmount>=20000){
           commissionRate=salesAmount*.10;
       }
       else if(salesAmount>=10000){
           commissionRate=salesAmount*.5;
       }
       else if(salesAmount<=10000){
           commissionRate=salesAmount*.2;
       }

        System.out.println("Sales commission ="+commissionRate); // it will print commissionrate
        System.out.println("Final salary ="+(basicSalary+commissionRate));// it will print basic salary and commission

    }
}
