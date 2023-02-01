package chapter_07;

import java.text.NumberFormat;
import javafx.scene.shape.*;
import java.util.*;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class HW3_3 extends Application
{
    public void start(Stage primaryStage)
    {
    	Random rand = new Random();
    	int end = 40;
   
     	 int x = rand.nextInt(150) + 50;
        int y = rand.nextInt(150) + 50;
        Rectangle rec1 = new Rectangle(180, 100, 100, 300);
        rec1.setFill(Color.YELLOW);
        Circle cir1 = new Circle(230, 155, end);
        Circle cir2 = new Circle(230, 255, end);
        Circle cir3 = new Circle(230, 355, end);

       

        

        Button push = new Button("Go!");
        push.setOnAction((event) -> {
        	
            cir1.setFill(Color.GREEN);
            cir2.setFill(Color.BLACK);
            cir3.setFill(Color.BLACK);


        });
        Button push2 = new Button("CAUTION");
        push2.setOnAction((event) -> {
        	
            cir1.setFill(Color.BLACK);
            cir2.setFill(Color.ORANGE);
            cir3.setFill(Color.BLACK);

        });
        Button push3 = new Button("STOP");
        push3.setOnAction((event) -> {        	
            cir1.setFill(Color.BLACK);
            cir2.setFill(Color.BLACK);
            cir3.setFill(Color.RED);

        });
       push2.setLayoutY(30.00);
       push3.setLayoutY(60.00);

        
        Group root = new Group(push,push2,push3, rec1, cir2, cir3, cir1);        
        Scene scene = new Scene(root, 500, 500, Color.LIGHTBLUE);
        
        primaryStage.setTitle("Traffic Light");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}