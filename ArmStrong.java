public class ArmStrong{

    static void armStrongNumbers(int n, int k){

        for(int i = n + 1; i < k; i++){

            int N = 0;
            int j = i;

            while(j != 0 ){
                j = j / 10;
                ++N;
            }

            int sum = 0;
            j = i;

            while(j != 0){
                int d = j % 10;
                sum += Math.pow(d, N);
                j /= 10;
            }

            if(sum == i){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        int n1 = 100;
        int n2 = 500;
        armStrongNumbers(n1, n2);
    }
}