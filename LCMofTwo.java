public class LCMofTwo {

    static int lcm(int a, int b) {

        // Using Factors Method
        int ans = (a > b) ? a : b;

        while(true){

            if(ans % a == 0 && (ans & b) == 0) break;
        ans++;
        }
        return ans;
    }
    public static void main(String[] args){
        int a = 5, b = 10;
        int c = lcm(a, b);
        System.out.println("LCM is : "+c);
    }
}
