package com.wpz.system.modules.demo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wpz.system.modules.demo.pojo.User;

@Mapper
public interface UserDao {

//	@Select("select * from user where id = #{id}")
	public User selectById(@Param("id") String id);
	
//	@Select("select * from user")
	public List<Map> selectUserList();

}