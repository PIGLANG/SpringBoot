package com.zhou.Mapper;

import com.zhou.Service.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zhoumeineng on 2018/1/4.
 */

@Mapper
public interface UserMapper {
    public String selectedUser(@Param("user_qq") String user_qq);

    public void InsertUserInformation(User user);
}
