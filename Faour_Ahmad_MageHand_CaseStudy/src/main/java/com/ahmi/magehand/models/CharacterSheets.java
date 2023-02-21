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
	
	@Column (name = "Character Name", length = 50, nullable = false)
	private String cName;
	
	@Column (name = "Character Race", length = 50, nullable = false)
	private String cRace;
	
	@Column (name = "Character Class", length = 50, nullable = false)
	private String cClass;
	
	public CharacterSheets() {

		
	}

	public CharacterSheets(Long csId, String cName, String cRace, String cClass) {
		
		this.csId = csId;
		this.cName = cName;
		this.cRace = cRace;
		this.cClass = cClass;
		
	}

	public Long getCsId() {
		
		return csId;
		
	}

	public void setCsId(Long csId) {
		
		this.csId = csId;
		
	}

	public String getcName() {
		
		return cName;
		
	}

	public void setcName(String cName) {
		
		this.cName = cName;
		
	}

	public String getcRace() {
		
		return cRace;
		
	}

	public void setcRace(String cRace) {
		
		this.cRace = cRace;
		
	}

	public String getcClass() {
		
		return cClass;
		
	}

	public void setcClass(String cClass) {
		
		this.cClass = cClass;
		
	}

	@Override
	public String toString() {
		
		return "CharacterSheets [csId=" + csId + ", cName=" + cName + ", cRace=" + cRace + ", cClass=" + cClass + "]";
		
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(cClass, cName, cRace, csId);
		
	}

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
