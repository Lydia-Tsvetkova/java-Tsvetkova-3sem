package ru.spbu.arts.javafx.images;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import static java.lang.Math.abs;
import static ru.spbu.arts.javafx.images.LCH.colorFromLCH;
import static ru.spbu.arts.javafx.images.WaveLengthToRGB.RGB_From_Wave_Length;

public class Images extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Colors and images");
        Parent parent = initInterface();
        primaryStage.setScene(new Scene(parent));
        initInteraction();
        primaryStage.show();
    }

    private void initInteraction() {
    }

    private Parent initInterface() {

        GridPane panel0 = new GridPane();
        Color myColor = Color.rgb(148, 152, 245);
        panel0.setBackground(new Background(new BackgroundFill(myColor, CornerRadii.EMPTY, Insets.EMPTY)));

        ColumnConstraints c1 = new ColumnConstraints();
        ColumnConstraints c2 = new ColumnConstraints();
        ColumnConstraints c3 = new ColumnConstraints();
        ColumnConstraints c4 = new ColumnConstraints();
        ColumnConstraints c5 = new ColumnConstraints();
        ColumnConstraints c6 = new ColumnConstraints();
        ColumnConstraints c7 = new ColumnConstraints();
        ColumnConstraints c8 = new ColumnConstraints();
        ColumnConstraints c9 = new ColumnConstraints();
        ColumnConstraints c10 = new ColumnConstraints();
        ColumnConstraints c11 = new ColumnConstraints();
        ColumnConstraints c12 = new ColumnConstraints();
        ColumnConstraints c13 = new ColumnConstraints();
        ColumnConstraints c14 = new ColumnConstraints();
        panel0.getColumnConstraints().addAll(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14);

        RowConstraints r1 = new RowConstraints();
        r1.setVgrow(Priority.ALWAYS);
        panel0.getRowConstraints().addAll(r1);

        Label lbl1 = new Label("Favourite color");
        Label lbl2 = new Label("RGB");
        Label lbl3 = new Label("HSB");
        Label lbl4 = new Label("Square");
        Label lbl5 = new Label("Circle");
        Label lbl6 = new Label("LCH");
        Label lbl7 = new Label("Rainbow");

        WritableImage img1 = new WritableImage(100, 100);
        WritableImage img2 = new WritableImage(256, 256);
        WritableImage img3 = new WritableImage(360, 100);
        WritableImage img4 = new WritableImage(100, 100);
        WritableImage img5 = new WritableImage(100, 100);
        WritableImage img6 = new WritableImage(360, 100);
        WritableImage img7 = new WritableImage(371, 100);

        PixelWriter pixelWriter1 = img1.getPixelWriter();
        PixelWriter pixelWriter2 = img2.getPixelWriter();
        PixelWriter pixelWriter3 = img3.getPixelWriter();
        PixelWriter pixelWriter4 = img4.getPixelWriter();
        PixelWriter pixelWriter5 = img5.getPixelWriter();
        PixelWriter pixelWriter6 = img6.getPixelWriter();
        PixelWriter pixelWriter7 = img7.getPixelWriter();

        for (int x = 0; x < 100; x++)
            for (int y = 0; y < 100; y++) {
                pixelWriter1.setColor(x, y, Color.rgb(237, 203, 250));
            }

        for (int x = 0; x < 256; x++)
            for (int y = 0; y < 256; y++) {
                pixelWriter2.setColor(x, y, Color.rgb(x, y, 123));
            }

        for (int x = 0; x < 360; x++)
            for (int y = 0; y < 100; y++) {
                pixelWriter3.setColor(x, y, Color.hsb(x, y*0.01, 0.5));
            }

        for (int x = 0; x < 100; x++)
            for (int y = 0; y < 100; y++) {
                pixelWriter4.setColor(x, y, Color.rgb(255, 255, 255));
            }

        for (int x = 25; x < 75; x++)
            for (int y = 25; y < 75; y++) {
                pixelWriter4.setColor(x, y, Color.rgb(0, 0, 0));
            }

        for (int x = 0; x < 100; x++)
            for (int y = 0; y < 100; y++) {
                pixelWriter5.setColor(x, y, Color.rgb(255, 255, 255));
            }

        for (int x = 0; x < 100; x++)
            for (int y = 0; y < 100; y++) {
                if (Math.sqrt(abs(50 - x)*abs(50 - x) + abs(50 - y)*abs(50 - y)) < 50) {
                    pixelWriter5.setColor(x, y, Color.rgb(1, 1, 1));
                }
            }

        for (int x = 0; x < 360; x++)
            for (int y = 0; y < 100; y++) {
                Color clr = colorFromLCH(x, y*0.01, 0.5);
                pixelWriter6.setColor(x, y, clr);
            }

        for (int y = 0; y < 100; y++) {
            int wave = 380;
            for (int x = 0; x < 371; x++) {
                while (wave <= 750) {
                    Color clr = RGB_From_Wave_Length(wave);
                    pixelWriter7.setColor(x, y, clr);
                    wave += 1;
                }
            }
        }

        ImageView viewer1 = new ImageView(img1);
        ImageView viewer2 = new ImageView(img2);
        ImageView viewer3 = new ImageView(img3);
        ImageView viewer4 = new ImageView(img4);
        ImageView viewer5 = new ImageView(img5);
        ImageView viewer6 = new ImageView(img6);
        ImageView viewer7 = new ImageView(img7);

        panel0.add(viewer1, 0, 0);
        panel0.add(lbl1, 0, 1);
        panel0.add(viewer2, 0, 2);
        panel0.add(lbl2, 0, 3);
        panel0.add(viewer3, 0, 4);
        panel0.add(lbl3, 0, 5);
        panel0.add(viewer4, 0, 6);
        panel0.add(lbl4, 0, 7);
        panel0.add(viewer5, 0, 8);
        panel0.add(lbl5, 0, 9);
        panel0.add(viewer6, 0, 10);
        panel0.add(lbl6, 0, 11);
        panel0.add(viewer7, 0, 12);
        panel0.add(lbl7, 0, 13);

        return panel0;
    }
}