package de.sandstorm.springboot.graphqldemo.repository;

import de.sandstorm.springboot.graphqldemo.model.Article;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
	Article findArticleById(Long id);
}
