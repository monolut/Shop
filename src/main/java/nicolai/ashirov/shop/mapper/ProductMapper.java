package nicolai.ashirov.shop.mapper;

import nicolai.ashirov.shop.dto.ProductDto;
import nicolai.ashirov.shop.models.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDto toDto(ProductEntity productEntity);
    ProductEntity toEntity(ProductDto productDto);
}
