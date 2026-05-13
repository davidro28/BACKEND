package com.harrys.backend.mappers;

import com.harrys.backend.dto.BoardRequestDTO;
import com.harrys.backend.dto.BoardResponseDTO;
import com.harrys.backend.models.Board;

public interface BoardMapper {
    Board toModel(BoardRequestDTO dto);
    BoardResponseDTO toDTO(Board board);
}
