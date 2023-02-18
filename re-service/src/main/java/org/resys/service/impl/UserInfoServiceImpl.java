package org.resys.service.impl;

import jakarta.annotation.Resource;
import org.resys.dao.UserInfoMapper;
import org.resys.model.UserInfo;
import org.resys.service.UserInfoService;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserInfoById(String id) {
        return userInfoMapper.findUserInfoById(id);
    }
}
