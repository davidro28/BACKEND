package com.harrys.backend.mappers;

import com.harrys.backend.dto.BoardMemberRequestDTO;
import com.harrys.backend.dto.BoardMemberResponseDTO;
import com.harrys.backend.models.BoardMember;

public interface BoardMemberMapper {
    BoardMember toModel(BoardMemberRequestDTO dto);
    BoardMemberResponseDTO toDTO(BoardMember boardMember);
}