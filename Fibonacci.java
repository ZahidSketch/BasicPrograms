public class Fibonacci {

    static void fibonacci(int a, int b, int n) {

        // Using Recursion
//        if(n >= 20) {
//            return;
//        }
//            int c = a + b;
//            System.out.print(c+" ");
//            a = b;
//            b = c;
//            fibonacci(a, b, n+1);

        // Using loop
        int c = 0;
        for(int i = 0; i < n; i ++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }

    }
    public static void main(String[] args){
        System.out.print(0+" ");
        System.out.print(1+" ");
        fibonacci(0, 1, 20);
    }
}