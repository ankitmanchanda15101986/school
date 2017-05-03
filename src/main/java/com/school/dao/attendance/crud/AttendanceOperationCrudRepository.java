/**
 * 
 */
package com.school.dao.attendance.crud;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.school.model.attendance.Attendance;

/**
 * @author Manchanda
 *
 */
public interface AttendanceOperationCrudRepository extends CrudRepository<Attendance, Integer> {

	@Query("from Attendance where enrollmentId=:enrollmentId and  Attendance_DATE >= :toDate and Attendance_DATE <=:fromDate ")
	public List<Attendance> getAttendanceBasedOnSearch(@Param("toDate") Date toDate, 
			@Param("fromDate") Date fromDate, @Param("enrollmentId") int enrollmentId);	
}
