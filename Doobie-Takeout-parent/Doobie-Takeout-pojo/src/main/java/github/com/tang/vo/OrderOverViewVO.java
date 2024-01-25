package github.com.tang.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @msg: 订单概览数据
 * @Title: OrderOverViewVO
 * @Author hui20-hub
 * @Package github.com.tang.vo
 * @Date 2024/1/15 16:27
 */


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderOverViewVO implements Serializable {
    //待接单数量
    private Integer waitingOrders;

    //待派送数量
    private Integer deliveredOrders;

    //已完成数量
    private Integer completedOrders;

    //已取消数量
    private Integer cancelledOrders;

    //全部订单
    private Integer allOrders;
}
