package cn.g_open.xiaoxiaole.domainModel;

import java.util.ArrayList;
import java.util.List;

public class LoginUser
{
    // 客户登入
    private String username;
    private String password;
    private String clientIp;
    private boolean failure;

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getClientIp()
    {
        return clientIp;
    }

    public void setClientIp(String clientIp)
    {
        this.clientIp = clientIp;
    }

    public boolean isFailure()
    {
        return failure;
    }

    public void setFailure(boolean failure)
    {
        this.failure = failure;
    }

    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; true; i++)
        {
            list.add(i);
        }
    }

}
