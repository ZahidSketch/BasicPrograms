import java.util.Scanner;

public class vowelCheck {

    static void VowelCheck(char ch) {

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch+" is Vowel");
        }
        else
            System.out.println(ch+" is Consonant");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);
        VowelCheck(ch);
    }
}
