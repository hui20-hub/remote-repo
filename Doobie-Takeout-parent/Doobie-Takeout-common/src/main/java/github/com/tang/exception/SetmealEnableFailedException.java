package github.com.tang.exception;

/**
 * @msg: 套餐启用失败异常
 * @Title: SetmealEnableFailedException
 * @Author hui20-hub
 * @Package github.com.tang.exception
 * @Date 2024/1/15 15:59
 */


public class SetmealEnableFailedException extends BaseException {

    public SetmealEnableFailedException(){}

    public SetmealEnableFailedException(String msg){
        super(msg);
    }
}
