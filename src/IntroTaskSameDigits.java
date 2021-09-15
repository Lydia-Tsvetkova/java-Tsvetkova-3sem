import java.util.Scanner;

public class IntroTaskSameDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x % 10 == ((x % 100 - x % 10) / 10)) {
            System.out.println("На конце числа 2 одинаковые цифры");
        } else {
            System.out.println("На конце числа 2 не одинаковые цифры");
        }
        in.close();
    }
}