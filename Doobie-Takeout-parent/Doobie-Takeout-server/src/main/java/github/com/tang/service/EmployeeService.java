package github.com.tang.service;

import github.com.tang.dto.EmployeeDTO;
import github.com.tang.dto.EmployeeLoginDTO;
import github.com.tang.dto.EmployeePageQueryDTO;
import github.com.tang.entity.Employee;
import github.com.tang.result.PageResult;

/**
 * @msg: 员工登录
 * @Title: EmployeeService
 * @Author hui20-hub
 * @Package github.com.tang.service
 * @Date 2024/1/15 17:04
 */


public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     * @param employeeDTO
     */
    void save(EmployeeDTO employeeDTO);

    /**
     * 分页查询
     * @param employeePageQueryDTO
     * @return
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 启用禁用员工账号
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);

    /**
     * 根据id查询员工
     * @param id
     * @return
     */
    Employee getById(Long id);

    /**
     * 编辑员工信息
     * @param employeeDTO
     */
    void update(EmployeeDTO employeeDTO);
}
