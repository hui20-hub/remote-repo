package github.com.tang.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Title: EmployeePageQueryDTO
 * @Author hui20-hub
 * @Package github.com.tang.dto
 * @Date 2024/1/15 16:40
 */


@Data
public class EmployeePageQueryDTO implements Serializable {

    //员工姓名
    private String name;

    //页码
    private int page;

    //每页显示记录数
    private int pageSize;

}