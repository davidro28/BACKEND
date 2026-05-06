package com.harrys.backend.models;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "cards")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Card {

      @Id
      private String id;

      private String columnId;

      private String boardId;

      private String title;

      private String description;

      private String category; // "Investigación", "Diseño", "Bug", "Contenido"...

      private List<String> assignedUserIds; // responsables asignados

      private LocalDateTime dueDate; // fecha límite

      private int position; // orden dentro de la columna

      private LocalDateTime createdAt;
}
