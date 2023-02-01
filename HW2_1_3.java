package chapter_05;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class HW2_1_3 extends Application
{
    public void start(Stage primaryStage)
    {
    	Random rand = new Random();
    	int end = rand.nextInt(100) + 50;

                
        Circle cir1 = new Circle(200,200,end);
        cir1.setStroke(Color.OLIVE);
        cir1.setFill(Color.OLIVE);
        
        Group root = new Group( cir1);        
        Scene scene = new Scene(root, 500, 300, Color.LINEN);
        
        primaryStage.setTitle("Arc Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}