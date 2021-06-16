import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("fxml/mainScene.fxml"));

        stage.setScene(new Scene(fxmlLoader.load()));
        stage.setTitle("ToDo");
        stage.show();
    }
}
