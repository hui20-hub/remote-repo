package github.com.tang.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @msg: 菜品总览
 * @Title: DishOverViewVO
 * @Author hui20-hub
 * @Package github.com.tang.vo
 * @Date 2024/1/15 16:29
 */


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DishOverViewVO implements Serializable {
    // 已启售数量
    private Integer sold;

    // 已停售数量
    private Integer discontinued;
}