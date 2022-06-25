package Entities;
import java.util.Date;

import Abstract.IEntity;

public class Customer implements IEntity{
	public String firstName;
	public String lastName;
	public int dateOfBirth;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
	}
	public long nationalityId;
	
	public Customer() {
		
	}
	public Customer(int dateOfBirth,String firstName, String lastName, Long nationalityId) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public long getNationalityId() {
		return nationalityId;
	}
	
	
}
