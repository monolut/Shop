package nicolai.ashirov.shop.mapper;

import nicolai.ashirov.shop.dto.CartItemDto;
import nicolai.ashirov.shop.models.CartItemEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CartItemMapper {
    CartItemDto toDto(CartItemEntity cartItemEntity);
    CartItemEntity toEntity(CartItemDto cartItemDto);
}
