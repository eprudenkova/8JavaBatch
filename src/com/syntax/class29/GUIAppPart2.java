package com.syntax.class29;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class GUIAppPart2 extends Application implements EventHandler<ActionEvent> { //Application is a abstract class

    TextField text;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button button = new Button("Click Me");
        Label label = new Label("Enter your name");
        text = new TextField("Enter Your Name");//Text box
        VBox vBoxLayout = new VBox();//button is in the left side and top
//        StackPane vBoxLayout = new StackPane();//button is in the center
        vBoxLayout.getChildren().add(label);
        button.setOnAction(this);
        vBoxLayout.getChildren().add(text);
        vBoxLayout.getChildren().add(button);
        Scene scene = new Scene(vBoxLayout, 600, 600);
        primaryStage.setTitle("Next Billion Dollar App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        System.out.println(text.getCharacters());
    }
}
