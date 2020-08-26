package singletonLiveExample;

public class ContactInfo {

	private static ContactInfo contactInfo = null;

	 String emailId="sahat";
	 String mobileNo="sa";
	
	
	

	private ContactInfo() {

	}

	public static ContactInfo getInstance() {

		if (contactInfo == null) {
			contactInfo = new ContactInfo();
			
		}
		return contactInfo;

	}

}
