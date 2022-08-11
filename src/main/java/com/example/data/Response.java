package com.example.data;

import java.util.ArrayList;

public class Response {
 boolean is_success;
 String user_id;
 String email;
 String roll_number;
 ArrayList<String> numbers;
 ArrayList<String> alphabets;
public Response() {
	super();
	// TODO Auto-generated constructor stub
}
public Response(boolean is_success, String user_id, String email, String roll_number, ArrayList<String> numbers,
		ArrayList<String> alphabets) {
	super();
	this.is_success = is_success;
	this.user_id = user_id;
	this.email = email;
	this.roll_number = roll_number;
	this.numbers = numbers;
	this.alphabets = alphabets;
}
public Response(ArrayList<String> numbers, ArrayList<String> alphabets) {
	super();
	this.numbers = numbers;
	this.alphabets = alphabets;
	this.is_success = true;
	this.user_id = "Kunal_Lokhande_06091997";
	this.email="kunallokhande23@gmail.com";
	this.roll_number="223103";
	
	}
public boolean isIs_success() {
	return is_success;
}
public void setIs_success(boolean is_success) {
	this.is_success = is_success;
}
public String getUser_id() {
	return user_id;
}
public void setUser_id(String user_id) {
	this.user_id = user_id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getRoll_number() {
	return roll_number;
}
public void setRoll_number(String roll_number) {
	this.roll_number = roll_number;
}
public ArrayList<String> getNumbers() {
	return numbers;
}
public void setNumbers(ArrayList<String> numbers) {
	this.numbers = numbers;
}
public ArrayList<String> getAlphabets() {
	return alphabets;
}
public void setAlphabets(ArrayList<String> alphabets) {
	this.alphabets = alphabets;
}
 
}
