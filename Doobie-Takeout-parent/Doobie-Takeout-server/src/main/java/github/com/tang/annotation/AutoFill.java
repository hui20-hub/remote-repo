package github.com.tang.annotation;

import github.com.tang.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @msg: 自定义注解，用于标识某个方法需要进行功能字段自动填充处理
 * @Title: AutoFill
 * @Author hui20-hub
 * @Package github.com.tang.annotation
 * @Date 2024/1/19 14:51
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    //数据库操作类型：UPDATE INSERT
    OperationType value();
}



