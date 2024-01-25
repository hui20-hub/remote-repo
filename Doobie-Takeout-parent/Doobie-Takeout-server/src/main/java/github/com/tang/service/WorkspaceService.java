package github.com.tang.service;

import github.com.tang.vo.BusinessDataVO;
import github.com.tang.vo.DishOverViewVO;
import github.com.tang.vo.OrderOverViewVO;
import github.com.tang.vo.SetmealOverViewVO;

import java.time.LocalDateTime;

/**
 * @Title: WorkspaceService
 * @Author hui20-hub
 * @Package github.com.tang.service
 * @Date 2024/1/19 19:33
 */


public interface WorkspaceService {

    /**
     * 根据时间段统计营业数据
     * @param begin
     * @param end
     * @return
     */
    BusinessDataVO getBusinessData(LocalDateTime begin, LocalDateTime end);

    /**
     * 查询订单管理数据
     * @return
     */
    OrderOverViewVO getOrderOverView();

    /**
     * 查询菜品总览
     * @return
     */
    DishOverViewVO getDishOverView();

    /**
     * 查询套餐总览
     * @return
     */
    SetmealOverViewVO getSetmealOverView();

}
