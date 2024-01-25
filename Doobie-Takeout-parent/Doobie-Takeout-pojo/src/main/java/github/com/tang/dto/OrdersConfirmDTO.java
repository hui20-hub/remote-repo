package github.com.tang.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Title: OrdersConfirmDTO
 * @Author hui20-hub
 * @Package github.com.tang.dto
 * @Date 2024/1/15 16:41
 */


@Data
public class OrdersConfirmDTO implements Serializable {

    private Long id;
    //订单状态 1待付款 2待接单 3 已接单 4 派送中 5 已完成 6 已取消 7 退款
    private Integer status;

}
