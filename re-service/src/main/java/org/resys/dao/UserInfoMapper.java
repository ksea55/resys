package org.resys.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.resys.model.UserInfo;
@Mapper
public interface UserInfoMapper {

    UserInfo findUserInfoById(@Param("id") String id);

}
