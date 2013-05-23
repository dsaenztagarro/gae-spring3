package com.davlanca.pets.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable {

	private String address;
	private String city;
	private String email;
	private String enabled;
	private String firstName;
	private String lastName;
	private String login;
	private String password;
	private String phone;	
	private String state;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	private String zipCode;
	
	
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getEmail() {
		return email;
	}
	public String getEnabled() {
		return enabled;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getLogin() {
		return login;
	}
	public String getPassword() {
		return password;
	}
	public String getPhone() {
		return phone;
	}
	public String getState() {
		return state;
	}
	public Long getUserId() {
		return userId;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
}
