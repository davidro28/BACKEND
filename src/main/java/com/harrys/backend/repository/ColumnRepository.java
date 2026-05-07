package com.harrys.backend.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.harrys.backend.models.Column;

@Repository
public interface ColumnRepository extends MongoRepository<Column, String>{
      List<Column> findByBoardIdOrderByPositionAsc(String boardId);
}
