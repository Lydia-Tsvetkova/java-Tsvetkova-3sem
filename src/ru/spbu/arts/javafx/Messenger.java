        package ru.spbu.arts.javafx;

        import javafx.application.Application;
        import javafx.collections.FXCollections;
        import javafx.collections.ObservableList;
        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.scene.control.*;
        import javafx.scene.control.Button;
        import javafx.scene.layout.*;
        import javafx.stage.Stage;

// У меня не получается загнать Button под TextArea :(

public class Messenger extends Application {

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

        TextArea textArea = new TextArea();
        Label lbl = new Label("Contacts");
        textArea.setEditable(false);
        TextField textField = new TextField();
        javafx.scene.control.Button btn = new Button("Send");
        ObservableList<String> elements = FXCollections.observableArrayList("Please", "Help", "Me", "I", "Don't", "Understand","What","I'm","Doing");
        ListView<String> contacts = new ListView<String> (elements);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent args) {
                textArea.setText(textArea.getText() + '\n' + textField.getText());
                textField.clear();
            }
        });

        panel0.add(textArea, 0, 1, 1, 1);
        panel0.add(lbl, 2, 0);
        panel0.add(textField, 0, 2);
        panel0.add(btn, 1, 2);
        panel0.add(contacts, 2, 1, 2, 2);

        textField.setPrefHeight(15);
        AnchorPane.setLeftAnchor(textField, 0.0);
        AnchorPane.setRightAnchor(textField, 0.0);

        AnchorPane.setTopAnchor(textArea, 0.0);
        AnchorPane.setLeftAnchor(textArea, 0.0);
        AnchorPane.setRightAnchor(textArea, 0.0);

        contacts.setMinWidth(150);
        contacts.setPrefWidth(150);


        lbl.setMinWidth(150);
        lbl.setPrefWidth(150);


        btn.setPrefHeight(15);
        btn.setPrefWidth(60);
        btn.setMinWidth(60);

        ColumnConstraints c1 = new ColumnConstraints();
        c1.setHgrow(Priority.ALWAYS);
        ColumnConstraints c2 = new ColumnConstraints();
        c2.setPrefWidth(60);
        ColumnConstraints c3 = new ColumnConstraints();
        c3.setPrefWidth(130);

        panel0.getColumnConstraints().addAll(c1, c2, c3);

        RowConstraints r1 = new RowConstraints();
        r1.setPrefHeight(15);
        RowConstraints r2 = new RowConstraints();
        r2.setVgrow(Priority.ALWAYS);
        RowConstraints r3 = new RowConstraints();

        panel0.getRowConstraints().addAll(r1, r2, r3);

        return panel0;
    }
}

