import java.util.Scanner;

public class FibEvenSum {

    static int fibSum(int n) {
        int evenSum = 0;
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 0; i <2 * n; i++) {
            c = a + b;
            a = b;
            b = c;
            if(i % 2 == 0) {
                evenSum += c;
            }
        }
       return evenSum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = fibSum(n);
        System.out.println(sum);
    }
}