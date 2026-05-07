package com.harrys.backend.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.harrys.backend.models.Board;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends MongoRepository<Board, String>{
      List<Board> findByOwnerUserId(String ownerUserId);
      List<Board> findByFavoriteTrue();
}
