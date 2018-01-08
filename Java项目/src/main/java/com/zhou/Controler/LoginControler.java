package com.zhou.Controler;

import com.zhou.Mapper.UserMapper;
import com.zhou.Service.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by zhoumeineng on 2018/1/2.
 */


@Controller
@RequestMapping(value = "/loginService",method = RequestMethod.GET)
@ResponseBody
public class LoginControler {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/login")
    public String login(HttpServletRequest request){
        return "succed";
    }


    @RequestMapping("/selecteuser")
    public String selecte(@Param("user_qq")String user_qq){
        System.out.printf(user_qq);
        String user = userMapper.selectedUser(user_qq);
       return user;
    }

    @RequestMapping("/insertuser")
    public String insert(@Param("user_qq")String user_qq,@Param("gno")int gno,@Param("gname")String gname){
        User user = new User(user_qq, gname, gno);
        userMapper.InsertUserInformation(user);
        return "succed";
    }


}
