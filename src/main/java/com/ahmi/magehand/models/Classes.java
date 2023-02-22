package com.ahmi.magehand.models;

import java.util.Collection;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

/**
 * 
 * An Entity class representing a player character's class in a tabletop RPG.
 * 
 * This class is mapped to a database table named "Classes".
 */
@Entity
@Table(name = "Classes")
public class Classes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long classId;

	@Column(name = "Class Name", length = 50, nullable = false)
	private String className;

	@Column(name = "Class Description", length = 500, nullable = false)
	private String classDesc;

	@ManyToMany(targetEntity = CharacterSheets.class, cascade = { (CascadeType.ALL) })
	private Collection<CharacterSheets> classCharacterSheets;

	/**
	 * 
	 * Constructs an instance of the Classes class with default values.
	 */
	public Classes() {
	}

	/**
	 * 
	 * Constructs an instance of the Classes class with the specified values.
	 * 
	 * @param classId              the unique identifier of the class
	 * 
	 * @param className            the name of the class
	 * 
	 * @param classCharacterSheets the collection of character sheets associated
	 *                             with the class
	 */
	public Classes(Long classId, String className, Collection<CharacterSheets> classCharacterSheets) {

		this.classId = classId;
		this.className = className;
		this.classCharacterSheets = classCharacterSheets;

	}

	/**
	 * 
	 * Returns the unique identifier of the class.
	 * 
	 * @return the unique identifier of the class
	 */
	public Long getClassId() {

		return classId;

	}

	/**
	 * 
	 * Sets the unique identifier of the class.
	 * 
	 * @param classId the unique identifier of the class to set
	 */
	public void setClassId(Long classId) {

		this.classId = classId;

	}

	/**
	 * 
	 * Returns the name of the class.
	 * 
	 * @return the name of the class
	 */
	public String getClassName() {

		return className;

	}

	/**
	 * 
	 * Sets the name of the class.
	 * 
	 * @param className the name of the class to set
	 */
	public void setClassName(String className) {

		this.className = className;

	}

	/**
	 * 
	 * Returns the collection of character sheets associated with the class.
	 * 
	 * @return the collection of character sheets associated with the class
	 */
	public Collection<CharacterSheets> getClassCharacterSheets() {

		return classCharacterSheets;

	}

	/**
	 * 
	 * Sets the collection of character sheets associated with the class.
	 * 
	 * @param classCharacterSheets the collection of character sheets associated
	 *                             with the class to set
	 */
	public void setClassCharacterSheets(Collection<CharacterSheets> classCharacterSheets) {

		this.classCharacterSheets = classCharacterSheets;

	}

	/**
	 * 
	 * Returns a string representation of the Classes object.
	 * 
	 * @return a string representation of the Classes object
	 */
	@Override
	public String toString() {
		return "Classes [classId=" + classId + ", className=" + className + ", classDesc=" + classDesc
				+ ", classCharacterSheets=" + classCharacterSheets + "]";
	}

	/**
	 * 
	 * Returns a hash code value for the Classes object.
	 * 
	 * @return a hash code value for the Classes object
	 */
	@Override
	public int hashCode() {
		return Objects.hash(classCharacterSheets, classDesc, classId, className);
	}

	/**
	 * 
	 * Indicates whether some other object is "equal to" this one.
	 * 
	 * @param obj the reference object with which to compare
	 * @return true if this object is the same as the obj argument; false otherwise
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Classes other = (Classes) obj;
		return Objects.equals(classCharacterSheets, other.classCharacterSheets)
				&& Objects.equals(classDesc, other.classDesc) && Objects.equals(classId, other.classId)
				&& Objects.equals(className, other.className);
	}

}
