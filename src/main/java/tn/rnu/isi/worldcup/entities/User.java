package tn.rnu.isi.worldcup.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;


@DynamicUpdate
@Entity
@Table(name = "user")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userid")
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	
	//Default Constructor
	public User() {
		super();
	}
	//Constructor
	public User(Long id, String firstName, String lastName, String email ) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	//Getters & Setters
	public User getFirstName() {
		return this;
	}
	public void setFirstNsame(String firstName) {
		this.firstName = firstName;
	}
	
	public User getLastName() {
		return this;
	}
	public void setLast_name(String lastName) {
		this.lastName = lastName;
	}
	
	public User getEmail() {
		return this;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//toString
	@Override
	public String toString() {
		return "User [id=" + id + ", first_name=" + firstName + ", last_name=" + lastName + ", email=" + email + "]";
	}
	

	
	
}
