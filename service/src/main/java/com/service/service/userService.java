package com.service.service;


import com.weatherforecast.entity.entity.user;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author shenjiang
 * @Description:
 * @Date: 2019/3/25 00:16
 */
@FeignClient(value = "dao",fallbackFactory = userHystrixService.class)
public interface userService {

    @RequestMapping("/findAll")
    public List<user> findAll();

    @RequestMapping("/findUser/")
    public user findUser(@RequestParam("id") Long id);

    @RequestMapping("/insertUser")
    public int insertUser(user uss);
}
