import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        System.out.println(min);
        sc.close();
    }
}