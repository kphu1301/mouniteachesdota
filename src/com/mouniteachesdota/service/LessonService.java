package com.mouniteachesdota.service;

import java.util.List;

import com.mouniteachesdota.entity.Lesson;

public interface LessonService {

	public List<Lesson> getLessons();

	public void saveLesson(Lesson lesson);

	public Lesson getLesson(int id);

	public void deleteLesson(int id);
}
