package github.com.tang.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @msg: 封装分页查询结果
 * @Title: PageResult
 * @Author hui20-hub
 * @Package github.com.tang.result
 * @Date 2024/1/15 16:05
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResult implements Serializable {

    private long total; //总记录数

    private List records; //当前页数据集合

}
