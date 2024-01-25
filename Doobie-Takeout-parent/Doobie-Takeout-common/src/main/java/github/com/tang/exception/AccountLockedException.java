package github.com.tang.exception;

/**
 * @msg: 账号被锁定异常
 * @Title: AccountLockedException
 * @Author hui20-hub
 * @Package github.com.tang.exception
 * @Date 2024/1/15 15:37
 */


public class AccountLockedException extends BaseException {

    public AccountLockedException() {
    }

    public AccountLockedException(String msg) {
        super(msg);
    }

}
