/**
 * 
 */
package com.school.dao.attendance.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.school.dao.attendance.AttendanceDao;
import com.school.dao.attendance.crud.AttendanceOperationCrudRepository;
import com.school.model.attendance.Attendance;

/**
 * @author Manchanda
 *
 */
@Repository
public class AttendanceDaoImpl implements AttendanceDao {
	
	@Autowired
	private AttendanceOperationCrudRepository repository;
	/* (non-Javadoc)
	 * @see com.school.dao.attendance.AttendanceDao#getAttendanceBasedOnSearchCriteria(java.util.Date, java.util.Date, int)
	 */
	@Override
	public List<Attendance> getAttendanceBasedOnSearchCriteria(Attendance attendance) throws Exception{
		List<Attendance> attendanceList = repository.getAttendanceBasedOnSearch(attendance.getToDate(), attendance.getFromDate(), attendance.getEnrollmentId());
		return attendanceList;
	}

	/* (non-Javadoc)
	 * @see com.school.dao.attendance.AttendanceDao#markAttendance(int)
	 */
	@Override
	public List<Attendance> markAttendance(Attendance attendance) throws Exception{
		List<Attendance> attendanceList = new ArrayList<Attendance>();
		attendance = repository.save(attendance);
		attendanceList.add(attendance);
		return attendanceList;
	}

}
