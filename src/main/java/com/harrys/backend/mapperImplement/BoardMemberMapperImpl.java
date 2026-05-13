package com.harrys.backend.mapperImplement;

import org.springframework.stereotype.Component;

import com.harrys.backend.dto.BoardMemberRequestDTO;
import com.harrys.backend.dto.BoardMemberResponseDTO;
import com.harrys.backend.mappers.BoardMemberMapper;
import com.harrys.backend.models.BoardMember;

@Component
public class BoardMemberMapperImpl implements BoardMemberMapper {

    @Override
    public BoardMember toModel(BoardMemberRequestDTO dto) {
        return BoardMember.builder()
                .boardId(dto.getBoardId())
                .userId(dto.getUserId())
                .boardRole(dto.getBoardRole())
                .joinedAt(new java.util.Date())
                .build();
    }

    @Override
    public BoardMemberResponseDTO toDTO(BoardMember boardMember) {
        BoardMemberResponseDTO dto = new BoardMemberResponseDTO();
        dto.setId(boardMember.getId());
        dto.setBoardId(boardMember.getBoardId());
        dto.setUserId(boardMember.getUserId());
        dto.setBoardRole(boardMember.getBoardRole());
        dto.setJoinedAt(boardMember.getJoinedAt());
        return dto;
    }
}
