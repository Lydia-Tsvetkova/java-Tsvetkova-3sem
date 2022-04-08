package ru.spbu.arts.java.oop.interfaces;

import ru.spbu.arts.java.oop.ascigraphics.Drawing;

import static ru.spbu.arts.java.oop.interfaces.Anon.createAnon;

public class ExperimentsWithPrintable {
    public static void main(String[] args) {

        PrintableLetter pl = new PrintableLetter("x", 10){};
        pl.print();
        PrintableString ps = new PrintableString("asdf"){};
        ps.print();
        Drawing dr = new Drawing(0,0, '_'){};
        dr.print();
        Printable[] a = new Printable[5];
        a[0] = new PrintableLetter("y", 5);
        a[1] = new PrintableString("qwerty");
        a[2] = new Drawing(0,0, '-');
        PrintableString anonref = createAnon();
        a[3] = anonref;
        Printable lambda = () -> System.out.println("Hi, I am lambda!");
        a[4] = lambda;
        for (int i = 0; i < a.length; i++) {
            a[i].print();
        }
    }
}
