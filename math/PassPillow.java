public class PassPillow {
    public static void main(String[] args) {
        int n = 4;
        int time = 5;

        int position = 1;
        int direction = 1;

        for (int i = 0; i < time; i++) {
            position += direction;

            if (position == n || position == 1) {
                direction *= -1;
            }
        }

        System.out.println(position);
    }
}
