package com.harrys.backend.dto;

import lombok.Data;
import java.util.Date;

@Data
public class BoardResponseDTO {
      private String id;
      private String name;
      private String ownerUserId;
      private boolean favorite;
      private Date createdAt;
}
