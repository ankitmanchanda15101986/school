/**
 * 
 */
package com.school.service.attendance;

import java.util.Date;
import com.school.model.ProfileResponse;
import com.school.util.attendance.AttendanceType;

/**
 * @author Manchanda
 *
 */
public interface AttendanceService {

	public ProfileResponse getAttendanceBasedOnSearchCriteria(Date toDate, Date fromDate, int enrollmentId);
	
	public ProfileResponse getAttendanceBasedOnMonth(int month, int year, int enrollmentId);
		
	public ProfileResponse markOrUpdateAttendanceRemark(int enrollmentId, Date date, String teacherRemarks, String parentsRemarks, AttendanceType type);
}
