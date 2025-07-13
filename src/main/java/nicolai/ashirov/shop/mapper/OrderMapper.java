package nicolai.ashirov.shop.mapper;

import nicolai.ashirov.shop.dto.OrderDto;
import nicolai.ashirov.shop.models.OrderEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDto toDto(OrderEntity orderEntity);
    OrderEntity toEntity(OrderDto orderDto);
}
