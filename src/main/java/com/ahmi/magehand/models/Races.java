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

@Entity
@Table
public class Races {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long raceid;

	@Column(name = "Race Name", length = 50, nullable = false)
	private String raceName;

	@Column(name = "Race Description", length = 5000, nullable = false)
	private String raceDesc;

	@Column(name = "Race Bonuses", length = 5000, nullable = false)
	private String raceBonus;

	@ManyToMany(targetEntity = CharacterSheets.class, cascade = { (CascadeType.ALL) })
	private Collection<CharacterSheets> rCharacterSheets;

	/**
	 * Default constructor for the Races class.
	 */
	public Races() {

	}

	/**
	 * Constructor for the Races class that takes parameters for all fields.
	 * 
	 * @param raceid           The unique identifier for the race.
	 * @param raceName         The name of the race.
	 * @param raceDesc         A description of the race.
	 * @param raceBonus        Any bonuses or abilities that the race confers.
	 * @param rCharacterSheets A collection of character sheets belonging to this
	 *                         race.
	 */
	public Races(Long raceid, String raceName, String raceDesc, String raceBonus,
			Collection<CharacterSheets> rCharacterSheets) {
		super();
		this.raceid = raceid;
		this.raceName = raceName;
		this.raceDesc = raceDesc;
		this.raceBonus = raceBonus;
		this.rCharacterSheets = rCharacterSheets;
	}

	/**
	 * Getter method for the race's unique identifier.
	 * 
	 * @return The unique identifier for the race.
	 */
	public Long getRaceid() {
		return raceid;
	}

	/**
	 * Setter method for the race's unique identifier.
	 * 
	 * @param raceid The unique identifier for the race.
	 */
	public void setRaceid(Long raceid) {
		this.raceid = raceid;
	}

	/**
	 * Getter method for the race's name.
	 * 
	 * @return The name of the race.
	 */
	public String getRaceName() {
		return raceName;
	}

	/**
	 * Setter method for the race's name.
	 * 
	 * @param raceName The name of the race.
	 */
	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}

	/**
	 * Getter method for the race's description.
	 * 
	 * @return A description of the race.
	 */
	public String getRaceDesc() {
		return raceDesc;
	}

	/**
	 * Setter method for the race's description.
	 * 
	 * @param raceDesc A description of the race.
	 */
	public void setRaceDesc(String raceDesc) {
		this.raceDesc = raceDesc;
	}

	/**
	 * Getter method for the race's bonuses or abilities.
	 * 
	 * @return Any bonuses or abilities that the race confers.
	 */
	public String getRaceBonus() {
		return raceBonus;
	}

	/**
	 * 
	 * Sets the bonus for the race.
	 * 
	 * @param raceBonus the bonus for the race
	 */
	public void setRaceBonus(String raceBonus) {
		this.raceBonus = raceBonus;
	}

	/**
	 * 
	 * Gets the collection of character sheets associated with the race.
	 * 
	 * @return the collection of character sheets associated with the race
	 */
	public Collection<CharacterSheets> getrCharacterSheets() {
		return rCharacterSheets;
	}

	/**
	 * 
	 * Sets the collection of character sheets associated with the race.
	 * 
	 * @param rCharacterSheets the collection of character sheets associated with
	 *                         the race
	 */
	public void setrCharacterSheets(Collection<CharacterSheets> rCharacterSheets) {
		this.rCharacterSheets = rCharacterSheets;
	}

	/**
	 * 
	 * Returns a string representation of the race object.
	 * 
	 * @return a string representation of the race object
	 */
	@Override
	public String toString() {
		return "Races [raceid=" + raceid + ", raceName=" + raceName + ", raceDesc=" + raceDesc + ", raceBonus="
				+ raceBonus + ", rCharacterSheets=" + rCharacterSheets + "]";
	}

	/**
	 * 
	 * Returns a hash code value for the race object.
	 * 
	 * @return a hash code value for the race object
	 */
	@Override
	public int hashCode() {
		return Objects.hash(rCharacterSheets, raceBonus, raceDesc, raceName, raceid);
	}

	/**
	 * 
	 * Indicates whether some other object is "equal to" this one.
	 * 
	 * @param obj the object to compare with
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
		Races other = (Races) obj;
		return Objects.equals(rCharacterSheets, other.rCharacterSheets) && Objects.equals(raceBonus, other.raceBonus)
				&& Objects.equals(raceDesc, other.raceDesc) && Objects.equals(raceName, other.raceName)
				&& Objects.equals(raceid, other.raceid);
	}
}
