package com.cry.mapper;

import com.cry.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
	@Select("SELECT * FROM  sysconf")
	public List<UserEntity> findUser();

	@Select("insert into sysconf values (#{id}, #{sys_value}, #{sys_key}, #{delete_flag}); ")
	public List<UserEntity> insertUser(@Param("id") String id,
									   @Param("sys_value") String sys_value,
									   @Param("sys_key") String sys_key,
									   @Param("delete_flag") String delete_flag);
}
