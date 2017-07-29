package cn.g_open.xiaoxiaole.controller.login;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.g_open.xiaoxiaole.domainModel.LoginUser;

@RestController
@RequestMapping("/login")
public class LoginController
{   
    @RequestMapping("/in")
    public Map<String, String> login(String username, String password, HttpSession session){
        Map<String, String> map = new HashMap<String, String>();
        if(StringUtils.equalsIgnoreCase(username, "admin") && StringUtils.equalsIgnoreCase(password, "123456")){
            LoginUser user = new LoginUser();
            user.setUsername(username);
            user.setPassword(password);
            session.setAttribute("loginUser", user);
            map.put("msg", "验证成功");
            map.put("flag", "Y");
        }else {
            map.put("msg", "用户名/密码错误");
            map.put("flag", "N");
        }
        return map;
    }
    
    
}
