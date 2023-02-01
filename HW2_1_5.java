package chapter_05;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class HW2_1_5 extends Application
{
    public void start(Stage primaryStage)
    {
    	Random rand = new Random();
    	int end = rand.nextInt(100) + 50;
   
     	 int x = rand.nextInt(150) + 50;
        int y = rand.nextInt(150) + 50;
        
        Circle cir1 = new Circle(x, y, end);
        cir1.setStroke(Color.RED);
        cir1.setFill(Color.RED);
        

        Button push = new Button("Push Me!");
        push.setOnAction((event) -> {
        	
        cir1.setCenterX(rand.nextInt(150)+ 50);
        cir1.setCenterY(rand.nextInt(150)+ 50);

        });
       
        
        Group root = new Group(cir1, push);        
        Scene scene = new Scene(root, 500, 300, Color.LIGHTYELLOW);
        
        primaryStage.setTitle("Arc Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}