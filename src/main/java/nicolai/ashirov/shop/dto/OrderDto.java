package nicolai.ashirov.shop.dto;

import lombok.Data;
import nicolai.ashirov.shop.enums.OrderStatus;

import java.time.LocalDateTime;

@Data
public class OrderDto {
    private LocalDateTime orderPlacedAt;
    private OrderStatus orderStatus;
}
