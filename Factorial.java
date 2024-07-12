import java.util.Scanner;

public class Factorial {

    // Using Loop
//    static int factorial(int n) {
//
//        for(int i = 1; i <= n; i++) {
//
//            fact = fact * i;
//        }
//        return fact;
//    }

    // Using Recursion
    static int factorial(int n) {

        if(n == 0) return 1;

        return n * factorial(n-1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int fact = factorial(n);

        System.out.println("Factorial of " + n + " is " + fact);
    }
}
