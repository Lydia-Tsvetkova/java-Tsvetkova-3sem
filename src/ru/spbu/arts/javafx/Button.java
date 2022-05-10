        package ru.spbu.arts.javafx;

        import javafx.application.Application;
        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.geometry.Pos;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.scene.control.Label;
        import javafx.scene.layout.ColumnConstraints;
        import javafx.scene.layout.GridPane;
        import javafx.scene.layout.RowConstraints;
        import javafx.stage.Stage;

// У меня не получается загнать Button под TextArea :(

        public class Button extends Application {

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

                panel0.setAlignment(Pos.CENTER);
                panel0.setHgap(10);
                panel0.setVgap(12);

                javafx.scene.control.Button btn = new javafx.scene.control.Button("Don't push the button!");

                String[] phrases = new String[5];
                phrases[0] = "Excuse me? I said DON'T push me!";
                phrases[1] = "Was I stuttering? STOP it!";
                phrases[2] = "Stop listening The Pussycat Dolls, you pervert!";
                phrases[3] = "K! I'm fed up with your bs! You are done, baby...";

                final int[] count = {-1};

                btn.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent args) {

                        if (count[0] == 3) {
                            btn. setVisible(false);
                            Label lbl = new Label("Every time you have been pushing this button, I was secretly killing one kitten");
                            panel0.add(lbl, 0, 0);
                        }

                        count[0] += 1;
                        btn.setText(phrases[count[0]]); }
                });

                panel0.add(btn, 0, 0);

                ColumnConstraints c1 = new ColumnConstraints();

                panel0.getColumnConstraints().addAll(c1);

                RowConstraints r1 = new RowConstraints();

                panel0.getRowConstraints().addAll(r1);

                return panel0;
            }
        }

