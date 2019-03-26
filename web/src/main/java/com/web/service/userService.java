package com.web.service;


import com.weatherforecast.entity.entity.user;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author shenjiang
 * @Description:
 * @Date: 2019/3/25 00:32
 */
@FeignClient("service")
public interface userService {

    @RequestMapping("/getUserById")
    public user getUserById(@RequestParam("id") Long id);
}
