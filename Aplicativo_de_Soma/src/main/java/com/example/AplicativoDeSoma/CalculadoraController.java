package com.example.AplicativoDeSoma;

import Alerts.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;




public class CalculadoraController {
    @FXML
    private javafx.scene.control.Button btnSomar;

    @FXML
    private javafx.scene.control.Label lblResultado;

    @FXML
    private javafx.scene.control.TextField txtNumero1;

    @FXML
    private TextField txtNumero2;

    @FXML
    public void calcularSoma() throws NumberFormatException{
        try {
            double num1 = Double.parseDouble(txtNumero1.getText());
            double num2 = Double.parseDouble(txtNumero2.getText());

            lblResultado.setText(String.valueOf(num1 + num2));
        }catch (NumberFormatException e ){
            Alerts.showAlerts("CALCULADORA DE SOMA", "ERROS DE FORMATAÇÃO DOS NÚMEROS INSERIDOS!", "REVISE OS NÚMEROS INSERIDOS", Alert.AlertType.ERROR);
        }
    }
}
