package nicolai.ashirov.shop.mapper;

import nicolai.ashirov.shop.dto.CartDto;
import nicolai.ashirov.shop.models.CartEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartDto toDto(CartEntity cartEntity);
    CartEntity toEntity(CartDto cartDto);
}
