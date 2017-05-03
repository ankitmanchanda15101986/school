/**
 * 
 */
package com.school.dao.attendance.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.school.dao.attendance.AttendanceDao;
import com.school.dao.attendance.crud.AttendanceOperationCrudRepository;
import com.school.model.ProfileResponse;
import com.school.model.attendance.Attendance;
import com.school.util.Helper;

/**
 * @author Manchanda
 *
 */
public class AttendanceDaoImpl implements AttendanceDao {

	@Autowired
	private Helper helper;
	
	@Autowired
	private AttendanceOperationCrudRepository repository;
	/* (non-Javadoc)
	 * @see com.school.dao.attendance.AttendanceDao#getAttendanceBasedOnSearchCriteria(java.util.Date, java.util.Date, int)
	 */
	@Override
	public ProfileResponse getAttendanceBasedOnSearchCriteria(Date toDate, Date fromDate, int enrollmentId) {
		List<Attendance> attendanceList = repository.getAttendanceBasedOnSearch(toDate, fromDate, enrollmentId);
		ProfileResponse response = helper.convertResultToProfileResponseForAttendance(attendanceList, "get");
		return response;
	}

	/* (non-Javadoc)
	 * @see com.school.dao.attendance.AttendanceDao#markAttendance(int)
	 */
	@Override
	public ProfileResponse markAttendance(Attendance attendance) {
		List<Attendance> attendanceList = new ArrayList<Attendance>();
		attendance = repository.save(attendance);
		attendanceList.add(attendance);
		ProfileResponse response = helper.convertResultToProfileResponseForAttendance(attendanceList, "get");
		return response;
	}

}
