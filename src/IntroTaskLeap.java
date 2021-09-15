import java.util.Scanner;

public class IntroTaskLeap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            if (x % 4 == 0 & x % 100 > 0) {
                System.out.println("Год високосный");
            } else {
                System.out.println("Год не високосный");
            }
        }
        in.close();
    }
}
