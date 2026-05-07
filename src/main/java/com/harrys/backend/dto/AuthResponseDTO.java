package com.harrys.backend.dto;

import lombok.Data;

@Data
public class AuthResponseDTO {
      private String token;
      private String userId;
      private String name;
      private String email;
}
