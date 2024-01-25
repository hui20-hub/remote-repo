package github.com.tang.exception;

/**
 * @msg: 账号不存在异常
 * @Title: AccountNotFoundException
 * @Author hui20-hub
 * @Package github.com.tang.exception
 * @Date 2024/1/15 15:53
 */


public class AccountNotFoundException extends BaseException {

    public AccountNotFoundException() {
    }

    public AccountNotFoundException(String msg) {
        super(msg);
    }

}
