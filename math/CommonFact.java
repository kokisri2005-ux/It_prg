public class CommonFact {
    public static void main(String[] args) {
        int a = 12, b = 6;
        int count = 0;

        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
