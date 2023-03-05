package com.xiaoyu.mybatis;

import com.xiaoyu.mybatis.mapper.UserMapper;
import com.xiaoyu.mybatis.pojo.User;
import com.xiaoyu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

public class UserTest {
	@Test
	public void testInsert() throws IOException {
		InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
		SqlSession sqlSession = build.openSession(true);
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		int res = userMapper.insertUser();
		System.out.println(res);
		sqlSession.close();
	}

	@Test
	public void testInsertByUser() {
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);

		User user = new User(null, "xiaoyu", "123456sdfsd78", 33, "m", "adsfafdsa@gmail.com");
		mapper.insertUserByUser(user);
		System.out.println(user);

		SqlSessionUtil.closeSqlSession();
	}

	@Test
	public void testUpdate() {
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		mapper.updateUser();
		SqlSessionUtil.closeSqlSession();
	}

	@Test
	public void testDelete() {
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		mapper.deleteUser();
		SqlSessionUtil.closeSqlSession();
	}

	@Test
	public void testSelectUserById() {
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		User user = mapper.selectUserById(3);
		System.out.println(user.toString());
		SqlSessionUtil.closeSqlSession();
	}

	@Test
	public void testSelectUsers() {
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		List<User> user = mapper.selectUsers();
		user.forEach(System.out::println);
		SqlSessionUtil.closeSqlSession();
	}

	@Test
	public void testGetUserByIdToMap() {
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);

		Map<String, Object> userMap = mapper.getUserByIdToMap(3);
		userMap.entrySet().forEach(System.out::println);
		System.out.println(userMap);

		SqlSessionUtil.closeSqlSession();
	}

	@Test
	public void testGetAllUserToMap() {
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);

		List<Map<String, Object>> allUsers = mapper.getAllUserToMap();

		allUsers.stream().forEach(map -> {
			map.entrySet().forEach(set -> System.out.println(set.getKey() + " = " + set.getValue()));
			System.out.println();
		});
		System.out.println(allUsers);

		SqlSessionUtil.closeSqlSession();
	}

	@Test
	public void testGetUserToMapWithMapKey() {
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		Map<String, Object> userToMapWithMapKey = mapper.getUserToMapWithMapKey();
		userToMapWithMapKey.entrySet().forEach(System.out::println);
		SqlSessionUtil.closeSqlSession();
	}

	@Test
	public void testGetUserByName() {
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);

		List<Map<String, Object>> usersByName = mapper.getUsersByName("n3");
		usersByName.forEach(map -> map.entrySet().forEach(System.out::println));

		SqlSessionUtil.closeSqlSession();
	}

	@Test
	public void testCheckLogin() {
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		User admin3 = mapper.checkLogin("admin3", "123456");
		System.out.println(admin3);
		SqlSessionUtil.closeSqlSession();
	}

	@Test
	public void testCheckLoginByMap() {
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);

		Map<String, Object> userMap = new HashMap<>();
		userMap.put("username", "admin3");
		userMap.put("password", "123456");

		User admin3 = mapper.checkLoginByMap(userMap);
		System.out.println(admin3);
		SqlSessionUtil.closeSqlSession();
	}

	@Test
	public void testCheckLoginByParam() {
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		int isFind = mapper.checkLoginByParam("admin3", "123456");
		System.out.println(isFind);
		SqlSessionUtil.closeSqlSession();
	}
}
