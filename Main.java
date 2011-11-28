import javax.swing.JOptionPane;
import java.util.*;

/*
 * This program adds new contacts, stores information about the new contact, and then lets the user
 * do a variety of task with this information.
 */
public class Main {
	/*
	 * This class contains the instruction for getting user input to do a
	 * variety of functions with the class ContactList.
	 */

	public static void main(String args[]) {
		boolean current = false;
		Scanner userinput = new Scanner(System.in);
		ContactList contacts;
		contacts = new ContactList();
		while (current == false) {
			System.out
					.print("1:Add Contact\n2:Search By\n3:Print all Contacts\n4:Exit The Program\n");
			int chooseAction = Integer.parseInt(userinput.nextLine());
			switch (chooseAction) {
			case 1: {
				System.out.println("First Name: ");
				String firstname = userinput.nextLine();
				System.out.println("Middle Initial: ");
				String middleInitial = userinput.nextLine();
				System.out.println("Last Name: ");
				String lastName = userinput.nextLine();
				System.out.println("Phone Number: ");
				String phoneNumber = userinput.nextLine();
				System.out.println("Street Address: ");
				String streetAddress = userinput.nextLine();
				System.out.println("City: ");
				String city = userinput.nextLine();
				System.out.println("State: ");
				String state = userinput.nextLine();
				System.out.println("Zip Code: ");
				String zip = userinput.nextLine();
				System.out.println("Email: ");
				String email = userinput.nextLine();
				System.out.println("Notes: ");
				String notes = userinput.nextLine();
				contacts.addContact(firstname, middleInitial, lastName,
						phoneNumber, streetAddress, city, state, zip, email,
						notes);
				break;
			}
			case 2: {
				Contact getContact;
				getContact = new Contact();
				System.out.println("1:Last Name Search\n2:Zip Code Search\n");
				System.out.println("How would you like to search?");
				int searchAction = Integer.parseInt(userinput.nextLine());
				switch (searchAction) {
				case 1: {
					System.out
							.println("Enter the Last Name you would like search with:");
					contacts.lastNameSearch(userinput.nextLine());
				}
				case 2: {
					System.out
							.println("Enter the Zip Code you would like to search with: ");
					contacts.zipSearch(userinput.nextLine());
				}
				}
			}
			case 3: {
				System.out.println(contacts.returnList());
				break;
			}
			case 4: 
				current = true;
			}
		}
		/*
		 * contacts.sort(); contacts.printList();
		 * contacts.lastNameSearch(lastName); contacts.zipSearch(zip); String
		 * someStringToBePrinted = contacts.returnList(); someStringToBePrinted
		 * = contacts.lastNameSearch(lastName); someStringToBePrinted =
		 * contacts.zipSearch(zip);
		 */
	}
}

/*
 * Run: addContact called sort called printList called lastNameSearch called
 * zipSearch called Contact constructor called setValue() called addContact
 * called getValue() called sort called printList called getValue() called
 * lastNameSearch called getValue() called zipSearch called
 */