package com.example.intefaceacademia;

import Alerts.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        Alerts.showAlerts("Meu título", "Meu cabeçalho", "Você foi avisado", Alert.AlertType.WARNING);
    }
}

