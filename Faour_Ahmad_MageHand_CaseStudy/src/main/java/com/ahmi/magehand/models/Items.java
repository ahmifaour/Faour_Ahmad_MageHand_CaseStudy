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
public class Items {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long iId;
	
	@Column (name = "Item Name", length = 50, nullable = false)
	private String itemName;
	
	@Column (name = "Item Description", length = 5000, nullable = false)
	private String itemDesc;
	
	@ManyToMany(targetEntity = CharacterSheets.class, cascade = {(CascadeType.ALL)})
	private Collection<CharacterSheets> iCharacterSheets;
	
	public Items() {
		
		
	}

	public Items(Long iId, String itemName, String itemDesc, Collection<CharacterSheets> iCharacterSheets) {

		this.iId = iId;
		this.itemName = itemName;
		this.itemDesc = itemDesc;
		this.iCharacterSheets = iCharacterSheets;
		
	}

	public Long getiId() {
		
		return iId;
		
	}

	public void setiId(Long iId) {
		
		this.iId = iId;
		
	}

	public String getItemName() {
		
		return itemName;
		
	}

	public void setItemName(String itemName) {
		
		this.itemName = itemName;
		
	}

	public String getItemDesc() {
		
		return itemDesc;
		
	}

	public void setItemDesc(String itemDesc) {
		
		this.itemDesc = itemDesc;
		
	}

	public Collection<CharacterSheets> getiCharacterSheets() {
		
		return iCharacterSheets;
		
	}

	public void setiCharacterSheets(Collection<CharacterSheets> iCharacterSheets) {
		
		this.iCharacterSheets = iCharacterSheets;
		
	}

	@Override
	public String toString() {
		
		return "Items [iId=" + iId + ", itemName=" + itemName + ", itemDesc=" + itemDesc + ", iCharacterSheets="
				+ iCharacterSheets + "]";
		
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(iCharacterSheets, iId, itemDesc, itemName);
		
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Items other = (Items) obj;
		return Objects.equals(iCharacterSheets, other.iCharacterSheets) && Objects.equals(iId, other.iId)
				&& Objects.equals(itemDesc, other.itemDesc) && Objects.equals(itemName, other.itemName);
		
	}
	
	
	
}
