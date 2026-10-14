package com.example.AplicativoDeSoma;

import Alerts.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Locale;

public class HelloController {
    @FXML
    private Button btSomar;

    @FXML
    private TextField txtNumeroUm;

    @FXML
    private TextField txtNumeroDois;

    @FXML
    private Label lblResultado;


    @FXML
    public void onBtSomarAction() {
     try {
         Locale.setDefault(Locale.US);
         double n1 = Double.parseDouble(txtNumeroUm.getText());
         double n2 = Double.parseDouble(txtNumeroDois.getText());
         double soma = n1 + n2;
         lblResultado.setText(String.format("%.2f", soma));
     } catch (NumberFormatException e ) {
         Alerts.showAlerts("Calculadora de Soma" ,"Erro de formatação", "Verifique os números que você informou nos campos", Alert.AlertType.INFORMATION);
     }

    }
}

