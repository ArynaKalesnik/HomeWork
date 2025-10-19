import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, min, max;
        while (true) {
            System.out.println("введите размер массива ");
            n = scanner.nextInt();
            System.out.println("введите нижний порог ");
            min = scanner.nextInt();
            System.out.println("введите верхний порог ");
            max = scanner.nextInt();

            if (n > 0 && min <= max) break;
            System.out.println("ошибка, повторите попытку ");
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * (max - min + 1)) + min;
            System.out.println(arr[i] + " ");
        }
    }
}
