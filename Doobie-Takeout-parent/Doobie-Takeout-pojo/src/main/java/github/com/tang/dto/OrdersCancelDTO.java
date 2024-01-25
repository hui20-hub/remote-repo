package github.com.tang.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Title: OrdersCancelDTO
 * @Author hui20-hub
 * @Package github.com.tang.dto
 * @Date 2024/1/15 16:41
 */


@Data
public class OrdersCancelDTO implements Serializable {

    private Long id;
    //订单取消原因
    private String cancelReason;

}
