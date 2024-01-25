package github.com.tang.exception;

/**
 * @msg: 密码修改失败异常
 * @Title: PasswordEditFailedException
 * @Author hui20-hub
 * @Package github.com.tang.exception
 * @Date 2024/1/15 15:57
 */


public class PasswordEditFailedException extends BaseException{

    public PasswordEditFailedException(String msg){
        super(msg);
    }

}
