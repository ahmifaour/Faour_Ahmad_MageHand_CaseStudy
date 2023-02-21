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

@Entity
@Table
public class User {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column (name = "First Name", length = 50, nullable = false)
		private String fName;
		
		@Column (name = "Last Name", length = 50, nullable = false)
		private String lName;
		
		@Column (name = "Email", length = 50, nullable = false)
		private String email;
		
		@Column (name = "Password", length = 50, nullable = false)
		private String password;
		
		@OneToMany(targetEntity = CharacterSheets.class, cascade = {(CascadeType.ALL)})
		private Collection<CharacterSheets> uCharacterSheets;
		

		public User() {
			
		}


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


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getfName() {
			return fName;
		}


		public void setfName(String fName) {
			this.fName = fName;
		}


		public String getlName() {
			return lName;
		}


		public void setlName(String lName) {
			this.lName = lName;
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


		public Collection<CharacterSheets> getuCharacterSheets() {
			return uCharacterSheets;
		}


		public void setuCharacterSheets(Collection<CharacterSheets> uCharacterSheets) {
			this.uCharacterSheets = uCharacterSheets;
		}


		@Override
		public String toString() {
			return "User [id=" + id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", password="
					+ password + ", uCharacterSheets=" + uCharacterSheets + "]";
		}


		@Override
		public int hashCode() {
			return Objects.hash(email, fName, id, lName, password, uCharacterSheets);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			return Objects.equals(email, other.email) && Objects.equals(fName, other.fName)
					&& Objects.equals(id, other.id) && Objects.equals(lName, other.lName)
					&& Objects.equals(password, other.password)
					&& Objects.equals(uCharacterSheets, other.uCharacterSheets);
		}

}