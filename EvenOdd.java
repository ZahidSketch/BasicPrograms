import java.util.Scanner;

public class EvenOdd {

    static void evenOdd(int n) {


        // Using remainder
//        if(n % 2 == 0){
//            System.out.println("even");
//        }
//        else
//            System.out.println("odd");


        // Using bitwise OR
//        if((n | 1) > n){
//            System.out.println("even");
//        }
//        else
//            System.out.println("odd");
//


        // Using bitwise AND
//        if((n & 1) == 1){
//            System.out.println("odd");
//        }
//        else
//            System.out.println("even");


        // Using bitwise XOR
//        if ((n ^ 1) > n) {
//            System.out.println("even");
//        } else
//            System.out.println("odd");

        // Using Least significant bit method

        if (n != 0) {
            if (Integer.toBinaryString(n).endsWith("0")) {
                System.out.println("even");
            } else
                System.out.println("odd");
        }
        else
            System.out.println("zero");
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int a = sc.nextInt();

        evenOdd(a);
    }
}
