import java.util.ArrayList;
import java.util.Collections;

public class LargestOFThree {

    //   static int max(int a, int b, int c) {

        // Using ternary Operator
        //return c > ((a > b) ? a : b) ? c : ((a > b) ? a : b);

        // Using if-else statements
//        if(a>b && a>c){
//           return a;
//        }
//        else if(b>a && b>c){
//            return b;
//        }
//        else
//            return c;


       // Using Math.max Method
//        return Math.max(Math.max(a, b), c);

//}
    public static void main(String[] args){

        int a = 12, b = 9, c = 4;
        //int max = max(a, b, c);

        // Using Collections.max Method
        ArrayList<Integer> list = new ArrayList();
        list.add(a);
        list.add(b);
        list.add(c);
        int max = Collections.max(list);
        System.out.println("The largest number is : "+max);
    }
}
