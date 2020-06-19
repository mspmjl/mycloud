package com.mjl.mycloud.mapper;

import com.mjl.mycloud.dto.MPRReporting;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Miaojiale on 2018/12/4.
 */
@Component
public interface ReportingMapper {
    @Insert("INSERT INTO USER(uuid,userName,password,role,section,createTime) VALUES((SELECT UUID()),#{userName}, #{password}, #{role}, #{section}, (SELECT NOW()))")
    void insert(MPRReporting reporting);

    @Update("update USER set userName=#{userName},password=#{password},role=#{role},section=#{section},updateTime=((SELECT NOW())) where uuid = #{uuid}")
    void update(MPRReporting reporting);

    MPRReporting getById(String id);

    @Select("select * from mpr_reporting where app_status = '1'")
    List<MPRReporting> selectByStatus();
}
