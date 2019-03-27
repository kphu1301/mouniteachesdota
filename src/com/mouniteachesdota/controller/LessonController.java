package com.mouniteachesdota.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mouniteachesdota.dao.LessonDAO;
import com.mouniteachesdota.entity.Lesson;

@Controller
public class LessonController {

	@Autowired
	private LessonDAO lessonDAO;
	
	@GetMapping("/lessons")
	public String listLessons(Model model) {
		List<Lesson> lessons = lessonDAO.getLessons();
		
		model.addAttribute("lessons", lessons);
		
		return "lesson-list";
	}
}
