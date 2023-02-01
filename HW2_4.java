package chapter_03;
import java.util.*;
public class HW2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("What is the squares side legnth");
		num = scan.nextInt();
		int perimeter = num * 4;
		num = num * num;
		
		System.out.println("The Perimeter is:" + perimeter +" and the Area is:" + num);
		
		
	}

}
