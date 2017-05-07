/**
 * 
 */
package com.school.util.attendance;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.school.model.ProfileResponse;
import com.school.model.attendance.Attendance;

/**
 * @author Manchanda
 *
 */
@Component
public class AttendanceHelper {
	
	public Attendance attendance(int enrollmentId, String teacherRemarks, String parentRemarks, Date date) {
		Attendance attendance = new Attendance();
		attendance.setEnrollmentId(enrollmentId);
		if(date != null) {
			attendance.setAttendanceDate(date);
		} else {
			attendance.setAttendanceDate(new Date());
		}
		attendance.setAttendanceStatus(AttendanceStatus.Absent.toString());
		attendance.setTeacherRemarks(teacherRemarks);
		attendance.setParentRemarks(parentRemarks);
		return attendance;
	}
	
	@SuppressWarnings("deprecation")
	public Attendance convertData(int month, int year, int enrollmentId) {
		Date date = new Date();
		if(month ==0) {
			month = date.getMonth();
		}
		if(year ==0) {
			year = date.getYear();
		}
		Attendance attendance = new Attendance();
		attendance.setEnrollmentId(enrollmentId);
		Date fromDate = new Date();
		fromDate.setMonth(month);
		fromDate.setYear(year);
		fromDate.setDate(1);
		
		Date toDate = new Date();
		toDate.setMonth(month);
		toDate.setYear(year);
		toDate.setDate(getLastDayOfMonth(month, year));
		attendance.setToDate(toDate);
		attendance.setFromDate(fromDate);
		return attendance;
	}
	
	@SuppressWarnings("deprecation")
	public Attendance convertDateToAttendance(Date toDate, Date fromDate, int enrollmentId) {
		if(toDate == null) {
			toDate = new Date();
		}
		if(fromDate ==null) {
			Date date = new Date();
			date.setDate(1);
		}
		Attendance attendance = new Attendance();
		attendance.setEnrollmentId(enrollmentId);
		attendance.setToDate(toDate);
		attendance.setFromDate(fromDate);
		return attendance;
	}
	
	
	public int getLastDayOfMonth(int month, int year) {
		Calendar calendar = Calendar.getInstance();
		int yearpart = year;
		int monthPart = month;
		int dateDay = 1;
		calendar.set(yearpart, monthPart, dateDay);
		int numOfDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Number of Days: " + numOfDaysInMonth);
		System.out.println("First Day of month: " + calendar.getTime());
		calendar.add(Calendar.DAY_OF_MONTH, numOfDaysInMonth-1);
		System.out.println("Last Day of month: " + calendar.getTime());
		return numOfDaysInMonth;
	}
	
	public ProfileResponse convertResultToProfileResponseForAttendance(List<Attendance> resultData,
			String operationName) {
		ProfileResponse profileResponse = new ProfileResponse();
		if (resultData != null && resultData.size() > 0) {
			profileResponse.setAttendanceList(resultData);
			profileResponse.setCode("200");
			if (operationName.equalsIgnoreCase("get")) {
				profileResponse.setMessage("Attendance Retrieved Successfully");
			} else if (operationName.equalsIgnoreCase("mark")) {
				profileResponse.setMessage("Attendance Marked Successfully");
			}
			
		} else {
			profileResponse.setCode("400");
			if (operationName.equalsIgnoreCase("get")) {
				profileResponse.setMessage("Error While Retrieving Attendance");
			} else if (operationName.equalsIgnoreCase("mark")) {
				profileResponse.setMessage("Error While Marking Attendance ");
			} 
		}
		return profileResponse;
	}

}
