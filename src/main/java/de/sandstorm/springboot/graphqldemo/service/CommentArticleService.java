package de.sandstorm.springboot.graphqldemo.service;



import de.sandstorm.springboot.graphqldemo.model.Article;

public interface CommentArticleService {
	
	Article findArticleById(Long id);
}
