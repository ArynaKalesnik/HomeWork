import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "";

        while (text.length() == 0) {
            System.out.print("give a line: ");
            text = sc.nextLine();
            if (text.length() == 0) {
                System.out.println("repeat please");
            }
        }

        System.out.print("give symbol a: ");
        char a = sc.next().charAt(0);

        System.out.print("gibe symbol b: ");
        char b = sc.next().charAt(0);

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == a) {
                result = result + b;
            } else {
                result = result + text.charAt(i);
            }
        }

        System.out.println("the result is " + result);
    }
}
