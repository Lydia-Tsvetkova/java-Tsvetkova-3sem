import java.util.Scanner;

public class IntroTaskCat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x % 10 == 1) {
            System.out.print(x + " кот");
        } else {
            if (x % 10 == 2 | x % 10 == 4) {
                System.out.print(x + " кота");
            } else {
                if (x % 10 > 4 | x % 10 == 0) {
                    System.out.print(x + " котов");
                }
            }
        }
        in.close();
    }
}
