package de.sandstorm.springboot.graphqldemo.service;


import de.sandstorm.springboot.graphqldemo.model.Author;

public interface CommentAuthorService {
	
	Author findAuthorById(Long id);
}
