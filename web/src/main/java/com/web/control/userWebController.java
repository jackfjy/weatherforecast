package com.web.control;

import com.web.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shenjiang
 * @Description:
 * @Date: 2019/3/25 00:31
 */
@RestController
public class userWebController {

    @Autowired
    private userService userservice;

    @RequestMapping("/getUserById/{id}")
    public String getUserById(@PathVariable String id){

        return userservice.getUserById(Long.parseLong(id)).getName();
    }

}
