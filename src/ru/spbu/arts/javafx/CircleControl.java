package ru.spbu.arts.javafx;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleControl extends Application {

    @Override
    public void start(Stage stage) {

        stage.setTitle("Messenger");

        Parent parent = initInterface();
        stage.setScene(new Scene(parent, 800, 500));
        stage.setMinWidth(500);

        stage.show();
    }

    private Parent initInterface() {
        GridPane panel0 = new GridPane();

        ColumnConstraints c1 = new ColumnConstraints();
        c1.setMinWidth(150);
        c1.setMaxWidth(150);
        ColumnConstraints c2 = new ColumnConstraints();
        c2.setHgrow(Priority.ALWAYS);
        panel0.getColumnConstraints().addAll(c1, c2);

        RowConstraints r1 = new RowConstraints();
        r1.setVgrow(Priority.ALWAYS);

        panel0.getRowConstraints().addAll(r1);

        Pane pane = new Pane();
        Circle circle = new Circle();

        circle.setRadius(0.0);

        Slider slider = new Slider();

        slider.maxProperty().bind(Bindings.createDoubleBinding(
                () -> (Math.min(pane.getHeight(),pane.getWidth()) / 2),
                pane.heightProperty(),pane.widthProperty() ));

        circle.radiusProperty().bind(Bindings.createDoubleBinding(
                slider::getValue,
                slider.valueProperty()
        ));

        circle.centerXProperty().bind(Bindings.createDoubleBinding(
                () -> (pane.getWidth() / 2),
                pane.widthProperty()
        ));

        circle.centerYProperty().bind(Bindings.createDoubleBinding(
                () -> (pane.getHeight() / 2),
                pane.heightProperty()
        ));

        ColorPicker pick1 = new ColorPicker();
        ColorPicker pick2 = new ColorPicker();
        Label lbl1 = new Label("Circle radius");
        Label lbl2 = new Label("Circle color");
        Label lbl3 = new Label("Background color");

        AnchorPane root = new AnchorPane(slider, pick1, pick2, lbl1, lbl2, lbl3);
        AnchorPane.setTopAnchor(lbl1, 20.0);
        AnchorPane.setTopAnchor(slider, 50.0);
        AnchorPane.setTopAnchor(lbl2, 120.0);
        AnchorPane.setTopAnchor(pick1, 150.0);
        AnchorPane.setTopAnchor(lbl3, 220.0);
        AnchorPane.setTopAnchor(pick2, 250.0);

        pane.getChildren().addAll(circle);
        panel0.add(pane, 1, 0);
        panel0.add(root, 0, 0);

        pick2.setOnAction(actionEvent -> {
            Color myColor = pick2.getValue();
            pane.setBackground(new Background(new BackgroundFill(myColor, CornerRadii.EMPTY, Insets.EMPTY)));
        });

        pick1.setOnAction(actionEvent -> {
            Color myColor = pick1.getValue();
            circle.setFill(myColor);
        });

        return panel0;
    }
}