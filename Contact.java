//stores all information for 1 contact RE
public class Contact {
	private String fName, lName, mInitial, phoneNum, streetAdd, city, state, zipCode, emailAdd, notes; 
	
	//builds and initializes local variables RE
	public Contact(){
		
		System.out.println("Contact constructor called");
	}
	
	//set local variables from outside source RE
	public void setValue(String fn, String ln, String mi, String ph, String sa, String ci, 
			String st, String zc, String ea, String n){
		
		System.out.println("setValue() called");
	}
	
	//returns Contacts last name RE
	public String getLastName(){
		return lName;
	}
	
	//returns Contacts first name RE
	public String getFirstName(){
		return fName;
	}
	
	//returns Contacts middle initial RE
	public String getMiddleInitial(){
		return mInitial;
	}
	
	//returns Contacts phone number RE
	public String getPhoneNumber(){
		return phoneNum;
	}
	
	//returns Contacts street address RE
	public String getStreetAddress(){
		return streetAdd;
	}
	
	//returns Contacts city RE
	public String getCity(){
		return city;
	}
	
	//returns Contacts state RE
	public String getState(){
		return state;
	}
	
	//returns Contacts zipcode RE
	public String getZipCode(){
		return zipCode;
	}
	
	//returns Contacts email address RE
	public String getEmailAddress(){
		return emailAdd;
	}
	
	//returns Contacts notes RE
	public String getNotes(){
		return notes;
	}
	
	//returns all Contact information in a string seperated by newlines RE
	public String getAllInformation(){
		String contactInfo = fName + "\n" + lName + "\n" + mInitial + "\n" + phoneNum + "\n" + streetAdd + "\n" + city +
		 "\n" + state + "\n" + zipCode + "\n" + emailAdd + "\n" + notes;
		
		return contactInfo;
	}
}
