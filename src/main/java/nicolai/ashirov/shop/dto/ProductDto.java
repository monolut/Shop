package nicolai.ashirov.shop.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDto {
    private String title;
    private String description;
    private BigDecimal price;
    private int stock;
    private boolean inStock;
}
