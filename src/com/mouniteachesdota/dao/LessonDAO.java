package com.mouniteachesdota.dao;

import java.util.List;

import com.mouniteachesdota.entity.Lesson;

public interface LessonDAO {

	public List<Lesson> getLessons();

	public void saveLesson(Lesson lesson);

	public Lesson getLesson(int id);

	public void deleteLesson(int id);
}
