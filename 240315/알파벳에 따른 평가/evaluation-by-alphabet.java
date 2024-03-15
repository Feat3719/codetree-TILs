import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char firstLetter = sc.next().charAt(0);
        if (firstLetter == 'S')
            System.out.println("Superior");
        else if (firstLetter == 'A')
            System.out.println("Excellent");
        else if (firstLetter == 'B')
            System.out.println("Good");
        else if (firstLetter == 'C')
            System.out.println("Usually");
        else if (firstLetter == 'D')
            System.out.println("Effort");
        else
            System.out.println("Failure");

        sc.close();
    }
}