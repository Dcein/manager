package com.ding.resource.controller.memory;

import com.ding.resource.controller.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: manager
 * @description: 回忆类
 * @author: DingCong
 * @create: 2018-12-07 15:57
 **/
@Slf4j
@Controller
public class MemoryController extends BaseController {

    @RequestMapping("/fellMemory")
    public String fellMemory(){
        log.info("进入memory控制器");
        return "/memory/memory";
    }
}
