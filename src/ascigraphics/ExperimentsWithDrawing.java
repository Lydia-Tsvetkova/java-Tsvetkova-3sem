package ru.spbu.arts.java.oop.ascigraphics;

import java.util.Arrays;

public class ExperimentsWithDrawing {
    public static void main(String[] args) {
        Drawing drawing1 = new Drawing(10, 10, '.');
        drawing1.printing();
        System.out.print('\n');
        Arrays.stream(drawing1.setPoint(3, 3, 'x', drawing1.array())).forEach(System.out::println);
        System.out.print('\n');
        Arrays.stream(drawing1.drawHorizontalLine(3, 9, 3, '/', drawing1.array())).forEach(System.out::println);
        System.out.print('\n');
        Arrays.stream(drawing1.drawVerticalLine(3, 1, 5, '/', drawing1.array())).forEach(System.out::println);
        System.out.print('\n');
        Arrays.stream(drawing1.drawRectangle(2,5,1,1,'*',drawing1.array())).forEach(System.out::println);
        System.out.print('\n');
        Arrays.stream(drawing1.drawRectangle(5,5,2,5,'*',drawing1.array())).forEach(System.out::println);
        System.out.print('\n');
        Arrays.stream(drawing1.drawCircle(5,5,3,'*',drawing1.array())).forEach(System.out::println);
        System.out.print('\n');
        Arrays.stream(drawing1.draw(5,5,"Square_4x4","Cross_5x5",drawing1.array())).forEach(System.out::println);
        System.out.print('\n');
        Arrays.stream(drawing1.draw(5,5,"Circle_3x3","Cross_5x5",drawing1.array())).forEach(System.out::println);
        System.out.print('\n');
        Drawing house = new Drawing(15, 50, '.');
        Arrays.stream(house.house()).forEach(System.out::println);
    }
}
