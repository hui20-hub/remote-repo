package github.com.tang.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @msg: C端用户登录
 * @Title: UserLoginDTO
 * @Author hui20-hub
 * @Package github.com.tang.dto
 * @Date 2024/1/15 16:45
 */


@Data
public class UserLoginDTO implements Serializable {

    private String code;

}
