
public class ContactList {

	/**
	 this class contains functions/methods for interacting with a list of Contact objects.
	 these functions will be called in Main
	 THIS IS CURRENTLY PRELIMINARY CODE. THIS WILL COMPILE BUT THE FUNCTIONS CURRENTLY DO NOTHING.
	 */

	private Contact[] contactList; //this is an array to hold all the contact objects
	private String temp;//test variable, remove for final
	private Contact nextContact = new Contact();//test object, dot operator will run from contactList, remove for final
	
	public void addContact(String firstName, String middleInitial, String lastName, String phoneNumber, String streetAddress, String city, String state, String zip, String email, String notes){
		/*
		 * This function adds a new contact to the contact list. 
		 * parameters: several strings that contain contact information.
		 * returns: nothing
		 */
		nextContact.setValue(firstName, middleInitial, lastName, phoneNumber, streetAddress, city, state, zip, email, notes);
		System.out.println("addContact called"); //debug
	}
	
	public void sort(){
		/*
		 * this function sorts the existing contact list by last name
		 * parameters: none
		 * returns: nothing
		 */
		//sort loop here
		temp = nextContact.getValue(2);//2 will be the value for last name in contact class
		System.out.println("sort called"); //debug
	}
	
	public String returnList(){
		/*
		 * This function returns the entire list. it DOES NOT print the list. call this function and use its output to print.
		 * parameters: none
		 * returns: a String built from the contactList
		 */
		//loop the list and load to String here
	//	System.out.println("printList called"); //debug
		String outString=null;
		for (int i=0; i<contactList.length;i++){
		outString = outString+contactList[i].getAllInformation();
		}
		return outString;
		//return "some String";//return loaded String
	}
	
	public String lastNameSearch(String lastName){
		/*
		 * This function searches the list for a specific last name.
		 * parameters: last name as a string
		 * returns: a String built from all found last names
		 * sometimes, though, it'll have more than one element since people will share a last name, which is why it's an ArrayList<String[]>
		 * instead of just a String[]. 
		 */
		//loop through the contactList here, pulling the last name from each contact, build the return String
		temp = nextContact.getValue(2);//2 is the last name code for the Contact switch
		System.out.println("lastNameSearch called"); //debug
		return "some String";
	}
	
	public String zipSearch(String zip){
		/*
		 * This function searches the list for a specific zip code.
		 * parameters: zip code as a STRING. not as an int. as a STRING.
		 * returns: a String, built from all found zipcodes.
		 * the reason it is an ArrayList is because people share zip codes.
		 */
		//loop thourgh the contactList here, pulling zip for each contact build the return String
		temp = nextContact.getValue(8);//8 is the zipcode code for the Contact switch
		System.out.println("zipSearch called"); //debug
		return "some String";
	}
}
