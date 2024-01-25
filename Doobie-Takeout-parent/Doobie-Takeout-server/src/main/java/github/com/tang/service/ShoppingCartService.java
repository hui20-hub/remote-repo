package github.com.tang.service;

import github.com.tang.dto.ShoppingCartDTO;
import github.com.tang.entity.ShoppingCart;

import java.util.List;

/**
 * @Title: ShoppingCartService
 * @Author hui20-hub
 * @Package github.com.tang.service
 * @Date 2024/1/19 19:32
 */


public interface ShoppingCartService {

    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);

    /**
     * 查看购物车
     * @return
     */
    List<ShoppingCart> showShoppingCart();

    /**
     * 清空购物车
     */
    void cleanShoppingCart();

    /**
     * 删除购物车中一个商品
     * @param shoppingCartDTO
     */
    void subShoppingCart(ShoppingCartDTO shoppingCartDTO);
}

