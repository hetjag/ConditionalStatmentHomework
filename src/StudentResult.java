import java.util.Scanner;

public class StudentResult {  // class name

    public static void main(String[] args){  // main method
        Scanner scanner = new Scanner(System.in);     // scanner method
        System.out.println("Please enter name = "); // user can use this method for entering name
        String name = scanner.nextLine();

        System.out.println("Please enter roll no = "); // user can use this method for entering roll no
        int rollNo = scanner.nextInt();

        System.out.println("Please enter mark of Phy = "); // user can use this method for entering phy marks
        int phy = scanner.nextInt();

        System.out.println("Please enter mark of chem = "); // user can use this method for entering chem marks
        int che = scanner.nextInt();

        System.out.println("Please enter mark of bio = "); // user can use this method for entering bio marks
        int bio = scanner.nextInt();
        System.out.println("Student Name :"+name);  //It will print student name
        System.out.println("Student Roll number :"+rollNo); //It will print student roll number

        int total = phy + che + bio; // Total of phy,che and bio
        System.out.println("Total :" + total);
       // If else programme
        if (phy>=35 && che>=35 && bio>=35)
        {

            double percentage = total / 3; // percentage of subject
            System.out.println("Percentage :" + percentage);

            if (percentage >= 80) {
                System.out.println(" grade = A+ "); //It will print grade A+
            } else if (percentage >= 60) {
                System.out.println(" grade = A "); //It will print grade A
            } else if (percentage >= 50) {
                System.out.println(" grade = B "); //It will print grade B
            } else if (percentage >= 35) {
                System.out.println(" grade = C ");//It will print grade C
            }
        }
        else {
            System.out.println("Student is failed in one or more than one subjects ");
        }





    }
}
