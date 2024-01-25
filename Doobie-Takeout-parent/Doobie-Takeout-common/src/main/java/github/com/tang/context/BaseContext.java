package github.com.tang.context;

/**
 * @Title: BaseContext
 * @Author hui20-hub
 * @Package github.com.tang.context
 * @Date 2024/1/15 15:34
 */


public class BaseContext {

    public static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    public static Long getCurrentId() {
        return threadLocal.get();
    }

    public static void removeCurrentId() {
        threadLocal.remove();
    }

}
