package com.newlecture.web.dao.mybatis;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.NoticeView;

@SpringBootTest
class MybatisNoticeDaoTest {
	
	@Autowired
	private NoticeDao noticeDao;

	@Test
	void test() { 	//구현한메서드가 정상작동되는지 테스트
		List<NoticeView> list = noticeDao.getViewList(0, 1, null, null, false);
		System.out.println(list.get(0));
	}
}
