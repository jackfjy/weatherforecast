package com.dao.MapperDao;


import com.weatherforecast.entity.entity.user;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author shenjiang
 * @Description:
 * @Date: 2019/3/24 23:37
 */
@Mapper
public interface userMapper {

    @Select("select * from user")
    public List<user> findAll();

    @Select("select * from user where id = #{id}")
    public user findUser(@Param("id") Long id);

    @Insert("insert into user values(#{id},#{age},#{balance},#{name},#{username})")
    public int insertUser(user uss);

}
