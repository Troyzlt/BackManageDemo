package com.troyz.backManage.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("test111")
    public String test(){
        return "HELLOWORLD";
    }
}
