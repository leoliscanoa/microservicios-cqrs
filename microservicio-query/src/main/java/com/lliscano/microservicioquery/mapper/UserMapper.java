package com.lliscano.microservicioquery.mapper;



import com.lliscano.commons.dto.UserDTO;
import com.lliscano.microservicioquery.entity.Users;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDto(Users user);
    Users toEntity(UserDTO userDTO);
}
