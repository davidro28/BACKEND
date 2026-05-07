package com.harrys.backend.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.harrys.backend.models.BoardMember;

@Repository
public interface BoardMemberRepository extends MongoRepository<BoardMember, String>{
      List<BoardMember> findByBoardId(String boardId);
      List<BoardMember> findByUserId(String userId);
      Optional<BoardMember> findByBoardIdAndUserId(String boardId, String userId);
      boolean existsByBoardIdAndUserId(String boardId, String userId);
}
