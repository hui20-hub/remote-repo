package github.com.tang.result;

import lombok.Data;

import java.io.Serializable;

/**
 * @msg: 后端统一返回结果
 * @param <T>
 * @Title: Result
 * @Author hui20-hub
 * @Package github.com.tang.result
 * @Date 2024/1/15 16:06
 */


@Data
public class Result<T> implements Serializable {

    private Integer code; //编码：1成功，0和其它数字为失败
    private String msg; //错误信息
    private T data; //数据

    public static <T> Result<T> success() {
        Result<T> result = new Result<T>();
        result.code = 1;
        return result;
    }

    public static <T> Result<T> success(T object) {
        Result<T> result = new Result<T>();
        result.data = object;
        result.code = 1;
        return result;
    }

    public static <T> Result<T> error(String msg) {
        Result result = new Result();
        result.msg = msg;
        result.code = 0;
        return result;
    }

}
