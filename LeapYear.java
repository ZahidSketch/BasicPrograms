import java.util.Scanner;
public class LeapYear {

    static void leapYear(int year){

        // Using logical operators
//        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
//            System.out.println(year+" is a Leap Year");
//        }
//        else
//            System.out.println(year+" is Not a Leap Year");

    // Using ternary operator
        boolean isLeap =  (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)?true:false;
        if(isLeap) System.out.println("Leap year");
        else System.out.println("Not a leap year");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        leapYear(year);
    }
}
