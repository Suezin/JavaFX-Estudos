package Controller;

import Alerts.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

import java.io.IOException;

public class PagamentosController {

    @FXML
    private Button btnInsertPagamento;

    @FXML
    private Button btnAlterPagamento;

    @FXML
    private Button btnDeletePagamento;

    @FXML
    private TableColumn columnId;

    @FXML
    private TableColumn columnDate;

    @FXML
    private TableColumn columnPrice;

    @FXML
    private TableColumn columnAluno;

    @FXML
    private TableColumn columnPlain;


    public void onBtnInsertPagamentoAction() throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/intefaceacademia/Pagamentos/insertPagamento-view.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Alterar Pagamentos");
            stage.setScene(new Scene(fxmlLoader.load(), 600, 400));
            stage.show();
        } catch (IOException e) {
            Alerts.showAlerts("Pagamentos", "Erro ao iniciar a interface: " + e, null, Alert.AlertType.ERROR);
        }
    }
    public void onBtnAlterPagamentoAction() throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/intefaceacademia/Pagamentos/insertPagamento-view.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Alterar Pagamentos");
            stage.setScene(new Scene(fxmlLoader.load(), 600, 400));
            stage.show();
        } catch (IOException e) {
            Alerts.showAlerts("Pagamentos", "Erro ao iniciar a interface: " + e, null, Alert.AlertType.ERROR);
        }
    }

}
