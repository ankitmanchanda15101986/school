/**
 * 
 */
package com.school.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import com.school.model.ProfileResponse;
import com.school.service.attendance.impl.AttendanceServiceImpl;

/**
 * @author Manchanda
 *
 */
public class AttendanceController {

	@Autowired
	private AttendanceServiceImpl service;
	
	public ProfileResponse getAttendanceBasedOnSearchCriteria(@RequestParam(name="toDate") Date toDate,
			@RequestParam(name="fromDate") Date fromDate, @RequestParam(name="enrollmentId") int enrollmentId) {
		
			ProfileResponse response= service.getAttendanceBasedOnSearchCriteria(toDate, fromDate, enrollmentId);
			return response;
		
	}
	
	public ProfileResponse getAttendanceBasedOnMonth(@RequestParam(name="year") int year,
			@RequestParam(name="month") int month, @RequestParam(name="enrollmentId") int enrollmentId) {
		ProfileResponse response= service.getAttendanceBasedOnMonth(month, year, enrollmentId);
		return response;
		
	}
	
	public ProfileResponse markAttendance(@RequestParam(name="enrollmentId") int enrollmentId) {
		ProfileResponse response= service.markAttendance(enrollmentId);
		return response;
		
	}
}
