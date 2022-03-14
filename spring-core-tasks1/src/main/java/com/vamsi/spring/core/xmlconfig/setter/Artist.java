package com.vamsi.spring.core.xmlconfig.setter;

import org.springframework.context.annotation.Bean;

public class Artist {
	private String firstName;
	private String lastname;
	
	
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastname;
	}
	
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
	@Override
	public String toString() {
		return "Artist [firstName=" + firstName + ", lastname=" + lastname + "]";
	}
	
}
