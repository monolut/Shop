package nicolai.ashirov.shop.dto;

import lombok.Data;

@Data
public class AutheticationRequest {
    private String email;
    private String password;
}
