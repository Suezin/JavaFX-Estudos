package com.example.intefaceacademia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PrincipalApplication extends Application {
    @Override
    public void start(Stage stage) throws  IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("principal-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1024,768);
        stage.setTitle("Tela Principal");
        stage.setScene(scene);
        stage.show();
    }
}
