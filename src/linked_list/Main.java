package linked_list;

public class Main {

	public static void main(String[] args) {
	
		Link n1 = new Link("Nipuna", 53.5);
		Link n2 = new Link("Aravinda", 78.0);
		Link n3 = new Link("Prashani", 69.5);
		
		//first you have to link
		n1.next = n2;
		n2.next = n3;
		n3.next = null;
		
		//then print
		
		//nipuna's details
		n1.displayDetails();
		
		//aravinda's details after linking
		n1.next.displayDetails();
		//or
		//n2.displayDetails();
		
		//prashani's details after linking 
		n1.next.next.displayDetails();
		//or
		//n3.displayDetails();
		

	}

}
