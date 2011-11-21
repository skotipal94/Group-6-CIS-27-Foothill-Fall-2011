/*
 * This program adds new contacts, stores information about the new contact, and then lets the user
 * do a variety of task with this information.
 */
public class Main {
	/*
	 * This class contains the instruction for 
	 */
	public static void main(String args[]){
		String firstname="Kelly";
		String middleInitial="M";
		String lastName="Clarkson";
		String phoneNumber="(408)-100-1111";
		String streetAddress="1280 Lynbrook Way"; 
		String city= "San Jose"; 
		String state="CA";
		String zip="95129"; 
		String email="main@directory.com";
		String notes = "notes: ";
		ContactList contact;
		contact = new ContactList();
		contact.addContact(firstname, middleInitial, lastName, phoneNumber, streetAddress, city, state, zip, email, notes);
		contact.sort();
		String someStringToBePrinted = contact.returnList();
		someStringToBePrinted = contact.lastNameSearch(lastName);
        someStringToBePrinted = contact.zipSearch(zip);
	}
}

/*Run:
Contact constructor called
setValue() called
addContact called
getValue() called
sort called
printList called
getValue() called
lastNameSearch called
getValue() called
zipSearch called

*/