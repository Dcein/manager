package com.ding.resource.controller.traveling;

import com.ding.resource.controller.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: manager
 * @description: 旅行类
 * @author: DingCong
 * @create: 2018-12-07 15:39
 **/
@Slf4j
@Controller
public class TravelingController extends BaseController{


    @RequestMapping("/fellTravel")
    public String fellTravel(){
        log.info("进入travel控制器");
        return "/traveling/travel";
    }


}
