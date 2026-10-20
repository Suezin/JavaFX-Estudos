package Controller;

import Alerts.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class PrincipalController {
    @FXML
    private Button btnAlunos;
    @FXML
    private Button planos;
    @FXML
    private Button pagamentos;

    @FXML
    public void onBtnAlunosClick() throws IOException {
        try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/intefaceacademia/Alunos/alunos-view.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Funções de Alunos");
        stage.setScene(new Scene(fxmlLoader.load(), 1024,768));
        stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            Alerts.showAlerts("Gerenciador de Academia Qualquer", "Erro ao entrar na tela", null, Alert.AlertType.ERROR);
        }
    }
    @FXML
    public void onBtnPagamentosClick() throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("pagamentos-view.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Funções de Pagamentos");
            stage.setScene(new Scene(fxmlLoader.load(), 1024,768));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            Alerts.showAlerts("Gerenciador de Academia Qualquer", "Erro ao entrar na tela", null, Alert.AlertType.ERROR);
        }
    }
    @FXML
    public void onBtnPlanosClick() throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("planos-view.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Funções de Planos");
            stage.setScene(new Scene(fxmlLoader.load(), 1024,768));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            Alerts.showAlerts("Gerenciador de Academia Qualquer", "Erro ao entrar na tela", null, Alert.AlertType.ERROR);
        }
    }
}
