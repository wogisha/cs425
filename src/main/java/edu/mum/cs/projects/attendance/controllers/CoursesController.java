package edu.mum.cs.projects.attendance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.mum.cs.projects.attendance.domain.entity.CourseOffering;
import edu.mum.cs.projects.attendance.service.CourseService;

@Controller
public class CoursesController {
	@Autowired
	CourseService courseService;

	@GetMapping(value = { "/", "/courses" })
	public String index(Model model) {

		List<CourseOffering> courseOffering = courseService.getCourseOfferings("2017-05-29");

		model.addAttribute("courseOffering", courseOffering);

		return "courses";
	}
}
