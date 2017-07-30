package cn.g_open.xiaoxiaole.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.g_open.xiaoxiaole.biz.UserInfoBiz;
import cn.g_open.xiaoxiaole.db.mapper.UserInfoMapper;
import cn.g_open.xiaoxiaole.db.model.UserInfo;
import cn.g_open.xiaoxiaole.db.model.UserInfoExample;
import cn.g_open.xiaoxiaole.db.model.UserInfoExample.Criteria;

@Service
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
        int count = userInfoMapper.countByExample(example);
        return count;
    }

    @Override
    public int queryUserByUsername(String username)
    {
        UserInfoExample example = new UserInfoExample();
        Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        int count = userInfoMapper.countByExample(example);
        return count;
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
