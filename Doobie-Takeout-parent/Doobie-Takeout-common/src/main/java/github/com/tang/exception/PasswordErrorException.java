package github.com.tang.exception;

/**
 * @msg: 密码错误异常
 * @Title: PasswordErrorException
 * @Author hui20-hub
 * @Package github.com.tang.exception
 * @Date 2024/1/15 15:58
 */


public class PasswordErrorException extends BaseException {

    public PasswordErrorException() {
    }

    public PasswordErrorException(String msg) {
        super(msg);
    }

}
