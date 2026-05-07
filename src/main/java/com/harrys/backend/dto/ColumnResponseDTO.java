package com.harrys.backend.dto;

import lombok.Data;
import java.util.Date;

@Data
public class ColumnResponseDTO {
      private String id;
      private String boardId;
      private String name;
      private int position;
      private Date createdAt;
}
