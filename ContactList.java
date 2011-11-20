import java.util.ArrayList;

public class ContactList {

	/**
	 this class contains functions/methods for interacting with a list of Contact objects.
	 these functions will be called in Main
	 THIS IS CURRENTLY PRELIMINARY CODE. THIS WILL COMPILE BUT THE FUNCTIONS CURRENTLY DO NOTHING.
	 */
	
	private String[] singleEntry; // this string[] is for single contact entry, including name, number, etc
	private ArrayList<String[]> totalList; //this ArrayList<String[]> is a list of several Contact objects, and represents our contact list. 
	private ArrayList<String[]> subList; //this ArrayList<String[]> is list of several entries, often a subset of the contact list, used for searches.
	
	public void addContact(String firstname, String middleInitial, String lastName, String phoneNumber, String streetAddress, String city, String state, String zip, String email){
		/*
		 * This function adds a new contact to the contact list. 
		 * parameters: several strings that contain contact informatino.
		 * returns: nothing
		 */
		//Contact nextContact = new Contact
		//setValue(firstName, middleInitial, lastName, phoneNumber, streetAddress, city, state, zip, email);
		System.out.println("addContact called"); //debug
	}
	
	public void sort(){
		/*
		 * this function sorts the existing contact list by last name
		 * parameters: none
		 * returns: nothing
		 */
		//getValue(lastName);
		System.out.println("sort called"); //debug
	}
	
	public ArrayList<String[]> printList(){
		/*
		 * This function returns the entire list. it DOES NOT print the list. call this function and use its output to print.
		 * parameters: none
		 * returns: entire list in an ArrayList of String[]
		 */
		//getValue();
		System.out.println("printList called"); //debug
		return totalList;
	}
	
	public ArrayList<String[]> lastNameSearch(String email){
		/*
		 * This function searches the list for a specific last name.
		 * parameters: email address as a string
		 * returns: an ArrayList of String[]. This will usually have only one element, a single String[] corresponding to a single entry.
		 * sometimes, though, it'll have more than one element since people will share a last name, which is why it's an ArrayList<String[]>
		 * instead of just a String[]. 
		 */
		//getvalue();
		System.out.println("lastNameSearch called"); //debug
		return subList;
	}
	
	public ArrayList<String[]> zipSearch(String zip){
		/*
		 * This function searches the list for a specific zip code.
		 * parameters: zip code as a STRING. not as an int. as a STRING.
		 * returns: an ArrayList of String[]. This can have one or more elements, with a single String[] corresponding to a single entry.
		 * the reason it is an ArrayList is because people share zip codes.
		 */
		//getValue();
		System.out.println("zipSearch called"); //debug
		return subList;
	}
}
