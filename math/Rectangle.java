public class Rectangle {
    public static void main(String[] args) {
        int area = 4;
        int w = (int)Math.sqrt(area);

        while (area % w != 0) {
            w--;
        }

        int l = area / w;

        System.out.println("Length = " + l);
        System.out.println("Width = " + w);
    }
}
