package com.ding.resource.controller.happiness;

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
public class HappinessController extends BaseController {

    @RequestMapping("/fellHappiness")
    public String fellMemory(){
        log.info("进入happiness控制器");
        return "/happiness/happiness";
    }
}
