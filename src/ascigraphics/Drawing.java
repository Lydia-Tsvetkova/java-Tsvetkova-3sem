package ru.spbu.arts.java.oop.ascigraphics;


import java.util.Arrays;
import ru.spbu.arts.java.oop.interfaces.Printable;
//import java.util.HashMap;
//import java.util.Map;

public class Drawing implements Printable {
    public int row;
    public int column;
    public char symbol;

    public Drawing(int row, int column, char symbol) {
        this.row = row;
        this.column = column;
        this.symbol = symbol;
    }

    @Override
    public void print() {
        System.out.println(symbol);
    }

    public void printing() {
        Arrays.stream(this.array()).forEach(System.out::println);
    }

    public char[][] array() {
        char[][] charArray = new char[this.row][this.column];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                charArray[i][j] = this.symbol;
            }
        }
        return charArray;
    }

    public char[][] setPoint(int x, int y, char imposter, char[][] charArray) {
        charArray[y-1][x - 1] = imposter;
        return charArray;
    }

    public char[][] drawHorizontalLine ( int x1, int x2, int y, char imposter, char[][] charArray) {
        for (int i = 0; i < this.column; i++) {
            if (i >= x1-1 & i < x2) {
                charArray[y-1][i] = imposter;
            }
        }
        return charArray;
    }

    public char[][] drawVerticalLine ( int x, int y1, int y2, char imposter, char[][] charArray){
        for (int i = 0; i < this.row; i++) {
            if (i >= y1-1 & i < y2) {
                charArray[i][x-1] = imposter;
            }
        }
        return charArray;
    }

    public char[][] drawRectangle(int x1, int x2, int y1, int y2, char imposter, char[][] charArray){
        if (y1 == y2) {
            for (int i = 0; i <= Math.abs(x2 - x1); i++) {
                charArray = this.drawHorizontalLine(x1, x2, y1 + i, imposter, charArray);
            }
        }
        if (x1 == x2) {
            for (int i = 0; i <= Math.abs(y2 - y1); i++) {
                charArray = this.drawVerticalLine(x1 + i, y1, y2, imposter, charArray);
            }
        }
        return charArray;
   }

    public char[][] drawCircle(int x, int y, int r, char imposter, char[][] charArray){
        for (int i = 0; i <= r; i++) {
            charArray = this.drawHorizontalLine(x - i, x + i, y - r + i, imposter, charArray);
        }
        for (int i = 0; i <= r; i++) {
            charArray = this.drawHorizontalLine(x - r + i, x + r - i, y + i, imposter, charArray);
        }
        return charArray;
    }

    public char[][] draw(int x, int y, String figure1, String figure2, char[][] charArray){
        if (figure1 == "Square_4x4") {
            charArray = drawRectangle(x-2, x+2, y, y, '*', charArray);
        }
        if (figure1 == "Circle_3x3") {
            charArray = drawCircle(x, y, 3, '@', charArray );
        } else {
            charArray = drawHorizontalLine(x-2, x+2, y, '/', drawVerticalLine(x, y - 2, y + 2, '/', charArray));
        }
        if (figure2 == "Square_4x4") {
            charArray = drawRectangle(x-2, x+2, y, y, '*', charArray);
        }
        if (figure2 == "Circle_3x3") {
            charArray = drawCircle(x, y, 3, '@', charArray );
        } else {
            charArray = drawHorizontalLine(x-2, x+2, y, '/', drawVerticalLine(x, y - 2, y + 2, '/', charArray));
        }
        return charArray;
    }

    public char[][] house(){
        char [][] charArray = this.array();
        charArray = drawCircle(25, 10, 5, '/', charArray);
        charArray = drawCircle(18, 10, 3, '/', charArray);
        charArray = drawRectangle(25, 30, 10, 10, '*', charArray);
        charArray = drawRectangle(20, 25, 10, 10, '*', charArray);
        charArray = drawRectangle(15, 20, 10, 10, '*', charArray);
        charArray = drawRectangle(17, 19, 13, 13, '@', charArray);
        charArray = drawVerticalLine(25, 1, 4,'#', charArray);
        charArray = drawHorizontalLine(23, 27,2,'#', charArray);
        return charArray;
   }

}

