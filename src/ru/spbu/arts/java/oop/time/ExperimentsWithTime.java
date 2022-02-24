package ru.spbu.arts.java.oop.time;

public class ExperimentsWithTime {
    public static void main(String[] args) {
        Time time1 = new Time();
        time1.mins = 20;
        time1.hours = 5;
        time1.show();
        time1.sayHello();
        time1.add(120);
        time1.show();
        time1.add(1320);
        time1.show();
        time1.add(600);
        time1.show();
        time1.sayHello();
        time1.add(320);
        time1.show();
        time1.sayHello();
        time1.add(320);
        time1.show();
        time1.sayHello();
    }
}
