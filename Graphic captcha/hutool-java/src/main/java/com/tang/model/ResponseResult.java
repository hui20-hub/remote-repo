package com.tang.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Title: ResponseResult
 * @Author hui20-hub
 * @Package com.tang.model
 * @Date 2023/12/23 19:01
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult<T> implements Serializable {
private Integer code;
private String msg;
private T data;
}
