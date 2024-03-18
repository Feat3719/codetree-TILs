import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt(), second = sc.nextInt(), third = sc.nextInt();
        int isFirstMin = (first <= second && first <= third) ? 1 : 0;
        int areAllEqual = (first == second && first == third) ? 1 : 0;
        System.out.println(isFirstMin + " " + areAllEqual);
        sc.close();
    }
}