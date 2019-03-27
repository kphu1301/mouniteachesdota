package com.mouniteachesdota.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mouniteachesdota.entity.Lesson;

@Repository
public class LessonDAOImpl implements LessonDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Lesson> getLessons() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Lesson> tempQuery = currentSession.createQuery(
				"from Lesson order by type", Lesson.class);
		
		List<Lesson> lessons = tempQuery.getResultList();
		
		return lessons;
	}

	@Override
	public void saveLesson(Lesson lesson) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(lesson);
	}

	@Override
	public Lesson getLesson(int id) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Lesson tempLesson = currentSession.get(Lesson.class, id);
		
		return tempLesson;
	}

	@Override
	public void deleteLesson(int id) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query query = currentSession.createQuery(
				"delete from Lesson where id=:lessonId");
		query.setParameter("lessonId", id);
		
		query.executeUpdate();
	}

}
