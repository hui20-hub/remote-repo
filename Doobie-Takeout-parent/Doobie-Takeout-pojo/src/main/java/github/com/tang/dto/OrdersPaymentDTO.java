package github.com.tang.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Title: OrdersPaymentDTO
 * @Author hui20-hub
 * @Package github.com.tang.dto
 * @Date 2024/1/15 16:42
 */


@Data
public class OrdersPaymentDTO implements Serializable {
    //订单号
    private String orderNumber;

    //付款方式
    private Integer payMethod;

}
