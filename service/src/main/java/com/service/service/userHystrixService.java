package com.service.service;


import com.weatherforecast.entity.entity.user;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shenjiang
 * @Description:
 * @Date: 2019/3/26 09:45
 */
@Component
public class userHystrixService implements userService {
    @Override
    public List<user> findAll() {
        List<user> list = new ArrayList<user>();
        user us = new user();
        us.setName("网嘿嘿");
        us.setUsername("李呵呵");
        list.add(us);

        user us1 = new user();
        us1.setName("网嘿嘿");
        us1.setUsername("李呵呵");
        list.add(us1);

        return list;
    }

    @Override
    public user findUser(Long id) {
        user us = new user();
        us.setName("查询错误");
        us.setUsername("查询错误");
        return us;
    }

    @Override
    public int insertUser(user uss) {
        return 0;
    }
}
