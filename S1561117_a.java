package s1561117_a;

public class S1561117_a {
    public static void main(String[] args) {
        int a = 0;
        double b = 1;
        double c = 1;
        while (a != 10) {
            a += 1;
            b *= a;
            c += (1 / b);
        }
        System.out.printf("%+012.6f\n", c);
    }
}
