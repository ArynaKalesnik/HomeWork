package HomeWork7;

import java.util.Scanner;

public class IncorrectInfoExeption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("введите своё ФИО через пробел: ");
            String familyName = sc.nextLine();

            System.out.print("укажите свой возраст: ");
            int age = sc.nextInt();

            if (age < 0 || age > 100)
                throw new IncorrectInfoException("неправильный возраст", familyName, age);

            if (familyName.length() > 200)
                throw new IncorrectInfoException("неправильтное ФИО", familyName, age);

            System.out.println("всё нормально");

        } catch (IncorrectInfoException e) {
            System.out.println("ошибка: " + e.getMessage());
            e.printStackTrace(); 
        }
    }
}
