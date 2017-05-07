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
import com.school.util.attendance.AttendanceType;

/**
 * @author Manchanda
 *
 */
@RestController
public class AttendanceController {

	@Autowired
	private AttendanceServiceImpl service;
	
	/**
	 * Teacher + Parent
	 * @param toDate
	 * @param fromDate
	 * @param enrollmentId
	 * @return
	 */
	@RequestMapping(value="/retrieveAttendance", method=RequestMethod.GET)
	public ProfileResponse getAttendanceBasedOnSearchCriteria(@RequestParam(name="toDate") Date toDate,
			@RequestParam(name="fromDate") Date fromDate, @RequestParam(name="enrollmentId") int enrollmentId) {
		
			ProfileResponse response= service.getAttendanceBasedOnSearchCriteria(toDate, fromDate, enrollmentId);
			return response;
		
	}
	
	/**
	 * Teacher + Parent
	 * @param year
	 * @param month
	 * @param enrollmentId
	 * @return
	 */
	@RequestMapping(value="/retrieveAttendanceBasedOnMonth", method=RequestMethod.GET)
	public ProfileResponse getAttendanceBasedOnMonth(@RequestParam(name="year") int year,
			@RequestParam(name="month") int month, @RequestParam(name="enrollmentId") int enrollmentId) {
		ProfileResponse response= service.getAttendanceBasedOnMonth(month, year, enrollmentId);
		return response;
		
	}
	
	/**
	 * Teacher
	 * @param enrollmentId
	 * @param remarks
	 * @return
	 */
	@RequestMapping(value="/markAttendance/teacher", method=RequestMethod.GET)
	public ProfileResponse markAttendanceByTeacher(@RequestParam(name="enrollmentId") int enrollmentId,
			@RequestParam(name="remarks") String remarks) {
		ProfileResponse response= service.markOrUpdateAttendanceRemark(enrollmentId,null, remarks,"",AttendanceType.NEW);
		return response;
		
	}
	
	/**
	 * Parent
	 * @param enrollmentId
	 * @param remarks
	 * @return
	 */
	@RequestMapping(value="/markAttendance/parent", method=RequestMethod.GET)
	public ProfileResponse markAttendanceByParent(@RequestParam(name="enrollmentId") int enrollmentId,
			@RequestParam(name="Date") Date date, @RequestParam(name="remarks") String remarks) {
		ProfileResponse response= service.markOrUpdateAttendanceRemark(enrollmentId, date ,"", remarks,AttendanceType.NEW);
		return response;
		
	}
	
	/**
	 * Teacher
	 * @param enrollmentId
	 * @param remarks
	 * @return
	 */
	@RequestMapping(value="/updateRemarks/teacher", method=RequestMethod.GET)
	public ProfileResponse updateAttendanceRemarks(@RequestParam(name="enrollmentId") int enrollmentId,
			@RequestParam(name="Date") Date date, @RequestParam(name="remarks") String remarks) {
		ProfileResponse response= service.markOrUpdateAttendanceRemark(enrollmentId, date, remarks, "", AttendanceType.UPDATE);
		return response;
		
	}
	
	/**
	 * Parent
	 * @param enrollmentId
	 * @param remarks
	 * @return
	 */
	@RequestMapping(value="/updateRemarks/parents", method=RequestMethod.GET)
	public ProfileResponse parentRemarks(@RequestParam(name="enrollmentId") int enrollmentId,
			@RequestParam(name="Date") Date date, @RequestParam(name="remarks") String remarks) {
		ProfileResponse response= service.markOrUpdateAttendanceRemark(enrollmentId, date, "" ,remarks, AttendanceType.UPDATE);
		return response;
		
	}
}
