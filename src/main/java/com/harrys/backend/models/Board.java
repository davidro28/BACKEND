package com.harrys.backend.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "boards")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {

      @Id
      private String id;

      private String name;

      private String ownerUserId;//quien creo el board

      private boolean favorite;

      private Date createdAt;

}
