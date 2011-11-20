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
		
		//put switch here to determine return value
		System.out.println("getValue() called");
		return "some string";
	}
}
