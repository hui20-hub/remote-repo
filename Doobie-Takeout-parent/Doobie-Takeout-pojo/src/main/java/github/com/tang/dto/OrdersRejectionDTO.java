package github.com.tang.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Title: OrdersRejectionDTO
 * @Author hui20-hub
 * @Package github.com.tang.dto
 * @Date 2024/1/15 16:43
 */


@Data
public class OrdersRejectionDTO implements Serializable {

    private Long id;

    //订单拒绝原因
    private String rejectionReason;

}
