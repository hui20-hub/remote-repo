package github.com.tang.exception;

/**
 * @msg: 登录失败
 * @Title: LoginFailedException
 * @Author hui20-hub
 * @Package github.com.tang.exception
 * @Date 2024/1/15 15:56
 */


public class LoginFailedException extends BaseException{
    public LoginFailedException(String msg){
        super(msg);
    }
}
