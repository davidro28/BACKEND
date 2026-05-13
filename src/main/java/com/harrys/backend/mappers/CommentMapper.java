package com.harrys.backend.mappers;

import com.harrys.backend.dto.CommentRequestDTO;
import com.harrys.backend.models.Comment;
import com.harrys.backend.repository.CommentRepository;

public interface CommentMapper {
    Comment toModel(CommentRequestDTO dto);
    CommentRepository toDTO(Comment comment);
}
