//stores all information for 1 contact
public class Contact {
	private String fName, lName, mInitial, phoneNum, streetAdd, city, state, zipCode, emailAdd, notes; 
	
	//builds and initializes local variables
	public Contact(){
		
		System.out.println("Contact constructor called");
	}
	
	//set local variables from outside source
	public void setValue(String fn, String ln, String mi, String ph, String sa, String ci, 
			String st, String zc, String ea, String n){
		
		System.out.println("setValue() called");
	}
	
	//return a chosen variable based on integer passed in
	public String getValue(int choice){
		/*
		 *list of choice correspondence:
		 *1-first name
		 *2-last name
		 *3-middle initial
		 *4-phone number
		 *5-street address
		 *6-city
		 *7-state
		 *8-zipcode
		 *9-email address
		 *10-notes
		*/
		//put switch here to determine return value
		System.out.println("getValue() called");
		return "some string";
	}
}
