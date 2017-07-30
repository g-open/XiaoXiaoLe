package cn.g_open.xiaoxiaole.biz;

import cn.g_open.xiaoxiaole.db.model.UserInfo;

public interface UserInfoBiz
{
    public int queryUserByUsernameAndPassword(String username, String password);
    
    public int queryUserByUsername(String username);
    
    public boolean saveUserInfo(UserInfo userInfo);
    
    public boolean deleteUserInfoByUsername(String username);
}
