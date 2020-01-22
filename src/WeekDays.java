public class WeekDays {
// This programme is showing Day name of the week using switch


  // main method
    public static void main(String[] args){
        int number = 4; // number value
        switch (number){    // variable name

            case 1 :        // declare days
                System.out.println("Monday");  // declare day name
                break;
            case 2 :         // declare days
                System.out.println("Tuesday");  // declare day name
                break;
            case 3 :         // declare days
                System.out.println("Wednesday"); // declare day name
                break;
            case 4 :         // declare days
                System.out.println("Thursday");  // declare day name
                break;
            case 5 :         // declare days
                System.out.println("Friday");   // declare day name
                break;
            case 6 :         // declare days
                System.out.println("Saturday");  // declare day name
                break;
            case 7 :         // declare days
                System.out.println("Sunday");    // declare day name
                break;


            default:
                System.out.println(" You enter wrong number ");  // declare default statement
        }




    }
}
