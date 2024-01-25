package github.com.tang.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Title: EmployeeLoginVO
 * @Author hui20-hub
 * @Package github.com.tang.vo
 * @Date 2024/1/15 16:28
 */


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "员工登录返回的数据格式")
public class EmployeeLoginVO implements Serializable {

    @Schema(defaultValue = "主键值")
    private Long id;

    @Schema(defaultValue = "用户名")
    private String userName;

    @Schema(defaultValue = "姓名")
    private String name;

    @Schema(defaultValue = "jwt令牌")
    private String token;

}

