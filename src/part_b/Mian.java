package part_b;

public class Mian {

	public static void main(String[] args) {
		
		LinkList l = new LinkList();
		
		l.insertFirst("Prashani", 69.5); //last of the link list
		l.insertFirst("Aravinda", 78.0); //2nd of the link list
		l.insertFirst("Nipuna", 53.5); //1st of the link list
		
		//l.displayList();
		
		l.insertFirst("Amandi", 88.9);
		l.insertFirst("Sudhara", 91.7);
		l.insertFirst("Hardik", 75.8);
		
		//l.displayList();
		
		l.deleteLink("Nipuna");
		l.displayList();
		
	}

}
