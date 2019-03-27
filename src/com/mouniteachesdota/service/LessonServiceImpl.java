package com.mouniteachesdota.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mouniteachesdota.dao.LessonDAO;
import com.mouniteachesdota.entity.Lesson;

@Service
public class LessonServiceImpl implements LessonService {

	@Autowired
	private LessonDAO lessonDAO;
	
	@Override
	@Transactional
	public List<Lesson> getLessons() {
		
		return lessonDAO.getLessons();
	}

	@Override
	@Transactional
	public void saveLesson(Lesson lesson) {
		lessonDAO.saveLesson(lesson);
	}

	@Override
	@Transactional
	public Lesson getLesson(int id) {
		
		return lessonDAO.getLesson(id);
	}

	@Override
	@Transactional
	public void deleteLesson(int id) {
		
		lessonDAO.deleteLesson(id);
	}

}
