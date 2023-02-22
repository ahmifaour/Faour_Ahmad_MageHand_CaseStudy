package com.ahmi.magehand.models;

import java.util.Collection;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * 
 * The User class represents a user of the application. It contains the user's
 * identification, first name, last name, email, password, and a collection of
 * their character sheets.
 * 
 */

@Entity
@Table
public class User {

	/**
	 * The unique identifier of the user.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * The first name of the user.
	 */
	@Column(name = "First Name", length = 50, nullable = false)
	private String fName;

	/**
	 * The last name of the user.
	 */
	@Column(name = "Last Name", length = 50, nullable = false)
	private String lName;

	/**
	 * The email address of the user.
	 */
	@Column(name = "Email", length = 50, nullable = false)
	private String email;

	/**
	 * The password of the user.
	 */
	@Column(name = "Password", length = 50, nullable = false)
	private String password;

	/**
	 * The collection of character sheets owned by the user.
	 */
	@OneToMany(targetEntity = CharacterSheets.class, cascade = { CascadeType.ALL })
	private Collection<CharacterSheets> uCharacterSheets;

	/**
	 * Creates a new instance of the User class with default values for all fields.
	 */
	public User() {

	}

	/**
	 * Creates a new instance of the User class with the specified values for each
	 * field.
	 *
	 * @param id               the unique identifier of the user.
	 * @param fName            the first name of the user.
	 * @param lName            the last name of the user.
	 * @param email            the email address of the user.
	 * @param password         the password of the user.
	 * @param uCharacterSheets the collection of character sheets owned by the user.
	 */

	public User(Long id, String fName, String lName, String email, String password,
			Collection<CharacterSheets> uCharacterSheets) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.uCharacterSheets = uCharacterSheets;
	}

	/**
	 * Gets the unique identifier of the user.
	 *
	 * @return the unique identifier of the user.
	 */

	public Long getId() {
		return id;
	}

	/**
	 * Sets the unique identifier of the user.
	 *
	 * @param id the unique identifier of the user.
	 */

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the first name of the user.
	 *
	 * @return the first name of the user.
	 */

	public String getfName() {
		return fName;
	}

	/**
	 * Sets the first name of the user.
	 *
	 * @param fName the first name of the user.
	 */

	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * Gets the last name of the user.
	 *
	 * @return the last name of the user.
	 */

	public String getlName() {
		return lName;
	}

	/**
	 * Sets the user's last name.
	 * 
	 * @param lName the user's last name
	 */

	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * Gets the user's email address.
	 * 
	 * @return the user's email address
	 */

	public String getEmail() {
		return email;
	}

	/**
	 * Sets the user's email address.
	 * 
	 * @param email the user's email address
	 */

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the user's password.
	 */

	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password of the User.
	 * 
	 * @param password a String representing the password of the User.
	 */

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Returns a collection of CharacterSheets belonging to the User.
	 * 
	 * @return a Collection of CharacterSheets belonging to the User.
	 */

	public Collection<CharacterSheets> getuCharacterSheets() {
		return uCharacterSheets;
	}

	/**
	 * Sets the collection of CharacterSheets belonging to the User.
	 * 
	 * @param uCharacterSheets a Collection of CharacterSheets belonging to the
	 *                         User.
	 */

	public void setuCharacterSheets(Collection<CharacterSheets> uCharacterSheets) {
		this.uCharacterSheets = uCharacterSheets;
	}

	/**
	 * Returns a String representation of the User, including its id, first name,
	 * last name, email, password, and collection of CharacterSheets.
	 * 
	 * @return a String representation of the User.
	 */

	@Override
	public String toString() {
		return "User [id=" + id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", password="
				+ password + ", uCharacterSheets=" + uCharacterSheets + "]";
	}

	/**
	 * Returns a hash code value for the User.
	 * 
	 * @return a hash code value for the User.
	 */

	@Override
	public int hashCode() {
		return Objects.hash(email, fName, id, lName, password, uCharacterSheets);
	}

	/**
	 * Indicates whether some other object is "equal to" this one.
	 * 
	 * @param obj the object to compare this User against.
	 * @return true if the given object represents a User equivalent to this User,
	 *         false otherwise.
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(fName, other.fName) && Objects.equals(id, other.id)
				&& Objects.equals(lName, other.lName) && Objects.equals(password, other.password)
				&& Objects.equals(uCharacterSheets, other.uCharacterSheets);
	}
}