import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String x = scanner.nextLine();

            if (x.length() > 10) {
                String y = x.charAt(0) + String.valueOf(x.length() - 2) + x.charAt(x.length() - 1);
                System.out.println(y);
            } else {
                System.out.println(x);
            }
        }
    }
}
