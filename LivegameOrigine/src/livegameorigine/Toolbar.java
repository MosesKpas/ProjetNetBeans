package livegameorigine;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;

/**
 * @author Moses
 */
public class Toolbar extends ToolBar{
    private MainView mainview;
    public Toolbar(MainView mainview){
        this.mainview =mainview;
        Button draw = new Button("Dessiner");
        
        draw.setOnAction(this::handleDraw);
        Button erase = new Button("Effacer");
        erase.setOnAction(this::handleErase);
        Button step = new Button("Etape");
        step.setOnAction(this::handleStep);
        Button reset = new Button("Reset");
        reset.setOnAction(this::handleReset);
        Button Start = new Button("Lancer");
        Start.setOnAction(this::handleStart);
        Button Stop = new Button("Arreter");
        Stop.setOnAction(this::handleStop);        
        this.getItems().addAll(Start,Stop,draw,erase,reset);
    }

    private void handleDraw(ActionEvent event) {
        this.mainview.setDrawMode(Simulation.ALIVE);
    }

    private void handleErase(ActionEvent event) {
        this.mainview.setDrawMode(Simulation.DEAD);
    }

    private void handleStep(ActionEvent event) {
        
        this.mainview.setApplicatoinState(MainView.SIMULATING);
        this.mainview.getSimulation().step();
        this.mainview.draw();
    }
    private void handleReset(ActionEvent actionEvent){
        this.mainview.setApplicatoinState(MainView.EDITING);
        this.mainview.draw();
    }

    private void handleStart(ActionEvent event) {
       this.mainview.setApplicatoinState(MainView.SIMULATING);
       this.mainview.getSimulator().start();
    }

    private void handleStop(ActionEvent event){
      this.mainview.getSimulator().stop();      
      
    }


   
}
