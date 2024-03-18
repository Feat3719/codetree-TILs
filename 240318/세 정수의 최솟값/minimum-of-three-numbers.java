import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), min;
        if (a < b && a < c)
            min = a;
        else if (b < a && b < c)
            min = b;
        else if (c < a && c < b)
            min = c;
        else
            min = a;
        System.out.println(min);
        sc.close();
    }
}