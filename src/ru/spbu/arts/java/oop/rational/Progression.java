package ru.spbu.arts.java.oop.rational;

public class Progression {
    public static double progression(int n) {
        double sum = 0;
        if (n == 1) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            sum += 1/(double)i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(progression(1));
        System.out.println(progression(2));
        System.out.println(progression(3));
        System.out.println(progression(20));
    }
}

