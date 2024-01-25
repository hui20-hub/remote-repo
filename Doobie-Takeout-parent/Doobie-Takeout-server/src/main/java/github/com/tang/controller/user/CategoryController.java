package github.com.tang.controller.user;

import github.com.tang.entity.Category;
import github.com.tang.result.Result;
import github.com.tang.service.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Title: CategoryController
 * @Author hui20-hub
 * @Package github.com.tang.controller.user
 * @Date 2024/1/19 18:56
 */


@RestController("userCategoryController")
@RequestMapping("/user/category")
@Tag(name = "C端-分类接口")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 查询分类
     * @param type
     * @return
     */
    @GetMapping("/list")
    @Operation(summary = "查询分类")
    public Result<List<Category>> list(Integer type) {
        List<Category> list = categoryService.list(type);
        return Result.success(list);
    }
}