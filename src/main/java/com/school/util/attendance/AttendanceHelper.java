/**
 * 
 */
package com.school.util.attendance;

import java.util.Calendar;
import java.util.Date;

import com.school.model.attendance.Attendance;

/**
 * @author Manchanda
 *
 */
public class AttendanceHelper {
	
	public Attendance markAttendance(int enrollmentId) {
		Attendance attendance = new Attendance();
		attendance.setEnrollmentId(enrollmentId);
		attendance.setAttendanceDate(new Date());
		attendance.setAttendanceStatus(AttendanceStatus.Absent.toString());
		return attendance;
	}
	
	public Attendance convertData(int month, int year) {
		Attendance attendance = new Attendance();
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

}
