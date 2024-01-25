package com.tang.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import com.tang.model.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Title: CaptchaController
 * @Author hui20-hub
 * @Package com.tang.controller
 * @Date 2023/12/24 11:18
 */

@RestController
@RequestMapping("/cap")
@CrossOrigin
public class CaptchaController {
    @Autowired
    private RedisTemplate redisTemplate;
    @GetMapping
    public ResponseResult getCaptcha(){
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(100, 50, 5, 10);
        String code = lineCaptcha.getCode();
        redisTemplate.opsForValue().set("code",code);
        redisTemplate.expire("code",30, TimeUnit.SECONDS);
        String imageBase64Data = lineCaptcha.getImageBase64Data();
        return new ResponseResult(200,"success",imageBase64Data);
    }
}
