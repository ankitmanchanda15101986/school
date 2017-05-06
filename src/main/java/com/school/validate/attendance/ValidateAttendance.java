/**
 * 
 */
package com.school.validate.attendance;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.school.model.ProfileResponse;
import com.school.model.attendance.Attendance;
import com.school.util.Fields;
import com.school.util.GenericErrors;

/**
 * @author Manchanda
 *
 */
@Component
public class ValidateAttendance {

	final static String dateFormat = "dd-MM-yyyy";
	
	public ProfileResponse validate(Attendance attendance) {
		ProfileResponse response = new ProfileResponse();
		List<GenericErrors> errorList = new ArrayList<GenericErrors>();
		if(attendance != null) {
			if(attendance.getEnrollmentId() ==0) {
				GenericErrors error = new GenericErrors();
				error.setFieldName(Fields.EnrollmentId.toString());
				error.setErrorMessage("Invalid EnrollmentId");
				errorList.add(error);
			}
			if(attendance.getToDate() != null && !checkDateFormat(attendance.getToDate().toString())) {
				GenericErrors error = new GenericErrors();
				error.setFieldName(Fields.ToDate.toString());
				error.setErrorMessage("Invalid To Date");
				errorList.add(error);
			}
			if(attendance.getFromDate() != null || !checkDateFormat(attendance.getFromDate().toString())) {
				GenericErrors error = new GenericErrors();
				error.setFieldName(Fields.FromDate.toString());
				error.setErrorMessage("Invalid From Date");
				errorList.add(error);
			}
			if(attendance.getAttendanceDate() != null || !checkDateFormat(attendance.getAttendanceDate().toString())) {
				GenericErrors error = new GenericErrors();
				error.setFieldName(Fields.AttendanceDate.toString());
				error.setErrorMessage("Invalid Attendance Date");
				errorList.add(error);
			}
		} else {
			GenericErrors error = new GenericErrors();
			error.setErrorMessage("Invalid Request");
			errorList.add(error);
		}
		return response;
	}
	
	public boolean checkDateFormat(String date) {
		try {
			DateFormat format = new SimpleDateFormat(dateFormat);
			format.setLenient(false);
			format.parse(date);
			return true;
		} catch (ParseException e) {
			return false;
			
		}
		
	}
}
