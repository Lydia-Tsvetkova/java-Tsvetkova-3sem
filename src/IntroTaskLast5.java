import java.util.Scanner;

public class IntroTaskLast5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x % 10 == 5) {
            System.out.println("На конце числа цифра 5");
        } else {
            System.out.println("На конце числа не цифра 5");
        }
        in.close();
    }
}