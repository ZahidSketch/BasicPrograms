public class AddBinaryStrings {

    public static String addBinary(String a, String b) {
//        int x = Integer.parseInt(a,2);
//        int y = Integer.parseInt(b,2);
//        int sum = x+y;
//        String res = Integer.toBinaryString(sum);
//        return res;

        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0) {

            int sum = carry;

            if(i >= 0) sum += a.charAt(i--) - '0';

            if(j >= 0) sum += b.charAt(j--) - '0';

            if(sum == 0 || sum == 1){
                sb.append(sum);
                carry = 0;
            }
            else if(sum == 2){
                sb.append("0");
                carry = 1;
            }
            else if(sum == 3){
                sb.append("1");
                carry = 1;
            }
            if(carry == 1){
                sb.append(carry);
            }
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        String s1 = "101";
        String s2 = "10";
        String ans = addBinary(s1, s2);
        System.out.println(ans);
    }
}
