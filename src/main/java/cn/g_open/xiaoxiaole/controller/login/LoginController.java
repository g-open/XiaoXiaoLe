package cn.g_open.xiaoxiaole.controller.login;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController
{   
    @RequestMapping("/in")
    public Map<String, String> login(String username, String password){
        Map<String, String> map = new HashMap<String, String>();
        map.put("username", username);
        map.put("password", password);
        return map;
    }
    
    
}
