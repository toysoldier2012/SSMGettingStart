package com.xiaoyu.mbg;

import com.xiaoyu.mbg.mapper.ActorMapper;
import com.xiaoyu.mbg.pojo.Actor;
import com.xiaoyu.mbg.pojo.ActorExample;
import com.xiaoyu.mbg.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestActorOperation {
	@Test
	public void testActorSelector(){
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		ActorMapper mapper = sqlSession.getMapper(ActorMapper.class);
		ActorExample actorExample = new ActorExample();
		actorExample.createCriteria().andActorIdBetween((short) 155, (short) 210);
		List<Actor> actors = mapper.selectByExample(actorExample);

		System.out.println(actors);
		SqlSessionUtil.closeSqlSession();
	}
}
