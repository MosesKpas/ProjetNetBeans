package livegameorigine;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.transform.Affine;
import javafx.scene.transform.NonInvertibleTransformException;

/**
 *
 * @author Moses
 */
public class MainView extends VBox{
    public static final int EDITING =0;
    public static final int SIMULATING =1;
    
    private final Button stepButton;
    private final Canvas canvas;
    private final Affine affine;
    private Simulation simulation;
    private Simulation initialSimulation;
    private Simulator simulator;
    
    private int drawMode = Simulation.ALIVE;
    
    private int applicatoinState= EDITING;

    public MainView() {
        this.stepButton = new Button("step");
        this.stepButton.setOnAction((event) -> {
            simulation.step();
            draw();
        });
        //la taille du fond
        this.canvas = new Canvas(1365, 730);
        this.canvas.setOnMousePressed(this::handleDraw);
        this.canvas.setOnMouseDragged(this::handleDraw);
        
        Toolbar toolbar = new Toolbar(this);
        this.setOnKeyPressed(this::onKeyPressed);
        this.getChildren().addAll(toolbar, this.canvas);
        
        this.affine = new Affine();
        this.affine.appendScale(400 / 35f, 400 / 35f);
        //nombre des ligmes de la simulation
        this.initialSimulation = new Simulation(119, 60);
        this.simulation = Simulation.copy(this.initialSimulation);
    }

    private void onKeyPressed(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.D) {
            this.drawMode = Simulation.ALIVE;//permet de dessiner
        } else if (keyEvent.getCode() == KeyCode.E) {
            this.drawMode = Simulation.DEAD;//permet d'effacer
        }
    }

    //methode pour commencer a dessiner sur le canvas
    private void handleDraw(MouseEvent event) {
        double mousex = event.getX();
        double mousey = event.getY();

        System.out.println(mousex + " " + mousey);
        try {
            
            if(this.applicatoinState == SIMULATING){
               return; 
            }
            javafx.geometry.Point2D simCoord = this.affine.inverseTransform(mousex, mousey);
            int simX = (int) simCoord.getX();
            int simY = (int) simCoord.getY();
            
            System.out.println(simX + " " + simY);

            this.initialSimulation.setState(simX, simY, drawMode);
            draw();
        } catch (NonInvertibleTransformException e) {
            System.out.println("pas de transformation");
        }
    }

    public void draw() {
        GraphicsContext g = this.canvas.getGraphicsContext2D();
        g.setTransform(this.affine);
//la taille de la tuile  
        g.setFill(Color.LIGHTGRAY);
        g.fillRect(0, 0, 450, 450);
        if(this.applicatoinState == EDITING){
            drawSimulation(this.initialSimulation );
        }else{
            drawSimulation(this.simulation);
        }
        
        //pour les lignes
        g.setStroke(Color.GHOSTWHITE);
        g.setLineWidth(0.05);
        for (int x = 0; x <= this.simulation.width; x++) {
            g.strokeLine(x, 0, x, 60);
        }
        for (int y = 0; y <= this.simulation.height; y++) {
            g.strokeLine(0, y, 119, y);
        }
    }
    public void drawSimulation(Simulation simulationToDraw){
         GraphicsContext g = this.canvas.getGraphicsContext2D();
         g.setFill(Color.BLACK);
         
        for (int x = 0; x < simulationToDraw.width; x++) {
            for (int y = 0; y < simulationToDraw.height; y++) {
                if (simulationToDraw.getState(x, y) == Simulation.ALIVE) {
                    g.fillRect(x, y, 1, 1);
                }
            }
        }
    }

    public Simulation getSimulation() {
        return this.simulation;
    }

    public void setDrawMode(int newDrawMode) {
        this.drawMode =newDrawMode;
    }

    public void setApplicatoinState(int applicatoinState) {
        if(applicatoinState == this.applicatoinState){
            return;
        }
        if(applicatoinState == SIMULATING){
            this.simulation = Simulation.copy(this.initialSimulation);
            this.simulator = new Simulator(this, this.simulation);
        }
        
        this.applicatoinState = applicatoinState;
        System.out.println("App"+this.applicatoinState);
    }

    public Simulator getSimulator() {
        return simulator;
    }
    
    
}
