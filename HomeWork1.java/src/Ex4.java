public class Ex4 {
    public static void main(String[] args) {
        int year = 2026;

        if (dividedBy(year, 4)) {
            System.out.println("The year " + year + "is leap year"); 
        } else if (dividedBy(year, 100)) {
            System.out.println("The year " + year + "is normal year");
        } else if (dividedBy(year, 400)) {
            System.out.println("The year " + year + "is leap year");
        } else {
            System.out.println("The year " + year + " is normal year");
        }
    }
    public static boolean dividedBy(int number, int divided) {
        int temp = number;
        while (temp >= divided) {
            temp = temp - divided;
        }
        return temp == 0;    

    }
    

} 


