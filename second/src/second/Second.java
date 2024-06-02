package second;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * @author Moses
 */
public class Second extends Application {
    
    @Override
    public void start(Stage primaryStage)throws Exception{
        Group root = new Group();
        
        
        Scene scene = new Scene(root,Color.BLACK);
        Stage stage = new Stage();
        stage.setTitle("Que dire");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
