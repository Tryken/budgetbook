package com.example.budgetbook.user.domain.mapper;

import com.example.budgetbook.user.domain.User;
import com.example.budgetbook.user.domain.persistence.UserEntity;
import com.example.model.UserDetailsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class UserMapper {

    public abstract User toUser(UserEntity userEntity);

    public abstract UserEntity toUserEntity(User user);

    public abstract UserDetailsDto toUserDetailsDto(User user);
}
