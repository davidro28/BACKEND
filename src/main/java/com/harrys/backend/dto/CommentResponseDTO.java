package com.harrys.backend.dto;

import lombok.Data;
import java.util.Date;

@Data
public class CommentResponseDTO {
      private String id;
      private String cardId;
      private String authorUserId;
      private String content;
      private Date createdAt;
}
