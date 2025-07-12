package nicolai.ashirov.shop.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartItemDto {
    private int quantity;
    private BigDecimal price;
    private ProductDto product;
}
