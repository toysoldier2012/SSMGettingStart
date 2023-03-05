package com.xiaoyu.mybatis.mapper;

import com.xiaoyu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserMapper {

//	insert
	int insertUser();
	void insertUserByUser(User user);

//	update
	void updateUser();

//	delete
	void deleteUser();

//	select
	User selectUserById(int id);

	List<User> selectUsers();

	Map<String, Object> getUserByIdToMap(@Param("id") int id);

	List<Map<String, Object>> getAllUserToMap();

	@MapKey("id")
	Map<String, Object> getUserToMapWithMapKey();

	List<Map<String, Object>> getUsersByName(@Param("username") String userName);

//	check
	User checkLogin(String username, String password);

	User checkLoginByMap(Map<String, Object> map);

	int checkLoginByParam(@Param("username") String username, @Param("password") String password);

}
