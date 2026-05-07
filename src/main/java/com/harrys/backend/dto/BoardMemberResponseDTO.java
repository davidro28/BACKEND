package com.harrys.backend.dto;

import com.harrys.backend.models.BoardRole;
import lombok.Data;
import java.util.Date;

@Data
public class BoardMemberResponseDTO {
      private String id;
      private String boardId;
      private String userId;
      private BoardRole boardRole;
      private Date joinedAt;
}
