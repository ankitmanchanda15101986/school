/**
 * 
 */
package com.school.model;

import java.util.List;

import javax.security.auth.Subject;

import com.school.model.attendance.Attendance;
import com.school.model.profile.StudentProfile;
import com.school.model.results.Result;
import com.school.model.results.ResultResponse;
import com.school.util.GenericErrors;
import com.school.util.ResponseType;

/**
 * @author Manchanda
 *
 */
public class ProfileResponse {

	private String code;
	private String message;
	private ResponseType type;
	private List<StudentProfile> studentProfileList;
	private List<StudentProfile> teacherProfileList;
	private List<GenericErrors> errors;
	private List<Attendance> attendanceList;
	private List<ResultResponse> studentResult;
	/**
	 * @return the studentResult
	 */
	public List<ResultResponse> getStudentResult() {
		return studentResult;
	}
	/**
	 * @param studentResult the studentResult to set
	 */
	public void setStudentResult(List<ResultResponse> studentResult) {
		this.studentResult = studentResult;
	}
	
	/**
	 * @return the attendanceList
	 */
	public List<Attendance> getAttendanceList() {
		return attendanceList;
	}
	/**
	 * @param attendanceList the attendanceList to set
	 */
	public void setAttendanceList(List<Attendance> attendanceList) {
		this.attendanceList = attendanceList;
	}
	/**
	 * @return the errors
	 */
	public List<GenericErrors> getErrors() {
		return errors;
	}
	/**
	 * @param errors the errors to set
	 */
	public void setErrors(List<GenericErrors> errors) {
		this.errors = errors;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the type
	 */
	public ResponseType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(ResponseType type) {
		this.type = type;
	}
	/**
	 * @return the studentProfileList
	 */
	public List<StudentProfile> getStudentProfileList() {
		return studentProfileList;
	}
	/**
	 * @param studentProfileList the studentProfileList to set
	 */
	public void setStudentProfileList(List<StudentProfile> studentProfileList) {
		this.studentProfileList = studentProfileList;
	}
	/**
	 * @return the teacherProfileList
	 */
	public List<StudentProfile> getTeacherProfileList() {
		return teacherProfileList;
	}
	/**
	 * @param teacherProfileList the teacherProfileList to set
	 */
	public void setTeacherProfileList(List<StudentProfile> teacherProfileList) {
		this.teacherProfileList = teacherProfileList;
	}
}
