import java.util.Scanner;

public class PatternPrograms {
    public static void numberTriangle(int n) {
        System.out.println("Number Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void numberDiamond(int n) {
        System.out.println("\nNumber Diamond Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void binaryPattern(int n) {
        System.out.println("\nBinary Number Pattern:");

        for (int i = 1; i <= n; i++) {
            int num = (i % 2 == 1) ? 1 : 0;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num = (num == 1) ? 0 : 1;
            }
            System.out.println();
        }
    }
    public static void pyramidStar(int n) {
        System.out.println("\nPyramid Star Pattern:");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invertedRightTriangle(int n) {
        System.out.println("\nInverted Right Triangle Star Pattern:");

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        numberTriangle(n);
        numberDiamond(n);
        binaryPattern(n);
        pyramidStar(n);
        invertedRightTriangle(n);

        sc.close();
    }
}

