package com.ahmi.magehand.models;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 * This class represents the entity of Dice which is mapped to a database table.
 */
@Entity
@Table
public class Dice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long dId;

	@Column(name = "Dice Name", length = 50, nullable = false)
	private String dName;

	/**
	 * 
	 * Default constructor for the Dice entity.
	 */
	public Dice() {

	}

	/**
	 * 
	 * Constructor for the Dice entity with specified fields.
	 * 
	 * @param dId   the ID of the dice
	 * 
	 * @param dName the name of the dice
	 */
	public Dice(Long dId, String dName) {

		super();
		this.dId = dId;
		this.dName = dName;

	}

	/**
	 * 
	 * Get the ID of the dice.
	 * 
	 * @return the ID of the dice
	 */
	public Long getdId() {

		return dId;

	}

	/**
	 * 
	 * Set the ID of the dice.
	 * 
	 * @param dId the ID of the dice
	 */
	public void setdId(Long dId) {

		this.dId = dId;

	}

	/**
	 * 
	 * Get the name of the dice.
	 * 
	 * @return the name of the dice
	 */
	public String getdName() {

		return dName;

	}

	/**
	 * 
	 * Set the name of the dice.
	 * 
	 * @param dName the name of the dice
	 */
	public void setdName(String dName) {

		this.dName = dName;

	}

	/**
	 * 
	 * Return a string representation of the Dice entity.
	 * 
	 * @return a string representation of the Dice entity
	 */
	@Override
	public String toString() {

		return "Dice [dId=" + dId + ", dName=" + dName + "]";

	}

	/**
	 * 
	 * Returns a hash code value for the Dice entity.
	 * 
	 * @return a hash code value for the Dice entity
	 */
	@Override
	public int hashCode() {

		return Objects.hash(dId, dName);

	}

	/**
	 * 
	 * Indicates whether some other object is "equal to" this one.
	 * 
	 * @param obj the reference object with which to compare
	 * 
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
		Dice other = (Dice) obj;
		return Objects.equals(dId, other.dId) && Objects.equals(dName, other.dName);

	}

}
