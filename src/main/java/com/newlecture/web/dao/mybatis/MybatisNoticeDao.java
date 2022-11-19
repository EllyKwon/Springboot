package com.newlecture.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Repository
public class MybatisNoticeDao implements NoticeDao {
	
	private NoticeDao mapper;
	
	@Autowired		//생성자 인젝션
	public MybatisNoticeDao(SqlSession sqlSession) {
		mapper = sqlSession.getMapper(NoticeDao.class);   //NoticeDao의 클래스정보를 주면서 이것의 구현체를 꺼내달라는뜻
	}

	@Override
	public List<NoticeView> getViewList(int offset, int size, String field, String query, boolean pub) {
				
		return mapper.getViewList(offset, size, field, query, pub);
	}

	@Override
	public int getCount(String field, String query, boolean pub) {
		return mapper.getCount(field, query, pub);
	}

	@Override
	public NoticeView getView(int id) {
		return mapper.getView(id);
	}

	@Override
	public Notice getNext(int id) {
		return mapper.getNext(id);
	}

	@Override
	public Notice getPrev(int id) {
		return mapper.getPrev(id);
	}

	@Override
	public int update(Notice notice) {
		return mapper.update(notice);
	}

	@Override
	public int insert(Notice notice) {
		return mapper.insert(notice);
	}

	@Override
	public int delete(int id) {
		return mapper.delete(id);
	}

	@Override
	public int deleteAll(int[] ids) {
		return mapper.deleteAll(ids);
	}

	@Override
	public int updatePubAll(int[] ids, boolean pub) {
		return mapper.updatePubAll(ids, pub);
	}
}
