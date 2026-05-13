package com.harrys.backend.mappers;

import com.harrys.backend.dto.CardRequestDTO;
import com.harrys.backend.dto.CardResponseDTO;
import com.harrys.backend.models.Card;

public interface CardMapper {
    Card toModel(CardRequestDTO dto);
    CardResponseDTO toDTO(Card card);
}
