package com.example.AplicativoDeSoma;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculadoraDeSoma extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculadoraDeSoma.class.getResource("/com/example/AplicativoDeSoma/gui/calculadora-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("CALCULADORA DE SOMA");
        stage.setScene(scene);
        stage.show();
    }
}
