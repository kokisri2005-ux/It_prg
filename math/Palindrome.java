public class Palindrome {
    public static void main(String[] args) {
        int x = 121;
        int original = x;
        int reversed = 0;

        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        System.out.println(original == reversed);
    }
}
