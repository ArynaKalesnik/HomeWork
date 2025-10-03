public class Ex3 {
    public static void main(String[] args) {
        int a = 999, b = 998, c = 55;
        int sum;

        if (a <= b && a <= c) {
           sum = b + c;
        } else if (b <= a && b <= c ) {
            sum = a + c; 
        } else {
            sum = a + b;
        }
        System.out.println("The sum of 2 largest numbers is " + sum);
    }
}
