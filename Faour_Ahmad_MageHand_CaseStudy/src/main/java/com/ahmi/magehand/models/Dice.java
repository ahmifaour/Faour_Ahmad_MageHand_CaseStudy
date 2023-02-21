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
public class Dice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long dId;
	
	@Column (name = "Dice Name", length = 50, nullable = false)
	private String dName;
	
	public Dice() {

		
	}

	public Dice(Long dId, String dName) {
		
		super();
		this.dId = dId;
		this.dName = dName;
		
	}

	public Long getdId() {
		
		return dId;
		
	}

	public void setdId(Long dId) {
		
		this.dId = dId;
		
	}

	public String getdName() {
		
		return dName;
		
	}

	public void setdName(String dName) {
		
		this.dName = dName;
		
	}

	@Override
	public String toString() {
		
		return "Dice [dId=" + dId + ", dName=" + dName + "]";
		
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(dId, dName);
		
	}

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
