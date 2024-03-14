import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (a > b) {
            System.out.print(a - b);
        } else if (a < b) {
            System.out.print(b - a);
        } else {
            System.out.print(0);
        }
        sc.close();
    }
}