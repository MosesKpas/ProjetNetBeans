package livegame;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;

/**
 * @author Moses
 */
public class Toolbar extends ToolBar{
    private MainView mainview;
    public Toolbar(MainView mainview){
        this.mainview =mainview;
        Button play = new Button("Draw");
        play.setOnAction(this::handlePlay);
        
        this.getItems().addAll(play);
    }

    private void handlePlay(ActionEvent event) {
        this.mainview.getSimulator().start();
    }

   
}
