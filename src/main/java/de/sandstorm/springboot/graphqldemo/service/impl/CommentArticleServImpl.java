package de.sandstorm.springboot.graphqldemo.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.sandstorm.springboot.graphqldemo.model.Article;

import de.sandstorm.springboot.graphqldemo.repository.ArticleRepository;

import de.sandstorm.springboot.graphqldemo.service.CommentArticleService;


@Service
public class CommentArticleServImpl implements CommentArticleService{

	@Autowired
	 ArticleRepository articleRepository;

     @Override
 	public Article findArticleById(Long id) {
 		
 		return articleRepository.findArticleById(id);
 	}

}
