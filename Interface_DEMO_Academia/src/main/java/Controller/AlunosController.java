package Controller;

import Alerts.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;


public class AlunosController {

    @FXML
    private Button insertAlunoBtn;

    @FXML
    private Button alterAlunoBtn;

    @FXML
    private Button deleteAlunoBtn;

    @FXML
    private TableColumn columnIdAluno;

    @FXML
    private TableColumn columnNameAluno;

    @FXML
    private TableColumn columnCpfAluno;

    @FXML
    private TableColumn columnDateBirthAluno;

    @FXML
    private TableColumn columnPlainAluno;

    @FXML
    private TableView tableAlunos;


    public void onInsertAlunoBtnAction() throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/intefaceacademia/Alunos/insertAluno-view.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Inserir Alunos");
            stage.setScene(new Scene(fxmlLoader.load(), 600, 400));
            stage.show();

        } catch (IOException e) {
            Alerts.showAlerts("Alunos", "Erro ao entrar na interface de inserção de Aluno", "Erro " + e, Alert.AlertType.ERROR);
        }
    }

    public void onAlterAlunoBtnAction() throws IOException{
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/intefaceacademia/Alunos/alterAluno-view.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Alterar Alunos");
            stage.setScene(new Scene(fxmlLoader.load(), 600, 400));
            stage.show();
        }catch(IOException e ){
            Alerts.showAlerts("Alterar Aluno", "Erro ao Entrar na Interface de Alteração", null, Alert.AlertType.ERROR);
        }
    }
}
