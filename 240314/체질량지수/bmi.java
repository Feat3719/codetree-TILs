import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cm = sc.nextInt(), kg = sc.nextInt(), bmi = kg * 100 * 100 / (cm * cm);
        System.out.println(bmi);
        if (bmi >= 25) {
            System.out.print("Obesity");
        }
        sc.close();
    }
}