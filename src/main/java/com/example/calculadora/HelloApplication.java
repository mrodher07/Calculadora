package com.example.calculadora;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/

        AtomicReference<String> num1 = new AtomicReference<>("");

        GridPane grid = new GridPane();

        grid.setMinWidth(100);
        grid.setMinHeight(100);

        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(100/4);
        grid.getColumnConstraints().add(column1);

        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(100/4);
        grid.getColumnConstraints().add(column2);

        ColumnConstraints column3 = new ColumnConstraints();
        column3.setPercentWidth(100/4);
        grid.getColumnConstraints().add(column3);

        ColumnConstraints column4 = new ColumnConstraints();
        column4.setPercentWidth(100/4);
        grid.getColumnConstraints().add(column4);

        RowConstraints row1 = new RowConstraints();
        row1.setPercentHeight(100/5);
        grid.getRowConstraints().add(row1);

        RowConstraints row2 = new RowConstraints();
        row2.setPercentHeight(100/5);
        grid.getRowConstraints().add(row2);

        RowConstraints row3 = new RowConstraints();
        row3.setPercentHeight(100/5);
        grid.getRowConstraints().add(row3);

        RowConstraints row4 = new RowConstraints();
        row4.setPercentHeight(100/5);
        grid.getRowConstraints().add(row4);

        RowConstraints row5 = new RowConstraints();
        row5.setPercentHeight(100/5);
        grid.getRowConstraints().add(row5);

        /*hbBotones.getChildren().add(grid);
        hbBotones.setAlignment(Pos.CENTER);
        hbBotones.setFillHeight(true);
        hbBotones.setMinHeight(100);
        hbBotones.setHgrow(grid, Priority.ALWAYS);
        contenido.getChildren().add(hbBotones);*/

        TextField resultado = new TextField();
        resultado.setEditable(false);
        resultado.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        grid.add(resultado,0,0,4,1);
        //hbTF.setPadding(new Insets(10));

        Button btn1 = new Button();
        btn1.setText("1");
        btn1.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        grid.add(btn1,0,1);

        Button btn2 = new Button();
        btn2.setText("2");
        btn2.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        grid.add(btn2,1,1);

        Button btn3 = new Button();
        btn3.setText("3");
        btn3.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        grid.add(btn3,2,1);

        Button btnMenos = new Button();
        btnMenos.setText("-");
        btnMenos.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        grid.add(btnMenos,3,1);

        Button btn4 = new Button();
        btn4.setText("4");
        btn4.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        grid.add(btn4,0,2);

        Button btn5 = new Button();
        btn5.setText("5");
        btn5.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        grid.add(btn5, 1,2);

        Button btn6 = new Button();
        btn6.setText("6");
        btn6.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        grid.add(btn6,2,2);

        Button btnMas = new Button();
        btnMas.setText("+");
        btnMas.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        grid.add(btnMas,3,2);

        Button btn7 = new Button();
        btn7.setText("7");
        btn7.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        grid.add(btn7, 0,3);

        Button btn8 = new Button();
        btn8.setText("8");
        btn8.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        grid.add(btn8,1,3);

        Button btn9 = new Button();
        btn9.setText("9");
        btn9.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        grid.add(btn9,2,3);

        Button btnDiv = new Button();
        btnDiv.setText("/");
        btnDiv.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        grid.add(btnDiv,3,3);

        Button btnBorrar = new Button();
        btnBorrar.setText("C");
        btnBorrar.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        grid.add(btnBorrar,0,4);

        Button btn0 = new Button();
        btn0.setText("0");
        btn0.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        grid.add(btn0,1,4);

        Button btnIG = new Button();
        btnIG.setText("=");
        btnIG.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        grid.add(btnIG,2,4);

        Button btnMult = new Button();
        btnMult.setText("*");
        btnMult.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
        grid.add(btnMult,3,4);

        grid.addEventFilter(MouseEvent.MOUSE_CLICKED, evento ->{

            evento.consume();
            if (evento.getTarget() instanceof Button){
                Button btnaux = (Button) evento.getTarget();
                String result = String.join("", num1.get(), btnaux.getText());
                num1.set(result);
                resultado.setText(result);

            }
        });


        Scene scene = new Scene(grid, 200, 150);
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(true);
    }

    public static void main(String[] args) {
        launch();
    }
}