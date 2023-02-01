package chapter_09;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class HW4_4 extends Application{

public void start(Stage primaryStage) throws Exception {
	
	
//car body
Polygon polygon = new Polygon(); 
polygon.getPoints().addAll(new Double[]{50.0, 250.0,50.0, 175.0,150.0, 100.0,450.0, 100.0,500.0, 225.0,500.0, 250.0});
polygon.setFill(Color.ORANGERED); 


// car window
Rectangle rect=new Rectangle(); 
rect.setX(200);
rect.setY(110);
rect.setWidth(200);
rect.setHeight(95);
rect.setFill(Color.ALICEBLUE);

// car window line and front light
Line line = new Line(300,110, 300, 205);
Line line1 = new Line(100,220, 100, 240); 
Line line2 = new Line(100,220,50,220);
Line line3 = new Line(50,240,100,240);


//car wheel
Circle Rear = new Circle(400.0,300.0,60.0); 
Circle Front = new Circle(135.0,300.0,60.0);
Circle RearRim = new Circle(400.0,300.0,30.0); 
Circle FrontRim = new Circle(135.0,300.0,30.0);
RearRim.setFill(Color.DIMGREY);
FrontRim.setFill(Color.DIMGREY);


Group root = new Group(); 
root.getChildren().addAll(polygon, Rear, Front, FrontRim, RearRim , line1, line2, line3 ,rect, line); 

Scene scene = new Scene(root,700,500, Color.LIGHTCYAN);
primaryStage.setScene(scene);
primaryStage.setTitle("HW 4 car");
primaryStage.show();

}
public static void main(String[] args) {
launch(args);
}

}