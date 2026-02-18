public class Bottles {
    public static void main(String[] args) {
        int bottles = 9;
        int exchange = 3;
        int total = bottles;

        while (bottles >= exchange) {
            int newBottles = bottles / exchange;
            total += newBottles;
            bottles = newBottles + (bottles % exchange);
        }

        System.out.println(total);
    }
}
