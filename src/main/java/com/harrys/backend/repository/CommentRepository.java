package com.harrys.backend.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.harrys.backend.models.Comment;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String>{
      List<Comment> findByCardId(String cardId);
       List<Comment> findByAuthorUserId(String authorUserId);
}
