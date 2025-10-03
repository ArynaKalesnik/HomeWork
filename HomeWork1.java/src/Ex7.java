public class Ex7 {
    public static void main(String[] args) {
        int number = 1111898948;
        int factorial = 1;

        for (int i = 1; i <= number; i = i + 1) {
            factorial = factorial * i;
        }
        System.out.println("Factorial " + number + " = " + factorial);
    }
}
