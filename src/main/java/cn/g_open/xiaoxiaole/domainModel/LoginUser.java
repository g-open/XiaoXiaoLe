package cn.g_open.xiaoxiaole.domainModel;

import java.util.ArrayList;
import java.util.List;

public class LoginUser
{
    // 客户登入
    private String clientIp;
    private boolean failure;

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
