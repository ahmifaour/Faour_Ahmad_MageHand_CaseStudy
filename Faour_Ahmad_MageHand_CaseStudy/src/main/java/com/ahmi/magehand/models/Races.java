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

	public Races() {


	}

	public Races(Long raceid, String raceName, String raceDesc, String raceBonus,
			Collection<CharacterSheets> rCharacterSheets) {
		super();
		this.raceid = raceid;
		this.raceName = raceName;
		this.raceDesc = raceDesc;
		this.raceBonus = raceBonus;
		this.rCharacterSheets = rCharacterSheets;
	}

	public Long getRaceid() {
		return raceid;
	}

	public void setRaceid(Long raceid) {
		this.raceid = raceid;
	}

	public String getRaceName() {
		return raceName;
	}

	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}

	public String getRaceDesc() {
		return raceDesc;
	}

	public void setRaceDesc(String raceDesc) {
		this.raceDesc = raceDesc;
	}

	public String getRaceBonus() {
		return raceBonus;
	}

	public void setRaceBonus(String raceBonus) {
		this.raceBonus = raceBonus;
	}

	public Collection<CharacterSheets> getrCharacterSheets() {
		return rCharacterSheets;
	}

	public void setrCharacterSheets(Collection<CharacterSheets> rCharacterSheets) {
		this.rCharacterSheets = rCharacterSheets;
	}

	@Override
	public String toString() {
		return "Races [raceid=" + raceid + ", raceName=" + raceName + ", raceDesc=" + raceDesc + ", raceBonus="
				+ raceBonus + ", rCharacterSheets=" + rCharacterSheets + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(rCharacterSheets, raceBonus, raceDesc, raceName, raceid);
	}

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
