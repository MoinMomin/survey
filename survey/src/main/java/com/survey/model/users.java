package com.survey.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Data
@Document(collection="users")
public class users {
	private int id;
	private String name;
	private String email;
	private String password;
	private int age;
	private String gender;
	private String usertype;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public users(int id, String name, String email, String password, int age, String gender, String usertype) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.usertype = usertype;
	}
	@Override
	public String toString() {
		return "users [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", age=" + age
				+ ", gender=" + gender + ", usertype=" + usertype + "]";
	}
	
	
}
