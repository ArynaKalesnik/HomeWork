import java.util.Scanner;

public class Ex3 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("give the size of A: ");
    int a = scanner.nextInt();
    System.out.println("give the size of B: ");
    int b = scanner.nextInt();
    System.out.println("give the size of N: ");
    int n = scanner.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = (int)(Math.random() * (b - a + 1)) + a;
        System.out.println(arr[i] + " ");
    }
    int max = arr[0];
    int index = 0;
    for (int i = 1; i < n; i++){
        if (arr[i] > max) {
            max = arr[i];
            index = i;
        }
    }
    System.out.println("maximum is " + max + " index: " + index);
   } 
}
