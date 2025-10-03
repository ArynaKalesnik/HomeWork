public class Ex6 {
    public static void main(String[] args) {
        int number = 1;

        do {
            if (number % 5 == 0) {
                System.out.println(number);
            }
            number = number + 1;
        } while (number <= 100);
    }
}
