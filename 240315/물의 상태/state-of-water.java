import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temper = sc.nextInt();
        if (temper < 0)
            System.out.println("ice");
        else if (temper >= 100)
            System.out.println("vapor");
        else
            System.out.println("water");

        sc.close();
    }
}