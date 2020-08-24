package de.sandstorm.springboot.graphqldemo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import de.sandstorm.springboot.graphqldemo.model.Comment;


import de.sandstorm.springboot.graphqldemo.repository.CommentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class Query implements GraphQLQueryResolver {
  
    @Autowired
    private CommentRepository commentRepository;
    /**
     * fetch all data
      */
    public List<Comment> findAllcomments() {
        return commentRepository.findAll();
    } 
    /**
     * fetch particular  data from datasource
      */
    public Comment getCommentById(Long id) {
		return commentRepository.findCommentById(id);
	}

}
