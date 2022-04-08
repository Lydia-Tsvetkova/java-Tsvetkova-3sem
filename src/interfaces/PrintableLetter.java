package ru.spbu.arts.java.oop.interfaces;

public class PrintableLetter implements Printable {
    public String what;
    public int times;

    public PrintableLetter(String what, int times) {
        this.what = what;
        this.times = times;
    }

    @Override
    public void print() {
        for (int i = 0; i <= times; i++) {
            System.out.println(what);
        }
    }
}


