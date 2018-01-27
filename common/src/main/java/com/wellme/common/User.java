package com.wellme.common;

public class User {
	private Integer userId;
	private String firstName;
	private String lastName;
	private String middleName;
	private String profilePicUrl;
	private String[] pictureUrls;
	private Address[] address;
	private Phone[] phone;
	private SocialProfile[] socialProfiles;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public Address[] getAddress() {
		return address;
	}
	public void setAddress(Address[] address) {
		this.address = address;
	}
	public Phone[] getPhone() {
		return phone;
	}
	public void setPhone(Phone[] phone) {
		this.phone = phone;
	}
	public String getProfilePicUrl() {
		return profilePicUrl;
	}
	public void setProfilePicUrl(String profilePicUrl) {
		this.profilePicUrl = profilePicUrl;
	}
	public String[] getPictureUrls() {
		return pictureUrls;
	}
	public void setPictureUrls(String[] pictureUrls) {
		this.pictureUrls = pictureUrls;
	}
	public SocialProfile[] getSocialProfiles() {
		return socialProfiles;
	}
	public void setSocialProfiles(SocialProfile[] socialProfiles) {
		this.socialProfiles = socialProfiles;
	}
}
