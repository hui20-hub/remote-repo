package github.com.tang.exception;

/**
 * @msg: 业务异常
 * @Title: BaseException
 * @Author hui20-hub
 * @Package github.com.tang.exception
 * @Date 2024/1/15 15:55
 */


public class BaseException extends RuntimeException {

    public BaseException() {
    }

    public BaseException(String msg) {
        super(msg);
    }

}
