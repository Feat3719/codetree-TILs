import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float leftSight = sc.nextFloat(), rightSight = sc.nextFloat();
        if (leftSight >= 1.0 && rightSight >= 1.0)
            System.out.println("High");
        else if (leftSight >= 0.5 && rightSight >= 0.5)
            System.out.println("Middle");
        else
            System.out.println("Low");
        sc.close();
    }
}