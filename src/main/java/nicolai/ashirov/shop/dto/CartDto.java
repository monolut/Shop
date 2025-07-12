package nicolai.ashirov.shop.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class CartDto {
    private int quantity;
    private BigDecimal sum;
    private List<CartItemDto> items;
}
