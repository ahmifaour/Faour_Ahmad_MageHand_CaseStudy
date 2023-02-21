package com.ahmi.magehand.models;

import java.util.Collection;

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
public class Classes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long classId;
	
	@Column (name = "Class Name", length = 50, nullable = false)
	private String className;
	
	@Column (name = "Class Description", length = 500, nullable = false)
	private String classDesc;
	
	@ManyToMany(targetEntity = CharacterSheets.class, cascade = {(CascadeType.ALL)})
	private Collection<CharacterSheets> classCharacterSheets;
	
	public Classes() {

		
	}

	public Classes(Long classId, String className, Collection<CharacterSheets> classCharacterSheets) {
		
		this.classId = classId;
		this.className = className;
		this.classCharacterSheets = classCharacterSheets;
		
	}

	public Long getClassId() {
		
		return classId;
		
	}

	public void setClassId(Long classId) {
		
		this.classId = classId;
		
	}

	public String getClassName() {
		
		return className;
		
	}

	public void setClassName(String className) {
		
		this.className = className;
		
	}

	public Collection<CharacterSheets> getClassCharacterSheets() {
		
		return classCharacterSheets;
		
	}

	public void setClassCharacterSheets(Collection<CharacterSheets> classCharacterSheets) {
		
		this.classCharacterSheets = classCharacterSheets;
		
	}
	
}
