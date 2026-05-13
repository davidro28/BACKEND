package com.harrys.backend.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "board_members")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardMember {

      @Id
      private String id;

      private String boardId;

      private String userId;

      private BoardRole boardRole; // Sin @Enumerated, Mongo lo maneja solo

      private Date joinedAt;
}
