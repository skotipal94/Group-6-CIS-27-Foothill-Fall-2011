/*
 * This program adds new contacts, stores information about the new contact, and then lets the user
 * do a variety of task with this information.
 */
public class Main {
	/*
	 * This class contains the 
	 */
	public static void main(String args[]){
		String firstname="Kelly";
		char middleInitial='M';
		String lastName="Clarkson";
		String phoneNumber="(408)-100-1111";
		String streetAddress="1280 Lynbrook Way"; 
		String city= "San Jose"; 
		String state="CA";
		String zip="95129"; 
		String email="main@directory.com";
		Contact contactname;
		contactname = new Contact();
		contactname.setValue();
		ContactList contact;
		contact = new ContactList();
		contact.addContact(firstname, middleInitial, lastName, phoneNumber, streetAddress, city, state, zip, email);
		contact.sort();
		contact.printList();
		System.out.println(contact.lastNameSearch(lastName));
        System.out.println(contact.emailAddressSearch(email));
        System.out.println(contact.zipSearch(zip));
	}
}
