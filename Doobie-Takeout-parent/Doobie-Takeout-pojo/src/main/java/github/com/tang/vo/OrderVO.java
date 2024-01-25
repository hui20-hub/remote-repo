package github.com.tang.vo;

import github.com.tang.entity.OrderDetail;
import github.com.tang.entity.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Title: OrderVO
 * @Author hui20-hub
 * @Package github.com.tang.vo
 * @Date 2024/1/15 16:26
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderVO extends Orders implements Serializable {

    //订单菜品信息
    private String orderDishes;

    //订单详情
    private List<OrderDetail> orderDetailList;

}