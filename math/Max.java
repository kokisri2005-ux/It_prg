public class Max {
    public static void main(String[] args) {
        int num = 9669;
        String s = String.valueOf(num);
        s = s.replaceFirst("6", "9");
        System.out.println(Integer.parseInt(s));
    }
}

