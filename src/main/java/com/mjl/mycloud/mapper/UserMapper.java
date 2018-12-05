package com.mjl.mycloud.mapper;

import com.mjl.mycloud.dto.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

/**
 * Created by Miaojiale on 2018/12/4.
 */
@Component
public interface UserMapper {
    @Insert("INSERT INTO user(uuid,userName,password,role,section,createTime) VALUES((SELECT UUID()),#{userName}, #{password}, #{role}, #{section}, (SELECT NOW()))")
    void insert(User user);

    @Update("update user set userName=#{userName},password=#{password},role=#{role},section=#{section},updateTime=((SELECT NOW())) where uuid = #{uuid}")
    void update(User user);

    @Select("select * from user where userName = #{name}")
    User selectByName(String name);
}
