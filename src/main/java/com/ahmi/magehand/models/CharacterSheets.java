package com.ahmi.magehand.models;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class CharacterSheets {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long csId;

	@Column(name = "Character Name", length = 50, nullable = false)
	private String cName;

	@Column(name = "Character Race", length = 50, nullable = false)
	private String cRace;

	@Column(name = "Character Class", length = 50, nullable = false)
	private String cClass;
	
	@Column(name = "Character Ability Scores (Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma)", length = 50, nullable = false)
	private String cScores;
	
	@Column(name = "Character Spells (Insert information from Spell Table)", length = 5000, nullable = true)
	private String cSpells;
	
	@Column(name = "Character Items (Insert information from Item table)", length = 5000, nullable = true)
	private String cItems;

	public CharacterSheets() {

	}

	/**
	 * Constructs a new CharacterSheet object with the specified csId, cName, cRace
	 * and cClass.
	 * 
	 * @param csId   the character sheet's unique identifier.
	 * @param cName  the character sheet's name.
	 * @param cRace  the character sheet's race.
	 * @param cClass the character sheet's class.
	 */
	public CharacterSheets(Long csId, String cName, String cRace, String cClass) {

		this.csId = csId;
		this.cName = cName;
		this.cRace = cRace;
		this.cClass = cClass;

	}

	/**
	 * Returns the unique identifier of the CharacterSheet object.
	 * 
	 * @return the unique identifier of the CharacterSheet object.
	 */
	public Long getCsId() {

		return csId;

	}

	/**
	 * Sets the unique identifier of the CharacterSheet object.
	 * 
	 * @param csId the unique identifier of the CharacterSheet object.
	 */
	public void setCsId(Long csId) {

		this.csId = csId;

	}

	/**
	 * Returns the name of the CharacterSheet object.
	 * 
	 * @return the name of the CharacterSheet object.
	 */
	public String getcName() {

		return cName;

	}

	/**
	 * Sets the name of the CharacterSheet object.
	 * 
	 * @param cName the name of the CharacterSheet object.
	 */
	public void setcName(String cName) {

		this.cName = cName;

	}

	/**
	 * Returns the race of the CharacterSheet object.
	 * 
	 * @return the race of the CharacterSheet object.
	 */
	public String getcRace() {

		return cRace;

	}

	/**
	 * Sets the race of the CharacterSheet object.
	 * 
	 * @param cRace the race of the CharacterSheet object.
	 */
	public void setcRace(String cRace) {

		this.cRace = cRace;

	}

	/**
	 * Returns the class of the CharacterSheet object.
	 * 
	 * @return the class of the CharacterSheet object.
	 */
	public String getcClass() {

		return cClass;

	}

	/**
	 * Sets the class of the CharacterSheet object.
	 * 
	 * @param cClass the class of the CharacterSheet object.
	 */
	public void setcClass(String cClass) {

		this.cClass = cClass;

	}

	/**
	 * Returns a String representation of the CharacterSheets object.
	 * 
	 * @return A String representation of the CharacterSheets object.
	 */
	@Override
	public String toString() {

		return "CharacterSheets [csId=" + csId + ", cName=" + cName + ", cRace=" + cRace + ", cClass=" + cClass + "]";

	}

	/**
	 * Returns a hash code for the CharacterSheets object.
	 * 
	 * @return A hash code for the CharacterSheets object.
	 */

	@Override
	public int hashCode() {

		return Objects.hash(cClass, cName, cRace, csId);

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
		CharacterSheets other = (CharacterSheets) obj;
		return Objects.equals(cClass, other.cClass) && Objects.equals(cName, other.cName)
				&& Objects.equals(cRace, other.cRace) && Objects.equals(csId, other.csId);

	}

}
