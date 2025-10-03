public class Ex8 {
    public static void main(String[] args) {
        int A = 465;
        int B = 592;
        int count = 0;

        for (int i = B - 1; i > A; i = i - 1) {
            System.out.println(i);
            count = count + 1;

        }
        System.out.println("Number of numerals is " + count);
    }
}
