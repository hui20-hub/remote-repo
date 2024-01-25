package github.com.tang.service;

import github.com.tang.dto.UserLoginDTO;
import github.com.tang.entity.User;

/**
 * @Title: UserService
 * @Author hui20-hub
 * @Package github.com.tang.service
 * @Date 2024/1/19 19:32
 */


public interface UserService {

    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
