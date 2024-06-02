package livegameorigine;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.util.Duration;

/**
 * @author Moses
 */
public class Simulator {
    private Timeline timeline;
    private MainView mainview;
    private Simulation simulation;
    
    
    public Simulator(MainView mainView, Simulation simulation){
        this.mainview = mainView;
        this.simulation = simulation;
        
    this.timeline = new Timeline(new KeyFrame(Duration.millis(200), this::doStop));
    this.timeline.setCycleCount(Timeline.INDEFINITE);
}
    private void doStop(ActionEvent actionEvent){
        this.simulation.step();
        this.mainview.draw();
    }
    public void start(){
        this.timeline.play();
    }
    public void stop(){
        this.timeline.stop();
    }
}
