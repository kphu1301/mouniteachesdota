package com.mouniteachesdota.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mouniteachesdota.entity.Lesson;
import com.mouniteachesdota.service.LessonService;

@Controller
public class LessonController {

	@Autowired
	private LessonService lessonService;
	
	@GetMapping("/lessons")
	public String listLessons(Model model) {
		List<Lesson> lessons = lessonService.getLessons();
		
		model.addAttribute("lessons", lessons);
		
		return "lesson-list";
	}
	
	@GetMapping("/showAddForm")
	public String showAddForm(Model model) {
		Lesson tempLesson = new Lesson();
		
		model.addAttribute("lesson", tempLesson);
		
		return "lesson-form";
	}
	
	@PostMapping("/saveLesson")
	public String saveLesson(@ModelAttribute("lesson") Lesson lesson) {
		
		lessonService.saveLesson(lesson);
		
		return "redirect:/lessons";
	}
	
	@GetMapping("/showUpdateForm")
	public String showUpdateForm(@RequestParam("lessonId") int id, Model model) {
		
		Lesson tempLesson = lessonService.getLesson(id);
		
		model.addAttribute("lesson", tempLesson);
		
		return "lesson-form";
	}
	
	@GetMapping("/deleteLesson")
	public String deleteLesson(@RequestParam("lessonId") int id, Model model) {
		
		lessonService.deleteLesson(id);
		
		return "redirect:/lessons";
	}
}
