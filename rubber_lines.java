package chapter_10;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;



public class rubber_lines extends Application {
//    colorpicker = new ColorPicker();

    private Line currentLine;
    private Group root;    
    private ColorPicker colorpicker;


    	//--------------------------------------------------------------------
    	// Displays an initially empty scene, waiting for the user to
    	// draw lines with the mouse.
    	//--------------------------------------------------------------------
    public void start(Stage primaryStage) {
        root = new Group();
        colorpicker = new ColorPicker();
		colorpicker.setValue(Color.WHITE);
		colorpicker.setTranslateX(0);
		colorpicker.setTranslateY(0);
        root.getChildren().add(colorpicker);

        Scene scene = new Scene(root, 500, 300, Color.BLACK);

        scene.setOnMousePressed(this::processMousePress);
        scene.setOnMouseDragged(this::processMouseDrag);
        primaryStage.setTitle("Rubber Lines");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    	//--------------------------------------------------------------------
    	// Adds a new line to the scene when the mouse button is pressed.
    	//--------------------------------------------------------------------

    public void processMousePress(MouseEvent event) {
        currentLine = new Line(event.getX(), event.getY(), event.getX(),
                event.getY());
        //using currently selected color as the color for currentLine
        currentLine.setStroke(colorpicker.getValue());
        currentLine.setStrokeWidth(3);
        root.getChildren().add(currentLine);
    }
    	//--------------------------------------------------------------------
    	// Updates the end point of the current line as the mouse
    	// dragged, creating the rubber band effect.
    	//--------------------------------------------------------- -----------

    public void processMouseDrag(MouseEvent event) {
        currentLine.setEndX(event.getX());
        currentLine.setEndY(event.getY());
    }

    public static void main(String[] args) {
        launch(args);
    }
}