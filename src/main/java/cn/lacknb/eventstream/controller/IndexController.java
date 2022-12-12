package cn.lacknb.eventstream.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <h2>  </h2>
 *
 * @description:
 * @menu
 * @author: gitsilence
 * @description:
 * @date: 2022/12/13 00:24
 **/
@Controller
public class IndexController {

    @RequestMapping(value = {"/", "index"})
    public String index() {
        return "sse";
    }

}
