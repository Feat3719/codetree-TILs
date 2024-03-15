import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sight = sc.nextFloat();
        if (sight >= 1.0)
            System.out.println("High");
        else if (sight >= 0.5)
            System.out.println("Middle");
        else 
            System.out.println(":Low");

        sc.close();
    }
}