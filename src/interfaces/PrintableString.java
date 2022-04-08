package ru.spbu.arts.java.oop.interfaces;

public class PrintableString implements Printable {
    public String content;

    public PrintableString(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(content);
    }
}
