package ru.spbu.arts.java.oop.rational;

import static ru.spbu.arts.java.oop.rational.Rational.add;
import static ru.spbu.arts.java.oop.rational.Rational.sub;
import static ru.spbu.arts.java.oop.rational.Rational.mul;
import static ru.spbu.arts.java.oop.rational.Rational.div;

public class ExperimentsWithRational {
    public static void main(String[] args) {
        Rational rational1 = new Rational(1, 6);
        Rational rational2 = new Rational(1, 3);
        Rational rational3 = new Rational(0);
        System.out.println(rational1.toString());
        System.out.println(rational2.toString());
        System.out.println(rational3.toString());
        Rational rational4 = add(rational1, rational2);
        System.out.println(rational4.toString());
        System.out.println(rational1.toString());
        System.out.println(rational2.toString());
        //rational1.addInPlace(rational2);
        System.out.println(rational1.toString());
        System.out.println(rational2.toString());
        Rational rational5 = sub(rational1, rational2);
        System.out.println(rational5.toString());
        //rational5.mulInPlace(rational2);
        //System.out.println(rational5.toString());
        //rational5.divInPlace(rational1);
        //System.out.println(rational5.toString());
    }
}
