package cn.g_open.xiaoxiaole.controller.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController
{
    @RequestMapping("/testLogin")
    public String testLogin(){
        return "看到说明你登入成功了!";
    }
}
