package HomeWork7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3 {
    public static void main(String[] args) {
        String text = "ahb acb aeb aeeb adcb axeb";
        Matcher matcher = Pattern.compile("a.b").matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
