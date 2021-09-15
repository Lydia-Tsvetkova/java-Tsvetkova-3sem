import java.util.Scanner;

public class IntroTask3Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x / 100 > 0 & x / 100 < 9) {
            System.out.println("Число содержит ровно 3 цифры");
        } else {
                System.out.println("Число не содержит ровно 3 цифры");
            }
            in.close();
        }
    }
