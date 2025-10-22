package HomeWork7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex4 {
    public static void main(String[] args) {
        String text = "ab abab abab abababab abea";
        Matcher matcher = Pattern.compile("ab").matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}
