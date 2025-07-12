package nicolai.ashirov.shop.mapper;

import nicolai.ashirov.shop.dto.CategoryDto;
import nicolai.ashirov.shop.models.CategoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryDto toDto(CategoryEntity categoryEntity);
    CategoryEntity toEntity(CategoryDto categoryDto);
}
