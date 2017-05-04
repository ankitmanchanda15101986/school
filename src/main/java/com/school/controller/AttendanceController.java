/**
 * 
 */
package com.school.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.model.ProfileResponse;
import com.school.service.attendance.impl.AttendanceServiceImpl;

/**
 * @author Manchanda
 *
 */
@RestController
public class AttendanceController {

	@Autowired
	private AttendanceServiceImpl service;
	
	@RequestMapping(value="/retrieveAttendance", method=RequestMethod.GET)
	public ProfileResponse getAttendanceBasedOnSearchCriteria(@RequestParam(name="toDate") Date toDate,
			@RequestParam(name="fromDate") Date fromDate, @RequestParam(name="enrollmentId") int enrollmentId) {
		
			ProfileResponse response= service.getAttendanceBasedOnSearchCriteria(toDate, fromDate, enrollmentId);
			return response;
		
	}
	
	@RequestMapping(value="/retrieveAttendanceBasedOnMonth", method=RequestMethod.GET)
	public ProfileResponse getAttendanceBasedOnMonth(@RequestParam(name="year") int year,
			@RequestParam(name="month") int month, @RequestParam(name="enrollmentId") int enrollmentId) {
		ProfileResponse response= service.getAttendanceBasedOnMonth(month, year, enrollmentId);
		return response;
		
	}
	
	@RequestMapping(value="/markAttendance", method=RequestMethod.GET)
	public ProfileResponse markAttendance(@RequestParam(name="enrollmentId") int enrollmentId,
			@RequestParam(name="remarks") String remarks) {
		ProfileResponse response= service.markAttendance(enrollmentId, remarks);
		return response;
		
	}
	
	@RequestMapping(value="/updateAttendanceRemarks", method=RequestMethod.GET)
	public ProfileResponse updateAttendanceRemarks(@RequestParam(name="enrollmentId") int enrollmentId,
			@RequestParam(name="Date") Date date, @RequestParam(name="remarks") String remarks) {
		ProfileResponse response= service.updateAttendanceRemark(enrollmentId, date, remarks);
		return response;
		
	}
}
