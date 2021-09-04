import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Andrew Walsh
 */
public class Main extends Application {

    /**
     * @param primaryStage the primary JavaFX stage for the application
     * @throws Exception
     * function to start the JavaFX application
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent parent = FXMLLoader.load(getClass().getResource("FXML/login.fxml"));
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Scheduling System");
        primaryStage.show();
    }


    /**
     * @param args arguments passed to the main method
     * function to launch the program
     */
    public static void main(String[] args) {
        launch(args);
    }
}
