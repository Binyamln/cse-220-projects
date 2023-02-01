package chapter_10;

public class hospital {

		public static void main (String[] args)

		{ doctor doctor = new doctor();
		
		surgeon surgeon = new surgeon();

		nurse nurse = new nurse();
		
		security_guard security_guard = new security_guard();
		
		receptionist receptionist = new receptionist();

		janitor janitor = new janitor();

		doctor.cure();
		
		surgeon.surgery();

		nurse.help();
		
		security_guard.protect();

		receptionist.intake();

		janitor.clean();

		}
		}

