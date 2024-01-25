package github.com.tang.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Title: PasswordEditDTO
 * @Author hui20-hub
 * @Package github.com.tang.dto
 * @Date 2024/1/15 16:43
 */


@Data
public class PasswordEditDTO implements Serializable {

    //员工id
    private Long empId;

    //旧密码
    private String oldPassword;

    //新密码
    private String newPassword;

}
