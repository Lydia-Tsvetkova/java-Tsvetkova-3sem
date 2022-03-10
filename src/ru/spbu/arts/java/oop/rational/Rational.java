package ru.spbu.arts.java.oop.rational;

public class Rational {
    private int n = 1;
    private int d = 1;
    static String zero = "0/0";
    static String one = "1/1";

    public Rational (int n) {
        this.n = n;
    }

    public Rational (int n, int d) {
        int gcd = GCD(n, d);
        this.n = n / gcd;
        this.d = d / gcd;
    }

    public int getNumerator() {
        return n;
    }

    public int getDenominator() {
        return d;
    }

    public String toString() {
        if (this.n == 0) {
            return "0";
        }
        if (this.d == 1) {
            return this.n + "";
        }
        return this.n + "/" + this.d;
    }

    public double toDouble(int a) {
        double da = a;
        return da;
    }

    public static int GCD(int a, int b) {
        int n = Math.abs(a);
        if (n == 0)
            return b;

        while (b != 0) {
            if (n > b)
                n -= b;
            else
                b -= n;
        }
        return n;
    }

    public static Rational add(Rational r1, Rational r2) {
        int n = r1.n;
        int d = r1.d;
        int add_n = r2.n;
        int add_d = r2.d;
        int gcd = GCD(n, d);
        int lcm = d * add_d / gcd;
        n *= lcm / d;
        d *= lcm / d;
        add_n *= lcm / add_d;
        n += add_n;
        n /= gcd;
        d /= gcd;
        return new Rational(n, d);

    }
    //public void addInPlace(Rational r) {
        //int add_n = r.n;
        //int add_d = r.d;
        //int gcd = GCD(this.n, this.d);
        //int lcm = this.d * add_d / gcd;
        //this.n *= lcm / this.d;
        //this.d *= lcm / this.d;
        //add_n *= lcm / add_d;
        //add_d *= lcm / add_d;
        //this.n += add_n;
        //gcd = GCD(this.n, this.d);
        //this.n /= gcd;
        //this.d /= gcd;
    //}

    public static Rational sub(Rational r1, Rational r2) {
        int n = r1.n;
        int d = r1.d;
        int add_n = r2.n;
        int add_d = r2.d;
        int gcd = GCD(n, d);
        int lcm = d * add_d / gcd;
        n *= lcm / d;
        d *= lcm / d;
        add_n *= lcm / add_d;
        n -= add_n;
        n /= gcd;
        d /= gcd;
        return new Rational(n, d);
    }

    //public void subInPlace(Rational r) {
        //int add_n = r.n;
        //int add_d = r.d;
        //int gcd = GCD(this.n, this.d);
        //int lcm = this.d * add_d / gcd;
        //this.n *= lcm / this.d;
        //this.d *= lcm / this.d;
        //add_n *= lcm / add_d;
        //add_d *= lcm / add_d;
        //this.n -= add_n;
        //gcd = GCD(this.n, this.d);
        //this.n /= gcd;
        //this.d /= gcd;
    //}

    public static Rational mul(Rational r1, Rational r2) {
        int n = r1.n * r2.n;
        int d = r1.d * r2.d;
        int gcd = GCD(n, d);
        n /= gcd;
        d /= gcd;
        return new Rational(n, d);
    }

    //public void mulInPlace(Rational r) {
        //this.n *= r.n;
        //this.d *= r.d;
        //int gcd = GCD(this.n, this.d);
        //this.n /= gcd;
        //this.d /= gcd;
    //}

    public static Rational div(Rational r1, Rational r2) {
        int n = r1.n * r2.d;
        int d = r1.d * r2.n;
        int gcd = GCD(n, d);
        n /= gcd;
        d /= gcd;
        return new Rational(n, d);
    }

    //public void divInPlace(Rational r) {
        //this.n *= r.d;
        //this.d *= r.n;
        //int gcd = GCD(this.n, this.d);
        //this.n /= gcd;
        //this.d /= gcd;
    //}
}