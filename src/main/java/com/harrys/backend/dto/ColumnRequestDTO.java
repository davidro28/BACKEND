package com.harrys.backend.dto;

import lombok.Data;

@Data
public class ColumnRequestDTO {
      private String boardId;
      private String name;
      private int position;
}
