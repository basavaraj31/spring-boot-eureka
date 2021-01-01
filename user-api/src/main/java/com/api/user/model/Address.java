package com.api.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "postCode")
	private String postCode;

	@Column(name = "houseName")
	private String houseName;

	@Column(name = "address")
	private String address;

	@Column(name = "town")
	private String town;

	@Column(name = "country")
	private String country;

	@OneToOne(mappedBy = "address")
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address(int id, String postCode, String houseName, String address, String town, String country, User user) {
		super();
		this.id = id;
		this.postCode = postCode;
		this.houseName = houseName;
		this.address = address;
		this.town = town;
		this.country = country;
		this.user = user;
	}
	
	public Address() {
	}

}
