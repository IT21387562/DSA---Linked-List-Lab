package part_b;

import linked_list.Link;

public class LinkList {
	
	//declare variables
	private Link first;
	
	//constructor
	public LinkList() {
		
		first = null;
	}
	
	//isEmpty method
	public boolean isEmpty() {
		
		return(first == null);
	}
	
	//displayList method
	public void displayList() {
		
		Link current = first; // in order to start from the beginning
		
		while(current!=null) {
			current.displayDetails();//display links
			current = current.next;//moving to next link
		}
		System.out.println(" ");
	}
	
	//insertFirst Method
	public void insertFirst(String name, double average) {
		
		Link newLink = new Link(name,average); //create new link
		newLink.next = first; // link new link to existing link
		first = newLink; //assign new link as first value
		
	}
	
	//deleteFirst method
	public Link deleteFirst() {
		
		Link temp = first; // save the reference of first to temp
		first = first.next; //change the first reference to next available reference
		return temp; // returning first reference earlier
	}
	
	//new method
	public Link deleteLink(String name) {
		
		//We have two main parts
		//1. delete the very first link in the list
		//2. delete the other link in the list
		Link current = first;
		Link previous = first;
		
		if(current == null) {
			System.out.println("Link list is empty");
		}
		
		while(!current.name.equals(name)) {
				previous = current;
				current = current.next;
			
			
			if(current == null) {
				return null; // if does not have the elements to br deleted
			}
		}
		
		if(current == first) {
			first = first.next;
		}
		else {
			previous.next = current.next;
		}
		return current;
	}
	
	
}
