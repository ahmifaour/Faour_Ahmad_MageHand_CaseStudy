package com.ahmi.magehand.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ahmi.magehand.models.CharacterSheets;

/**
 * 
 * Repository for the CharacterSheets model.
 *
 */

@Repository
public interface CharacterSheetRepository extends JpaRepository<CharacterSheets, Long> {
	
	public Optional<CharacterSheets> findCharacterBycsId(Long csId);

	public void deleteCharacterBycsId(Long csId);

}
