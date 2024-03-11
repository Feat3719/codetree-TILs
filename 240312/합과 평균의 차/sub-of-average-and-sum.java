import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), sum = a + b + c, avg = sum / 3;
        System.out.print(sum + "\n" + avg + "\n" + (sum - avg));
        sc.close();
    }
}