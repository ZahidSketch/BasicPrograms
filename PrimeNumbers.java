 import java.util.Scanner;

public class PrimeNumbers {

    // Using loop
//    static void printPrime(int n) {
//        for (int i = 3; i < n; i++) {
//            int count = 0;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    count++;
//                    break;
//                }
//            }
//            if(count == 0) {
//                System.out.print(i + " ");
//            }
//        }


//    }

    // Using SieveOfEratosthenes
    static void sieveOfEratosthenes(int n) {
        int[] prime= new int[n+1];
        for(int i = 0; i <= n; i++){
            prime[i] = 0;
        }

        for(int i=2;i * i<=n;i++) {
            for(int j=i * i;j<=n;j+=i) {
                prime[j]=1;
            }
        }

        for(int i = 2;i<=n;i++) {
            if(prime[i]==0) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
//        System.out.print(2+" ");
//        printPrime(n);

         sieveOfEratosthenes(n);
    }
}
