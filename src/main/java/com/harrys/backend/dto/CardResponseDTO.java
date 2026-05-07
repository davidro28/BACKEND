package com.harrys.backend.dto;

import java.util.List;
import java.util.Date;
import lombok.Data;

@Data
public class CardResponseDTO {
      private String id;
      private String columnId;
      private String boardId;
      private String title;
      private String description;
      private String category;
      private List<String> assignedUserIds;
      private Date dueDate;
      private int position;
      private Date createdAt;
}
