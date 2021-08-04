package com.crud.pagination.model;





import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "bookCollection")
public class Books {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	@Column(name="bookName")
	private String bname;
	@Column(name="BookDescription")
	private String description;
	private String categories;
	@Column(name="bookprice")
	private int price;
	private String username;
	private String gender;
//   @Temporal(value = TemporalType.DATE)
	//@Column(name="bookingdate")
	//private Date date;
    private String address;
    @Column(name = "phonenumber")
    private int number;
    private String email;
    private int bookquantity;
    
	
    
    
    
    
    public int getBookquantity() {
		return bookquantity;
	}
	public void setBookquantity(int bookquantity) {
		this.bookquantity = bookquantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
//	public Date getDate() {
//		return date;
//	}
//	public void setDate(Date date) {
//		this.date = date;
//	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", bname=" + bname + ", description=" + description + ", categories=" + categories
				+ ", price=" + price + ", username=" + username + ", gender=" + gender + ", date=" + ", address="
				+ address + ", number=" + number + ", email=" + email + ", bookquantity=" + bookquantity + "]";
	}
	

    
    
    
    
	

}
