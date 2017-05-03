/**
 * 
 */
package com.school.dao.attendance;

import java.util.Date;

import com.school.model.ProfileResponse;
import com.school.model.attendance.Attendance;

/**
 * @author Manchanda
 *
 */
public interface AttendanceDao {

	public ProfileResponse getAttendanceBasedOnSearchCriteria(Date toDate, Date fromDate, int enrollmentId);
	
	public ProfileResponse markAttendance(Attendance attendance);
}
