import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt(), second = sc.nextInt(), third = sc.nextInt();
        if (first < second && first < third)
            System.out.print(1 + " ");
        else
            System.out.print(0 + " ");
        if (first == second && first == third)
            System.out.print(1);
        else
            System.out.print(0);
        sc.close();
    }
}