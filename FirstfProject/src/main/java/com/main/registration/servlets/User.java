package com.main.registration.servlets;

public class User {
	public String email;
	String username;
	String password;
	String mobileNo;
	String totalQual;
	String gender;
	String totalTech;
	String country;
	String totalAddrs;
	public String review;
	public User(String email, String username, String password, String mobileNo, String totalQual, String gender,
			String totalTech, String country, String totalAddrs, String review) {
		this.email = email;
		this.username = username;
		this.password = password;
		this.mobileNo = mobileNo;
		this.totalQual = totalQual;
		this.gender = gender;
		this.totalTech = totalTech;
		this.country = country;
		this.totalAddrs = totalAddrs;
		this.review = review;
	}
	public String getEmail() {
		return email;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public String getTotalQual() {
		return totalQual;
	}
	public String getGender() {
		return gender;
	}
	public String getTotalTech() {
		return totalTech;
	}
	public String getCountry() {
		return country;
	}
	public String getTotalAddrs() {
		return totalAddrs;
	}
	public String getReview() {
		return review;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", username=" + username + ", password=" + password + ", mobileNo=" + mobileNo
				+ ", totalQual=" + totalQual + ", gender=" + gender + ", totalTech=" + totalTech + ", country="
				+ country + ", totalAddrs=" + totalAddrs + ", review=" + review + "]";
	} 
	
}
