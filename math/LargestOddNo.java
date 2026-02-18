public class LargestOddNo {
    public static void main(String[] args) {
        String num = "89754948320905482";
        
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 != 0) {
                System.out.println(num.substring(0, i + 1));
                return;
            }
        }

        System.out.println("");
    }
}
