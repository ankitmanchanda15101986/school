/**
 * 
 */
package com.school.service.attendance;

import java.util.Date;
import com.school.model.ProfileResponse;

/**
 * @author Manchanda
 *
 */
public interface AttendanceService {

	public ProfileResponse getAttendanceBasedOnSearchCriteria(Date toDate, Date fromDate, int enrollmentId);
	
	public ProfileResponse getAttendanceBasedOnMonth(int month, int year, int enrollmentId);
	
	public ProfileResponse markAttendance(int enrollmentId, String remarks);
	
	public ProfileResponse updateAttendanceRemark(int enrollmentId, Date date, String remarks);
}
