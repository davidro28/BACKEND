package com.harrys.backend.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.harrys.backend.models.Card;

@Repository
public interface CardRepository extends MongoRepository<Card, String>{
      List<Card> findByColumnIdOrderByPositionAsc(String columnId);
      List<Card> findByBoardId(String boardId);
      List<Card> findByAssignedUserIdsContaining(String userId);
}
