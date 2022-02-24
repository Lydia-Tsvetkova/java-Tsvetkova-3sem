package ru.spbu.arts.java.oop.time;

public class Time {

    int mins;
    int hours;

    public String show() {
        if (this.hours < 10) {
            System.out.println('0' + Integer.toString(this.hours) + ':' + Integer.toString(this.mins));
        } else {
            System.out.println(Integer.toString(this.hours) + ':' + Integer.toString(this.mins));
        }
        return null;
    }

    boolean isMorning() {
        boolean b = this.hours >= 4 & this.hours < 12;
        return b;
    }

    boolean isDay() {
        boolean b = this.hours >= 12 & this.hours < 17;
        return b;
    }

    boolean isEvening() {
        boolean b = this.hours >= 17 & this.hours < 24;
        return b;
    }

    boolean isNight() {
        boolean b = this.hours >= 0 & this.hours < 4;
        return b;
    }

    String sayHello() {
        if (this.isMorning()) {
            System.out.println("Доброе утро!");
        }
        if (this.isDay()) {
            System.out.println("Добрый день!");
        }
        if (this.isEvening()) {
            System.out.println("Добрый вечер!");
        }
        if (this.isNight()) {
            System.out.println("Доброй ночи!");
        }

        return null;
    }

    void add(int mins) {
        this.mins += mins % 60;
        this.hours += mins / 60;
        if (this.hours >= 24) {
            this.hours = this.hours-24;
        }
    }
}