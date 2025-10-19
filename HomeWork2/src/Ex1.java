public class Ex1 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 90 + 10);
            System.out.println(arr[i] + "");
        }
        boolean increasing = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                increasing = false;
            }
        }
        if (increasing)
        System.out.println("массив возрастает");
        else
        System.out.println("массив не возрастает");
    }

}
