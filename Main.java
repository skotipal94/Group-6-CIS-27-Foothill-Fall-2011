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
		ContactList contact;
		contact = new ContactList();
		contact.addContact(firstname, middleInitial, lastName, phoneNumber, streetAddress, city, state, zip, email);
		contact.sort();
		contact.printList();
		contact.lastNameSearch(lastName);
        contact.zipSearch(zip);
	}
}

/*Run:
addContact called
sort called
printList called
lastNameSearch called
zipSearch called
*/