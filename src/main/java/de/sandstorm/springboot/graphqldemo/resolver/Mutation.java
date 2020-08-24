package de.sandstorm.springboot.graphqldemo.resolver;


import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import de.sandstorm.springboot.graphqldemo.model.Article;
import de.sandstorm.springboot.graphqldemo.model.Author;
import de.sandstorm.springboot.graphqldemo.model.Comment;
import de.sandstorm.springboot.graphqldemo.repository.ArticleRepository;
import de.sandstorm.springboot.graphqldemo.repository.AuthorRepository;
import de.sandstorm.springboot.graphqldemo.repository.CommentRepository;
import de.sandstorm.springboot.graphqldemo.service.CommentArticleService;
import de.sandstorm.springboot.graphqldemo.service.CommentAuthorService;
import de.sandstorm.springboot.graphqldemo.service.CommentService;
import javassist.NotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
/**
 * 
 * @author nisha
 *
 */
@Component
public class Mutation implements GraphQLMutationResolver {
	@Autowired
	 private CommentArticleService commentArticleService;
	@Autowired
	 private CommentAuthorService commentAuthorService;
	@Autowired
	 private CommentService commentService;
	@Autowired
    private ArticleRepository articleRepository;
	@Autowired
    private AuthorRepository authorRepository;
	@Autowired
    private CommentRepository commentRepository;

    /**
     * save new Entity 
     * @param title
     * @param text
     * @param authorId
     * @return
     * @throws NotFoundException
     */

	public Comment addComments(String text, Long authorId, Long articleId) throws NotFoundException {
		Comment comment = new Comment();
		comment.setText(text);
		Author author = commentAuthorService.findAuthorById(authorId);
		if (author != null) {
			comment.setAuthor(author);
			Article article = commentArticleService.findArticleById(articleId);
			if (article != null) {
				comment.setArticle(article);
				return commentService.save(comment);
			} else {
				throw new NotFoundException("Not found article to save");
			}
		} else {
			throw new NotFoundException("Not found author to save");
		}
	}
	 /**
     * delete a data by Id 
      */
    public boolean deleteComment(Long id) {
       return commentService.delete(id);
    }
    /**
     * update a particular data
      */
    public Comment updateComments(Long  id,String text, Long authorId,Long articleId) throws NotFoundException  {
    	Comment comment = commentRepository.findCommentById(id);
    	if(comment != null) {
    		comment.setText(text);
    		Author author=commentAuthorService.findAuthorById(authorId);
            if(author != null) {
            	comment.setAuthor(author);
            	Article article=commentArticleService.findArticleById(articleId);
                if(article != null) {
                	comment.setArticle(article);
                	return commentService.save(comment);
                }else {
      	    	  throw new NotFoundException("Not found article to save");
      	      }
            } else {
  	    	  throw new NotFoundException("Not found author to save");
  	      }
            
    	
    		
    	}else {
	    	  throw new NotFoundException("Not found comment to save");
	      }
   
    }
    
 
}
