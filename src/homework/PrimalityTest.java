package src.homework;

public class PrimalityTest {
    public static String function(int x) {
        for (int i = 3; i <= x-1; i = i + 1) {
            if (x % i == 0) {
                String s = "Число непростое";
                return s;
            }
        }
        String s = "Число простое";
        return s;
    }

    public static void main(String[] args) {
        String result = function(4);
        System.out.println(result);
        String result_1 = function(19);
        System.out.println(result_1);
        String result_2 = function(15);
        System.out.println(result_2);
    }
}