package com.tang.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Title: AuthenticationRequest
 * @Author hui20-hub
 * @Package com.tang
 * @Date 2023/12/23 18:49
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest implements Serializable {
    private String username;
    private String password;
    private String captcha;

}
