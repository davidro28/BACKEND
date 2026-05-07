package com.harrys.backend.dto;

import com.harrys.backend.models.GlobalRole;
import lombok.Data;

@Data
public class UserResponseDTO {
      private String id;
      private String name;
      private String email;
      private GlobalRole globalRole;
}
