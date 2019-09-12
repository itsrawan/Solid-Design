package solid.design.single.correct;

/**
 * Address Details
 * 	-	Country: current country
 * 	-	City
 * 	-	State
 * 	-	pobox: P.O.Box
 * 	-	Street: Street Name 
 * 	-	AddressType: Home, work
 * 	-	AddressDescription: Description of the address (Near Places and direction guides) 
 * 	-	
 * @author rawan.sweidan
 *
 */
public class Address {
	
	private String country;
	private String city; 
	private String state;
	private String pobox;
	private String street;
	private AddressType addressType;
	private String addressDescipttion;
	private boolean isPrimary;
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPobox() {
		return pobox;
	}
	public void setPobox(String pobox) {
		this.pobox = pobox;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public AddressType getAddressType() {
		return addressType;
	}
	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}
	public String getAddressDescipttion() {
		return addressDescipttion;
	}
	public void setAddressDescipttion(String addressDescipttion) {
		this.addressDescipttion = addressDescipttion;
	}
	public boolean isPrimary() {
		return isPrimary;
	}
	public void setPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

}
