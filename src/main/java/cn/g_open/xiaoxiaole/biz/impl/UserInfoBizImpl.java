package cn.g_open.xiaoxiaole.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.g_open.xiaoxiaole.biz.UserInfoBiz;
import cn.g_open.xiaoxiaole.db.mapper.UserInfoMapper;
import cn.g_open.xiaoxiaole.db.model.UserInfo;
import cn.g_open.xiaoxiaole.db.model.UserInfoExample;
import cn.g_open.xiaoxiaole.db.model.UserInfoExample.Criteria;

public class UserInfoBizImpl implements UserInfoBiz
{

    @Autowired
    private UserInfoMapper userInfoMapper;
    
    @Override
    public int queryUserByUsernameAndPassword(String username, String password)
    {
        UserInfoExample example = new UserInfoExample();
        Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(password);
        List<UserInfo> list = userInfoMapper.selectByExample(example);
        if(list != null){
            return list.size();
        }
        return 0;
    }

    @Override
    public int queryUserByUsername(String username)
    {
        UserInfoExample example = new UserInfoExample();
        Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<UserInfo> list = userInfoMapper.selectByExample(example);
        if(list != null){
            return list.size();
        }
        return 0;
    }

    @Override
    public boolean saveUserInfo(UserInfo userInfo)
    {
        int i = userInfoMapper.insert(userInfo);
        if(i == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean deleteUserInfoByUsername(String username)
    {
        UserInfoExample example = new UserInfoExample();
        Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        int i = userInfoMapper.deleteByExample(example);
        if(i == 1){
            return true;
        }else {
            return false;
        }
    }

}
