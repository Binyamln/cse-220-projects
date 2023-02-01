package chapter_05;
import java.util.*;

public class HW2_1_1 {

	public static void main(String[] args) {

	
	String first;
	String last;
	String total;
	Random rand = new Random();
	int end = rand.nextInt(99) + 1;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("What is your first name");
	first = scan.nextLine();
	
	System.out.println("Hello!" + first);
	
	System.out.println("What is your last name");
	last = scan.nextLine();
	
	total = first.substring(0,1) + last.substring(0,4) + end;
	System.out.println(total);
	
}
}