package chapter_03;
import java.util.*;
public class HW2_5 {
	public static void main(String[] args) {
		float total;
		float numerator;
		Scanner scan1 = new Scanner(System.in);
		float demoninator;		
		System.out.println("What is the numerator");
		numerator = scan1.nextFloat();
		
		System.out.println("What is the demoninator");
		demoninator = scan1.nextFloat();
		
		total = numerator/demoninator;
		
		System.out.println("This is the fraction in decimal format " + total);
	}
}