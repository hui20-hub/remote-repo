package github.com.tang.service;

import github.com.tang.dto.CategoryDTO;
import github.com.tang.dto.CategoryPageQueryDTO;
import github.com.tang.entity.Category;
import github.com.tang.result.PageResult;

import java.util.List;

/**
 * @Title: CategoryService
 * @Author hui20-hub
 * @Package github.com.tang.service
 * @Date 2024/1/19 19:29
 */


public interface CategoryService {

    /**
     * 新增分类
     * @param categoryDTO
     */
    void save(CategoryDTO categoryDTO);

    /**
     * 分页查询
     * @param categoryPageQueryDTO
     * @return
     */
    PageResult pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);

    /**
     * 根据id删除分类
     * @param id
     */
    void deleteById(Long id);

    /**
     * 修改分类
     * @param categoryDTO
     */
    void update(CategoryDTO categoryDTO);

    /**
     * 启用、禁用分类
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);

    /**
     * 根据类型查询分类
     * @param type
     * @return
     */
    List<Category> list(Integer type);
}

