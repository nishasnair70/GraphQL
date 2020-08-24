package de.sandstorm.springboot.graphqldemo.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.sandstorm.springboot.graphqldemo.model.Author;
import de.sandstorm.springboot.graphqldemo.repository.AuthorRepository;
import de.sandstorm.springboot.graphqldemo.service.CommentAuthorService;
@Service
public class CommentAuthSerImpl implements CommentAuthorService{
      @Autowired
	 AuthorRepository authorRepository;


      @Override
    	public Author findAuthorById(Long id) {
    		return authorRepository.findAuthorById(id);
    	}
      
}
