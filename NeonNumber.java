public class NeonNumber {

    static boolean isNeon(int n) {

        int square = n*n;
        int N = 0;

        while(square != 0){
            square = square/10;
            ++N;
        }

        square = n*n;
        int sum = 0;

        while(square != 0){
            int d = square%10;
            sum += d;
            square = square/10;
        }

        if(sum == n) return true;
        else return false;
    }
    public static void main(String[] args) {

        int n = 9;
        boolean b = isNeon(n);
        if(b) System.out.println("Neon number");
        else System.out.println("Non number");
    }
}
