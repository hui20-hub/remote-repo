package com.tang.controller;

import com.tang.model.AuthenticationRequest;
import com.tang.model.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * @Title: LoginController
 * @Author hui20-hub
 * @Package com.tang.controller
 * @Date 2023/12/24 12:15
 */

@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginController {
    @Autowired
    private RedisTemplate redisTemplate;
    @PostMapping
    public ResponseResult login(@RequestBody AuthenticationRequest request){
        String username= request.getUsername();
        String password = request.getPassword();
        String captcha = request.getCaptcha();
        Object code = redisTemplate.opsForValue().get("code");
        if (Objects.isNull(code)){
            throw new RuntimeException("验证码过期或未生成");
        }
        if (username.equals("admin")&&password.equals("admin")&&captcha.equalsIgnoreCase(code.toString())){
            return new ResponseResult(200,"登陆成功",null);
        }else {
            return new ResponseResult(500,"登陆失败",null);

        }
    }

}
