package com.harrys.backend.dto;

import lombok.Data;

@Data
public class CommentRequestDTO {
      private String cardId;
      private String authorUserId;
      private String content;
}
