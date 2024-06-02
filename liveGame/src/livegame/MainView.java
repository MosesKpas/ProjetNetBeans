package livegame;

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
 * @author Moses
 */
public class MainView extends VBox {

    private final Button stepButton;
    private final Canvas canvas;
    private final Affine affine;
    private Simulation simulation;
    private Simulator simulator;

    public Simulator getSimulator() {
        return simulator;
    }
    private int drawMode = 1;

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
        this.affine.appendScale(400 / 25f, 400 / 25f);
        //nombre des ligmes de la simulation
        this.simulation = new Simulation(85, 45);

    }

    private void onKeyPressed(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.D) {
            this.drawMode = 1;//permet de dessiner
        } else if (keyEvent.getCode() == KeyCode.E) {
            this.drawMode = 0;//permet d'effacer
        }
    }

    //methode pour commencer a dessiner sur le canvas
    private void handleDraw(MouseEvent event) {
        double mousex = event.getX();
        double mousey = event.getY();

        System.out.println(mousex + " " + mousey);
        try {
            javafx.geometry.Point2D simCoord = this.affine.inverseTransform(mousex, mousey);
            int simX = (int) simCoord.getX();
            int simY = (int) simCoord.getY();
            System.out.println(simX + " " + simY);

            this.simulation.board[simX][simY] = drawMode;
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
        g.setFill(Color.BLACK);
        for (int x = 0; x < this.simulation.width; x++) {
            for (int y = 0; y < this.simulation.height; y++) {
                if (this.simulation.getState(x, y) == 1) {
                    g.fillRect(x, y, 1, 1);
                }
            }
        }
        //pour les lignes
        g.setStroke(Color.GRAY);
        g.setLineWidth(0.05);
        for (int x = 0; x <= this.simulation.width; x++) {
            g.strokeLine(x, 0, x, 45);
        }
        for (int y = 0; y <= this.simulation.height; y++) {
            g.strokeLine(0, y, 85, y);
        }
    }

}
