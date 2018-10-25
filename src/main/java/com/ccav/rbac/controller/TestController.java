package com.ccav.rbac.controller;

import com.ccav.rbac.common.ServerResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
@Slf4j
public class TestController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse<String> test(){
        log.info("================日志测试成功================");
        return ServerResponse.createBySuccessMessage("========环境搭建成功========");
    }


}
