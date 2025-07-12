package nicolai.ashirov.shop.mapper;

import nicolai.ashirov.shop.dto.UserDto;
import nicolai.ashirov.shop.models.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(UserEntity userEntity);
    UserEntity toEntity(UserDto userDto);
}
