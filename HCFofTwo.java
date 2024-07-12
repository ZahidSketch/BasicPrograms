public class HCFofTwo {

    static int hcf(int a, int b) {

        // Using Factors Method
        if(a == 0) return b;
        if(b == 0) return a;
        if(b == a) return a;

        // Using conditionals
//        int ans = (a < b) ? a : b;
//        while(true){
//
//            if((a % ans) == 0 && (b % ans) == 0) break;
//            ans--;
//        }
//        return ans;

        // Using Rcursion
        if(a > b) return hcf(a - b,  b);
        else return hcf( a, b - a);

    }
    public static void main(String[] args){
        int a = 20, b = 10;
        int c = hcf(a, b);
        System.out.println("HCF is : "+c);
    }
}
