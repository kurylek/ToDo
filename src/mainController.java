import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

public class mainController {

    @FXML
    private ListView<?> listOngoing;

    @FXML
    private ListView<?> listCanceled;

    @FXML
    private ListView<?> listFinished;

    @FXML
    void addNewTask(ActionEvent event) {
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

}
