package com.ding.resource.controller.life;

import com.ding.resource.controller.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: manager
 * @description: 生活类
 * @author: DingCong
 * @create: 2018-12-07 16:08
 **/
@Slf4j
@Controller
public class LifeController extends BaseController {

    @RequestMapping("/fellLife")
    public String fellMemory(){
        log.info("进入life控制器");
        return "/life/life";
    }

}
