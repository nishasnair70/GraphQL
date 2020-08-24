package de.sandstorm.springboot.graphqldemo.service;



import de.sandstorm.springboot.graphqldemo.model.Comment;

public interface CommentService {
	Comment save(Comment comment);
	boolean delete(Long id);
}
