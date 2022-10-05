package com.example.calculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/

        VBox contenido = new VBox();

        TextField resultado = new TextField();
        resultado.setEditable(false);
        HBox hbTF = new HBox(resultado);
        hbTF.setAlignment(Pos.CENTER);
        //hbTF.setPadding(new Insets(10));
        hbTF.setHgrow(resultado, Priority.ALWAYS);

        contenido.getChildren().add(hbTF);

        HBox hbBotones = new HBox();

        GridPane grid = new GridPane();

        ColumnConstraints column1 = new ColumnConstraints();

        hbBotones.getChildren().add(grid);
        hbBotones.setAlignment(Pos.CENTER);
        hbBotones.setFillHeight(true);
        hbBotones.setHgrow(grid, Priority.ALWAYS);
        contenido.getChildren().add(hbBotones);

        Button btn1 = new Button();
        btn1.setText("1");
        btn1.setMaxWidth(100);
        GridPane.setFillWidth(btn1, true);
        GridPane.setFillHeight(btn1, true);
        grid.add(btn1,0,0);

        Button btn2 = new Button();
        btn2.setText("2");
        GridPane.setFillWidth(btn2, true);
        GridPane.setFillHeight(btn2, true);
        grid.add(btn2,1,0);

        Button btn3 = new Button();
        btn3.setText("3");
        GridPane.setFillWidth(btn3, true);
        GridPane.setFillHeight(btn3, true);
        grid.add(btn3,2,0);

        Button btn4 = new Button();
        btn4.setText("4");
        GridPane.setFillWidth(btn4, true);
        GridPane.setFillHeight(btn4, true);
        grid.add(btn4,0,1);

        Button btn5 = new Button();
        btn5.setText("5");
        grid.add(btn5, 1,1);
        GridPane.setFillWidth(btn5, true);
        GridPane.setFillHeight(btn5, true);

        Button btn6 = new Button();
        btn6.setText("6");
        grid.add(btn6,2,1);
        GridPane.setFillWidth(btn6, true);
        GridPane.setFillHeight(btn6, true);

        Button btn7 = new Button();
        btn7.setText("7");
        GridPane.setFillWidth(btn7, true);
        GridPane.setFillHeight(btn7, true);
        grid.add(btn7, 0,2);

        Button btn8 = new Button();
        btn8.setText("8");
        GridPane.setFillWidth(btn8, true);
        GridPane.setFillHeight(btn8, true);
        grid.add(btn8,1,2);

        Button btn9 = new Button();
        btn9.setText("9");
        GridPane.setFillWidth(btn9, true);
        GridPane.setFillHeight(btn9, true);
        grid.add(btn9,2,2);

        Button btn0 = new Button();
        btn0.setText("0");
        GridPane.setFillWidth(btn0, true);
        GridPane.setFillHeight(btn0, true);
        grid.add(btn0,0,3);





        Scene scene = new Scene(contenido, 200, 150);
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(true);
    }

    public static void main(String[] args) {
        launch();
    }
}