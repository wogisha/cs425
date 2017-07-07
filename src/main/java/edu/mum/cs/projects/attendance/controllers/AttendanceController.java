package edu.mum.cs.projects.attendance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.mum.cs.projects.attendance.domain.StudentAttendance;
import edu.mum.cs.projects.attendance.service.AttendanceService;

@Controller
public class AttendanceController {

	@Autowired
	AttendanceService attendanceService;

	@GetMapping("/attendance")
	public String index(Model model) {
		List<StudentAttendance> studentAttendance = attendanceService.createAttendanceReportForBlock("2017-06-26");

		model.addAttribute("studentAttendance", studentAttendance);
		return "attendance";
	}

	@GetMapping("/attendance/{courseOfferingId}")
	public String courseAttendance(Model model, @PathVariable Long courseOfferingId) {		

		List<StudentAttendance> studentAttendance = attendanceService.createAttendanceReportForBlock("2017-06-26");

		model.addAttribute("studentAttendance", studentAttendance);
		return "attendance";
	}
}
