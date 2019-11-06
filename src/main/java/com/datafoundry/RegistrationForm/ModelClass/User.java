package com.datafoundry.RegistrationForm.ModelClass;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User 
{
	@Id
private String _id;
private String first_name;
private String last_name;
private String gender;
private String email_id;
private String contact_number;
private String address;
private String user_name;
private String password;
public String get_id() {
	return _id;
}
public void set_id(String _id) {
	this._id = _id;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
public String getContact_number() {
	return contact_number;
}
public void setContact_number(String contact_number) {
	this.contact_number = contact_number;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [_id=" + _id + ", first_name=" + first_name + ", last_name=" + last_name + ", gender=" + gender
			+ ", email_id=" + email_id + ", contact_number=" + contact_number + ", address=" + address + ", user_name="
			+ user_name + ", password=" + password + "]";
}



}
