package solid.design.single.correct;

/**
 * Contact Class responsible of the Contact Details Like
 * 	-	Contact Type: Mobile Number, Land Line, Email, Family relative number
 * 	-	Contact Value: the mobile number or the email 
 * 	-	isPrimary: determine if the contact is the main contact information
 * @author rawan.sweidan
 *
 */
public class Contact {
	
	private String contactValue;
	private ContactType contactType;
	private boolean isPrimary;
	
	
	public String getContactValue() {
		return contactValue;
	}
	public void setContactValue(String contactValue) {
		this.contactValue = contactValue;
	}
	public ContactType getContactType() {
		return contactType;
	}
	public void setContactType(ContactType contactType) {
		this.contactType = contactType;
	}
	public boolean isPrimary() {
		return isPrimary;
	}
	public void setPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

}
