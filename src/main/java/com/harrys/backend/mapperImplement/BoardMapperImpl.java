package com.harrys.backend.mapperImplement;

import org.springframework.stereotype.Component;
import com.harrys.backend.dto.BoardRequestDTO;
import com.harrys.backend.dto.BoardResponseDTO;
import com.harrys.backend.mappers.BoardMapper;
import com.harrys.backend.models.Board;

@Component
public class BoardMapperImpl implements BoardMapper{

    @Override
    public Board toModel(BoardRequestDTO dto) {
        return Board.builder()
            .name(dto.getName())
            .favorite(dto.isFavorite())
            .createdAt(new java.util.Date())
            .build();
    }

    @Override
    public BoardResponseDTO toDTO(Board board) {
        BoardResponseDTO dto = new BoardResponseDTO();
        dto.setId(board.getId());
        dto.setName(board.getName());
        dto.setOwnerUserId(board.getOwnerUserId());
        dto.setFavorite(board.isFavorite());
        dto.setCreatedAt(board.getCreatedAt());
        return dto;
    }
}
