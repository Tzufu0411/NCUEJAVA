package s1561117_1_quiz_ch3;
import java.util.Scanner;
public class S1561117_1_quiz_ch3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a five-digit integer: ");
        int number = input.nextInt();
        boolean isPalindrome = false;
        if (number/10000 == number%10 && number%100/10 == number%10000/1000) {
            isPalindrome = true;
        }
        System.out.println(isPalindrome);
    }
}
