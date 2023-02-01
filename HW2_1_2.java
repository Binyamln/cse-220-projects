package chapter_05;
import java.util.*;
import java.lang.Math;


public class HW2_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double pi = Math.PI;
	float radius = 6 ;
	float volume = (float) (0.75*(pi)*(radius*radius*radius));
	float sarea = (float) (4*(pi)*(radius*radius));
	
	
	System.out.printf("The volume is "+"%.4f", volume);
	System.out.printf("\nThe surface area is " + "%.4f", sarea);
	}

}
