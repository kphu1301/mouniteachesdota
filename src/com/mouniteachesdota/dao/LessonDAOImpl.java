package com.mouniteachesdota.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mouniteachesdota.entity.Lesson;

@Repository
public class LessonDAOImpl implements LessonDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Lesson> getLessons() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Lesson> tempQuery = currentSession.createQuery(
				"from Lesson", Lesson.class);
		
		List<Lesson> lessons = tempQuery.getResultList();
		
		return lessons;
	}

}
