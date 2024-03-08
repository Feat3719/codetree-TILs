public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 5;
        int b = 6;
        int c = 7;
        int temp, temp2;
        temp = a;
        temp2 = b;
        a = c;
        b = temp;
        c = temp2;
        System.out.print(a + "\n" + b + "\n" + c);
    }
}