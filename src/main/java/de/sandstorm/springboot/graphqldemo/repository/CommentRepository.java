package de.sandstorm.springboot.graphqldemo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.sandstorm.springboot.graphqldemo.model.Comment;
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    Comment findCommentById(Long id);
}
