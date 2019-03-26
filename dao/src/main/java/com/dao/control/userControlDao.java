package com.dao.control;


import com.dao.MapperDao.userMapper;
import com.weatherforecast.entity.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shenjiang
 * @Description:
 * @Date: 2019/3/25 00:05
 */
@RestController
public class userControlDao {

    @Autowired
    private userMapper usermapper;

    @RequestMapping("/findAll")
    public List<user> findAll(){
        return usermapper.findAll();
    }

    @RequestMapping("/findUser")
    public user findUser(@RequestParam Long id){
        user us = usermapper.findUser(id);
        return us;
    }

    @RequestMapping("/insertUser/{us}")
    public int insertUser(@RequestParam user us){
        return usermapper.insertUser(us);
    }

}
