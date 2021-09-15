import java.util.Scanner;

public class IntroTaskQuadraticEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int D = b*b - 4*a*c;
        if (a == 0 & b == 0 & c == 0){
            System.out.println("Бесконечно много решений");
        } else {
            if (D < 0) {
                System.out.println("Решений нет");
            } else {
                if (D == 0) {
                    float x = (float) -b/(2*a);
                    System.out.print("Один корень: " + x);
                } else {
                    float x1 = (float) ((-b + Math.pow(D, 0.5))/(2*a));
                    float x2 = (float) ((-b - Math.pow(D, 0.5))/(2*a));
                    System.out.print("2 корня: " + x1 + ", " + x2);
                    }
                }
        }
        in.close();
    }
}
