import java.util.Scanner;

public class uva408 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int step = sc.nextInt();
            int mod = sc.nextInt();
            int gcd = gcd(step, mod);
            if (gcd == 1) {
                System.out.printf("%10d%10d%s", step, mod, "    Good Choice\n\n");
            } else {
                System.out.printf("%10d%10d%s", step, mod, "    Bad Choice\n\n");
            }
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
