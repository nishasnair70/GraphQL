package de.sandstorm.springboot.graphqldemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.sandstorm.springboot.graphqldemo.model.Comment;
import de.sandstorm.springboot.graphqldemo.repository.CommentRepository;
import de.sandstorm.springboot.graphqldemo.service.CommentService;
@Service
public class CommentServiceImpl implements CommentService{
	@Autowired
	CommentRepository commentRepository;
	
	@Override
	public Comment save(Comment comment) {
		return commentRepository.save(comment);
	}
	@Override
    public boolean delete(Long id) {
		commentRepository.deleteById(id);
		return true;
    }
}
