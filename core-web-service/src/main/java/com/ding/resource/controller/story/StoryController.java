package com.ding.resource.controller.story;

import com.ding.resource.controller.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: manager
 * @description: 故事类
 * @author: DingCong
 * @create: 2018-12-07 15:39
 **/
@Slf4j
@Controller
public class StoryController extends BaseController{

    @RequestMapping("/fellStory")
    public String fellStory(){
        log.info("进入story控制器");
        return "/story/story";
    }


}
