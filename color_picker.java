package chapter_10;

import javafx.application.Application;
import javafx.event.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import java.text.NumberFormat;
import javafx.scene.shape.*;
import java.util.*;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class color_picker {


	public static class Color_picker extends Application {
		public void start(Stage stage) {
			TextField textfield = new TextField("insert text here");
			Button button = new Button("change color");
			ColorPicker colorpicker = new ColorPicker();
			button.setTranslateX(0);
			button.setTranslateY(30);
			colorpicker.setValue(Color.BLACK);
			colorpicker.setTranslateX(0);
			colorpicker.setTranslateY(60);
			Text text = new Text(" ");
			text.setTranslateX(20);
			text.setTranslateY(135);
			text.setFill(colorpicker.getValue());
			text.setWrappingWidth(580);
			


			EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
				public void handle(ActionEvent Event) {
					text.setFill(colorpicker.getValue());
				}
			};

			colorpicker.setOnAction(event);
			button.setOnAction((Event) -> {
			String name = textfield.getText();
			text.setText(name);
				
				
			});
			Group root = new Group(textfield, button, colorpicker, text);
			Scene scene = new Scene(root, 300, 150);
	        scene.setFill(Color.ROSYBROWN);
			stage.setTitle("text color picker");
			stage.setScene(scene);
			stage.show();
		}

	    public static void main(String[] args)
	    {
	        launch(args);
	    }
	}}