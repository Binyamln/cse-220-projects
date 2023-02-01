package chapter_09;

public class Driver extends Course {

	    
	    public Driver(String course) {
		super(course);
		// TODO Auto-generated constructor stub
	}

		public static void main(String[] args) {
			
	        Address school = new Address("Bardstown Road", "Louisville", "KY", 40221);
	        Address addy1 = new Address("Outer Loop", "Middletown", "KY", 32313);
	        Address addy2 = new Address("123 Street", "Louisville", "KY", 12432);
	        Address addy3 = new Address("Moon Road", "Beuchal", "KY", 12432);


	        Course course = new Course("Java");
	        Student2 student1 = new Student2("Barack", "Obama", addy1, school);
	        student1.setTestScore(1,70);
	        student1.setTestScore(2,84); //my midterm grades lol
	        student1.setTestScore(3,70);

	        Student2 student2 = new Student2("Genghis","Khan",addy2, school);
	        student2.setTestScore(1,99);
	        student2.setTestScore(2,100);
	        student2.setTestScore(3,98);
	        
	        Student2 student3 = new Student2("Winston","Paceape",addy3, school);
	        student2.setTestScore(1,60);
	        student2.setTestScore(2,100);
	        student2.setTestScore(3,100);

	        course.addStudent(student1);
	        course.addStudent(student2);

	        System.out.println("Course: \t JAVA");
	        course.roll();

	        int average;
	        average = (int) ((student1.average() + student2.average())/2);
	        System.out.println("The Average of the grades are: "+ average);
	    

	};
}
