package github.com.tang.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Title: ShoppingCartDTO
 * @Author hui20-hub
 * @Package github.com.tang.dto
 * @Date 2024/1/15 16:44
 */


@Data
public class ShoppingCartDTO implements Serializable {

    private Long dishId;
    private Long setmealId;
    private String dishFlavor;

}
