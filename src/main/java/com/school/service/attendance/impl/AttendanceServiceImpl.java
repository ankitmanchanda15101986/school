/**
 * 
 */
package com.school.service.attendance.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.school.dao.attendance.impl.AttendanceDaoImpl;
import com.school.model.ProfileResponse;
import com.school.model.attendance.Attendance;
import com.school.service.attendance.AttendanceService;
import com.school.util.attendance.AttendanceHelper;
import com.school.validate.attendance.ValidateAttendance;

/**
 * @author Manchanda
 *
 */
@Service
public class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	private ValidateAttendance validator;
	
	@Autowired
	private AttendanceDaoImpl dao;
	
	@Autowired
	private AttendanceHelper helper;
	
	/* (non-Javadoc)
	 * @see com.school.service.attendance.AttendanceService#getAttendanceBasedOnSearchCriteria(java.util.Date, java.util.Date, int)
	 */
	@Override
	public ProfileResponse getAttendanceBasedOnSearchCriteria(Date toDate, Date fromDate, int enrollmentId) {
		Attendance attendance = helper.convertDateToAttendance(toDate, fromDate, enrollmentId);
		ProfileResponse response = validator.validate(attendance);
		List<Attendance> attendanceList = null;
		if(response != null  && response.getErrors()!= null && response.getErrors().size()==0) {
			try {
				attendanceList = dao.getAttendanceBasedOnSearchCriteria(attendance);
			} catch (Exception e) {
				e.printStackTrace();
			}
			response = helper.convertResultToProfileResponseForAttendance(attendanceList, "view");
		}
		return response;
	}

	/* (non-Javadoc)
	 * @see com.school.service.attendance.AttendanceService#getAttendanceBasedOnMonth(java.lang.String, java.lang.String, int)
	 */
	@Override
	public ProfileResponse getAttendanceBasedOnMonth(int month, int year, int enrollmentId) {
		Attendance attendance = helper.convertData(month, year, enrollmentId);
		ProfileResponse response = validator.validate(attendance);
		List<Attendance> attendanceList = null;
		if(response != null  && response.getErrors()!= null && response.getErrors().size()==0) {
			try {
				attendanceList =  dao.getAttendanceBasedOnSearchCriteria(attendance);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response = helper.convertResultToProfileResponseForAttendance(attendanceList, "mark");
		}
		return response;
	}

	/* (non-Javadoc)
	 * @see com.school.service.attendance.AttendanceService#markAttendance(int)
	 */
	@Override
	public ProfileResponse markAttendance(int enrollmentId, String remarks) {
		Attendance attendance = helper.markAttendance(enrollmentId, remarks, null);
		ProfileResponse response = validator.validate(attendance);
		List<Attendance> attendanceList = null;
		if(response != null  && response.getErrors()!= null && response.getErrors().size()==0) {
			try {
				attendanceList  = dao.markAttendance(attendance);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response = helper.convertResultToProfileResponseForAttendance(attendanceList, "mark");
		}
		return response;
	}

	@Override
	public ProfileResponse updateAttendanceRemark(int enrollmentId, Date date, String remarks) {
		Attendance attendance = helper.markAttendance(enrollmentId, remarks, date);
		ProfileResponse response = validator.validate(attendance);
		List<Attendance> attendanceList = null;
		if(response != null  && response.getErrors()!= null && response.getErrors().size()==0) {
			try {
				attendanceList =  dao.markAttendance(attendance);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response = helper.convertResultToProfileResponseForAttendance(attendanceList, "mark");
		}
		return response;
	}
}
