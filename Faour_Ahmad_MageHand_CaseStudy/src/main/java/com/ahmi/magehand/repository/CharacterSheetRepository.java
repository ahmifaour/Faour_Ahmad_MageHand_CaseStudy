package com.ahmi.magehand.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ahmi.magehand.models.CharacterSheets;

@Repository
public interface CharacterSheetRepository extends CrudRepository<CharacterSheets, Long> {
	
	public Optional<CharacterSheets> findCharacterByName(Long cName);

	public void delete(Long id);

}
