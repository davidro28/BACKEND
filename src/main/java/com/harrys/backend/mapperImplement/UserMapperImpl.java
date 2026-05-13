package com.harrys.backend.mapperImplement;

import org.springframework.stereotype.Component;
import com.harrys.backend.dto.UserRequestDTO;
import com.harrys.backend.dto.UserResponseDTO;
import com.harrys.backend.mappers.UserMapper;
import com.harrys.backend.models.GlobalRole;
import com.harrys.backend.models.User;

@Component
public class UserMapperImpl implements UserMapper {
    
    @Override
    public User toModel(UserRequestDTO dto) {
        return User.builder()
            .name(dto.getName())
            .email(dto.getEmail())
            .password(dto.getPassword())
            .globalRole(GlobalRole.RESPONSABLE)
            .createdAt(new java.util.Date())
            .build();
    }

    @Override
    public UserResponseDTO toDTO(User user) {
        UserResponseDTO dto = new UserResponseDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setGlobalRole(user.getGlobalRole());
        return dto;
    }
}
