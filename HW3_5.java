package chapter_07;

import java.util.Scanner;
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color;
import javafx.scene.shape.Line; 
import javafx.stage.Stage;  

	public class HW3_5 extends Application { 

		public void start(Stage stage) { 
	    	Random rand = new Random();
	    	int end = rand.nextInt(500) + 100;

	        int y = 50;

	        Group root = new Group();

	        for(int i=0; i<20; i++) {

		    	end = rand.nextInt(500) + 100;
	            Line line = new Line();
	            line.setStartX(50); 
	            line.setEndX((end+50)); 
	            line.setStartY(y); 
	            line.setEndY(y);
	            root.getChildren().add(line);
	            y += 25;
	        }
	 
	        Scene scene = new Scene(root, 750, 600); 
	        scene.setFill(Color.ROSYBROWN);
	        stage.setTitle("Parallel Lines HW 5");
	        stage.setScene(scene); 
	        stage.show(); 
	    }      
	    public static void main(String args[]){ 
	        launch(args); 
	    } 
	}       