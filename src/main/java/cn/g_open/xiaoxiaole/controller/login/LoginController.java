package cn.g_open.xiaoxiaole.controller.login;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.g_open.xiaoxiaole.biz.UserInfoBiz;
import cn.g_open.xiaoxiaole.db.model.UserInfo;
import cn.g_open.xiaoxiaole.domainModel.BaseResModel;
import cn.g_open.xiaoxiaole.domainModel.LoginUser;

@RestController
@RequestMapping("/login")
public class LoginController
{
    @Autowired
    private UserInfoBiz userInfoBiz;

    @RequestMapping("/in")
    public BaseResModel login(String username, String password, HttpSession session)
    {
        if (session.getAttribute("loginUser") != null)
        {
            session.removeAttribute("loginUser");
        }
        int userCount = userInfoBiz.queryUserByUsernameAndPassword(username, password);
        BaseResModel baseResModel = new BaseResModel();
        if (userCount == 1)
        {
            LoginUser user = new LoginUser();
            user.setUsername(username);
            user.setPassword(password);
            session.setAttribute("loginUser", user);
            baseResModel.setFlag(true);
            baseResModel.setMsg("验证成功!");
        }
        else
        {
            baseResModel.setFlag(false);
            baseResModel.setMsg("用户名/密码错误!");
        }
        return baseResModel;
    }

    @RequestMapping("/save")
    public BaseResModel saveUserInfo(String username, String password)
    {
        BaseResModel baseResModel = new BaseResModel();
        int userCount = userInfoBiz.queryUserByUsername(username);
        if (userCount != 0)
        {
            baseResModel.setFlag(false);
            baseResModel.setMsg("此用户名已被使用,请换个用户名再试!");
        }
        else
        {
            UserInfo userInfo = new UserInfo();
            userInfo.setUsername(username);
            userInfo.setPassword(password);
            userInfo.setCreateBy("admin");
            userInfo.setCreateDate(new Date());
            userInfo.setModifyBy("admin");
            userInfo.setCreateDate(new Date());
            boolean flag = userInfoBiz.saveUserInfo(userInfo);
            if(flag){
                baseResModel.setFlag(true);
                baseResModel.setMsg("注册成功!");
            }else{
                baseResModel.setFlag(false);
                baseResModel.setMsg("系统繁忙,注册失败!");
            }
        }
        return baseResModel;
    }
    
    @RequestMapping("/delete")
    public BaseResModel deleteUserInfByUsername(String username){
        BaseResModel baseResModel = new BaseResModel();
        boolean flag = userInfoBiz.deleteUserInfoByUsername(username);
        if(flag){
            baseResModel.setFlag(true);
            baseResModel.setMsg("删除成功!");
        }else{
            baseResModel.setFlag(false);
            baseResModel.setMsg("系统繁忙,删除失败!");
        }
        return baseResModel;
    }
}
