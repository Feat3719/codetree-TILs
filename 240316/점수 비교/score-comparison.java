import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aMathScore = sc.nextInt(), aEnglishScore = sc.nextInt();
        int bMathScore = sc.nextInt(), bEnglishScore = sc.nextInt();
        if (aMathScore > bMathScore && aEnglishScore > bEnglishScore)
            System.out.println(1);
        else
            System.out.println(0);
        sc.close();
    }
}