package de.sandstorm.springboot.graphqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.sandstorm.springboot.graphqldemo.model.Author;




@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
	Author findAuthorById(Long id);
}
