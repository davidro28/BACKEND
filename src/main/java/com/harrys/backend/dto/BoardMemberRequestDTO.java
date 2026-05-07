package com.harrys.backend.dto;

import com.harrys.backend.models.BoardRole;
import lombok.Data;

@Data
public class BoardMemberRequestDTO {
      private String boardId;
      private String userId;
      private BoardRole boardRole;
}
