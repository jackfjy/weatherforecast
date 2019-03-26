package com.service.control;

import com.example.Test324Service.entity.user;
import com.example.Test324Service.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shenjiang
 * @Description:
 * @Date: 2019/3/25 00:28
 */
@RestController
public class userServiceController {

    @Autowired
    private userService userservice;

    @RequestMapping("/getUserById")
    public user getUserById(@RequestParam("id") Long id){
        user us = userservice.findUser(id);
        us.setName(us.getName()+"1111");
        System.err.println("service Name 的值是："+us.getName());
        return us;
    }

}
