package github.com.tang;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Title: DoobieApplication
 * @Author hui20-hub
 * @Package github.com.tang
 * @Date 2024/1/15 17:09
 */

@SpringBootApplication
@EnableTransactionManagement //开启注解方式的事务管理
@Slf4j
@EnableCaching//开发缓存注解功能
@EnableScheduling //开启任务调度
@EnableEncryptableProperties
public class DoobieApplication {
    public static void main(String[] args) {
        SpringApplication.run(DoobieApplication.class, args);
        log.info("server started");
    }
}
