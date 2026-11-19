package s1561117_b;
import java.util.Scanner;
public class S1561117_b {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    System.out.println(a/100 + (a/10)%10 + a%10);
    }    
}
