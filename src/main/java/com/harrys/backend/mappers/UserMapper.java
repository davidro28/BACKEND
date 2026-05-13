package com.harrys.backend.mappers;

import com.harrys.backend.dto.UserRequestDTO;
import com.harrys.backend.dto.UserResponseDTO;
import com.harrys.backend.models.User;

public interface UserMapper {
    User toModel(UserRequestDTO dto);
    UserResponseDTO toDTO(User user);

}
