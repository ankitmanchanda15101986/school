/**
 * 
 */
package com.school.dao.attendance;
import java.util.List;
import com.school.model.attendance.Attendance;

/**
 * @author Manchanda
 *
 */
public interface AttendanceDao {

	public List<Attendance> getAttendanceBasedOnSearchCriteria(Attendance attendance) throws Exception;
	
	public List<Attendance> markAttendance(Attendance attendance) throws Exception;
}
