import java.util.Scanner;

public class SwapTwoNumbers {

    public static void swap(int[] arr) {
        // Using temp variable method
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//        Using bitwise operaters method
//         arr[0] = arr[0] ^ arr[1];
//         arr[1] = arr[0] ^ arr[1];
//         arr[0] = arr[0] ^ arr[1];
        // Using addition method
//            arr[0] = arr[0] + arr[1];
//            arr[1] = arr[0] - arr[1];
//            arr[0] = arr[0] - arr[1];
        // Using multiplication method
        arr[0] = arr[0] * arr[1];
        arr[1] = arr[0] / arr[1];
        arr[0] = arr[0] / arr[1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        int[] arr = {a, b};
        System.out.println("Before Swapping : a = " + arr[0] + " b = " + arr[1]);
        swap(arr);
        System.out.println("After Swapping : a = " + arr[0] + " b = " + arr[1]);
    }
}
