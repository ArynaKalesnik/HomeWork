package HomeWork7;

public class Ex1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 56;

        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(a).append("+").append(b).append("=").append(a + b);

        System.out.println(stringBuilder1);


        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(a).append("-").append(b).append("=").append(a - b);
        System.out.println(stringBuilder2);

        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(a).append("*").append(b).append("=").append(a * b);
        System.out.println(stringBuilder3);

        String result = stringBuilder1.toString().replace("=", "equals");
        System.out.println(result);
    }
}
