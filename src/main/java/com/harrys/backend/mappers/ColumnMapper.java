package com.harrys.backend.mappers;

import com.harrys.backend.dto.ColumnRequestDTO;
import com.harrys.backend.dto.ColumnResponseDTO;
import com.harrys.backend.models.Column;

public interface ColumnMapper {
    Column toModel(ColumnRequestDTO dto);
    ColumnResponseDTO toDTO(Column column);
}
