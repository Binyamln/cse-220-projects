package chapter_07;

import java.util.Random;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color;
import javafx.scene.shape.Line; 
import javafx.stage.Stage;  
import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

import java.util.Scanner;

public class HW3_2 {

public static void main(String[] args) throws IOException {

int x = 0;


Scanner scan = new Scanner(System.in);

System.out.print("Enter the first file name: ");

String file1 = scan.next();

System.out.print("Enter the second file name: ");

String file2 = scan.next();

BufferedReader bread1 = null;

BufferedReader bread2 = null;


bread1 = new BufferedReader(new FileReader(file1));

bread1 = new BufferedReader(new FileReader(file2));


String line1 = null;
String line2 = null;

while ((line2 = bread1.readLine()) != null && (line2 = bread2.readLine()) != null) {

if (!line1.equals(line2)) {

x = 1;

}

}

if (x == 1) {

System.out.println("They are not equal");

} 

else {

System.out.println("They are equal");

}

}

}
