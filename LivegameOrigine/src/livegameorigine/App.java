/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livegameorigine;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Moses
 */
public class App extends Application {
    
    @Override
    public void start(Stage stage) {
         MainView mainView = new MainView();
        Scene scene = new Scene(mainView, 1370, 730);
        stage.setScene(scene);
        stage.show();
        mainView.draw();
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
