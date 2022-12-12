package cn.lacknb.eventstream.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * <h2>  </h2>
 *
 * @description:
 * @menu
 * @author: gitsilence
 * @description:
 * @date: 2022/12/13 00:12
 **/
@RestController
@RequestMapping("/test")
public class EventStreamController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello spring boot !";
    }

    @RequestMapping(value = "/sse", produces = "text/event-stream;charset=UTF-8")
    public String sse() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long round = Math.round(Math.random() * 100);
        // 设置重新发起连接的时间间隔 前面的数据用\n结尾
        String retry = "retry: 10000\n";
        // 固定格式，data可以自定义，后面要有两个换行结尾
        return retry + "data:还有" + round + "秒钟到达战场！\n\n";
    }

}
