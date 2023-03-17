package part_b;

public class Link {
	
	//declare variable
	public String name;
	public double average;
	public Link next;
	
	//constructor
	public Link(String name, double average) {
		
		this.name = name;
		this.average = average;
		this.next = null;	
		
	}
	
	//method
	public void displayDetails() {
		
		System.out.println("Name : "+name);
		System.out.println("Average : "+average);
		System.out.println(" ");
	}

}
