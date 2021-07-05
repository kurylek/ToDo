import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import java.io.IOException;

public class mainController {

    @FXML
    private ListView<MyTask> listOngoing = new ListView<>();

    @FXML
    private ListView<MyTask> listCanceled;

    @FXML
    private ListView<MyTask> listFinished;

    @FXML
    private Button addNewTaskButton;

    @FXML
    private Button exitButton;



    @FXML
    void addNewTaskStage(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("fxml/addNewTaskScene.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(fxmlLoader.load()));
            stage.setTitle("Add new task");
            stage.show();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void editTaskStage(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("fxml/editTaskScene.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(fxmlLoader.load()));
            stage.setTitle("Edit task");
            stage.show();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void addNewTaskAction(ActionEvent event) {
        listOngoing.getItems().add(new MyTask("name", "desc"));
        System.out.println("New task added- ");
        System.out.println(listOngoing.getItems().toString());
    }

    @FXML
    void exitButtonAction(ActionEvent event) {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
}
