import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = scanner.nextLine();
        String[] parts = phoneNumber.split("-");
        String newPhoneNumber = parts[0] + "-" + parts[2] + "-" + parts[1];
        System.out.println(newPhoneNumber);
        scanner.close();

    }
}