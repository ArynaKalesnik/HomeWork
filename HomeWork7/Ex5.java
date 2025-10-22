package HomeWork7;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите любую дату (YYYY/MM/DD HH:MM): ");
        String date = scanner.nextLine();

        boolean ok = true;
                if (ok) System.out.println("дата существует");
        else System.out.println("дата не существует");
    }
}
