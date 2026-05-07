package com.harrys.backend.dto;

import java.util.List;
import lombok.Data;
import java.util.Date;

@Data
public class CardRequestDTO {
      private String columnId;
      private String boardId;
      private String title;
      private String description;
      private String category;
      private List<String> assignedUserIds;
      private Date dueDate;
      private int position;
}
