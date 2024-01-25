package github.com.tang.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @msg: 自定义定时任务类
 * @Title: MyTask
 * @Author hui20-hub
 * @Package github.com.tang.task
 * @Date 2024/1/19 15:13
 */


@Component
@Slf4j
public class MyTask {

    /**
     * 定时任务 每隔5秒触发一次
     */
    //@Scheduled(cron = "0/5 * * * * ?")
    public void executeTask(){
        log.info("定时任务开始执行：{}", new Date());
    }

}
