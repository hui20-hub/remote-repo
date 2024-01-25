package github.com.tang.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Title: EmployeeDTO
 * @Author hui20-hub
 * @Package github.com.tang.dto
 * @Date 2024/1/15 16:39
 */


@Data
public class EmployeeDTO implements Serializable {

    private Long id;

    private String username;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;

}