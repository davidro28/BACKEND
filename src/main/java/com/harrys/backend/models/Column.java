package com.harrys.backend.models;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "columns")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Column {

      @Id
      private String id;

      private String boardId;

      private String name; // "Pendientes", "Por hacer", "En progreso"

      private int position; // para ordenar las columnas

      private LocalDateTime createdAt;
}
