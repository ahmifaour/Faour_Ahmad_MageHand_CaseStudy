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
public class Spells {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sId;
	
	@Column (name = "Spell Name", length = 50, nullable = false)
	private String sName;
	
	@Column (name = "Spell Description", length = 5000, nullable = false)
	private String sDesc;
	
	@Column (name = "Spell Level", length = 1, nullable = false)
	private String sLevel;
	
	
	public Spells() {

		
	}

	public Spells(Long sId, String sName, String sDesc) {

		this.sId = sId;
		this.sName = sName;
		this.sDesc = sDesc;
		
	}

	public Long getsId() {
		
		return sId;
		
	}

	public void setsId(Long sId) {
		
		this.sId = sId;
		
	}

	public String getsName() {
		
		return sName;
		
	}

	public void setsName(String sName) {
		
		this.sName = sName;
		
	}

	public String getsDesc() {
		
		return sDesc;
		
	}

	public void setsDesc(String sDesc) {
		
		this.sDesc = sDesc;
		
	}

	@Override
	public String toString() {
		
		return "Spells [sId=" + sId + ", sName=" + sName + ", sDesc=" + sDesc + "]";
		
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(sDesc, sId, sName);
		
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Spells other = (Spells) obj;
		return Objects.equals(sDesc, other.sDesc) && Objects.equals(sId, other.sId)
				&& Objects.equals(sName, other.sName);
		
	}
	
	
	
}
