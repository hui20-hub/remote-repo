package github.com.tang.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Title: CategoryDTO
 * @Author hui20-hub
 * @Package github.com.tang.dto
 * @Date 2024/1/15 16:15
 */


@Data
public class CategoryDTO implements Serializable {

    //主键
    private Long id;

    //类型 1 菜品分类 2 套餐分类
    private Integer type;

    //分类名称
    private String name;

    //排序
    private Integer sort;

}
