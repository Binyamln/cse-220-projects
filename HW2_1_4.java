package chapter_05;

public class HW2_1_4 {

	public class Flight {
		public String name, origin, dest, number;

	 
		public Flight(String nameR, String numR, String originR, String destR) {
	  this.name=nameR;
	  this.number=numR;
	  this.origin=originR;
	  this.dest=destR;
		}
	 
		public String getName() {return name;}
	 
		public void setName(String nameR) {this.name=nameR;}
	 
		public String getNumber() {return this.number;}
		
		public void setNumber(String numR) {this.number=numR;}
		
		public String getOrigin() {return origin;}
		
		public void setOrigin(String originR) {this.origin=originR;}
	 
		public String getDestination() {return dest;}
		
		public void setDestination(String destR) {this.dest = destR;}
	 

	 

	 	public String toString() {
	  return (getName()+" "+getNumber()+" __ From: "+getOrigin() + " To: " +getDestination());
	  }
		
	}


	
		public void main (String[] args) {}
}
