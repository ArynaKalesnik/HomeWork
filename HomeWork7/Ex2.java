package HomeWork7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give information ");
        String text = sc.nextLine();

        Pattern p = Pattern.compile("/[\\s\\S]/g");
        Matcher m = p.matcher(text);

        if (m.find()) {
            System.out.println("there is such a link" + m.group());
        } else {
            System.out.println("no links ");
        }
    }
}
