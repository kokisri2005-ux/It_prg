public class MinCut {
    public static void main(String[] args) {
        int n = 4;

        if (n == 1) {
            System.out.println(0);
        } else if (n % 2 == 0) {
            System.out.println(n / 2);
        } else {
            System.out.println(n);
        }
    }
}
