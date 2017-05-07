package com.school.model.attendance;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Manchanda
 *
 */
@Entity
@Table(name="Attendance")
public class Attendance {

	@Id
	@Column(name="ENROLLMENT_ID")
	private int enrollmentId;
	
	private Date toDate;
	
	private Date fromDate;
	
	@Column(name="DATE")
	private Date attendanceDate;
	
	@Column(name="STATUS")
	private String attendanceStatus;
	
	@Column(name="TEACHER_REMARKS")
	private String teacherRemarks;
	
	@Column(name="PARENT_REMARKS")
	private String parentRemarks;


	/**
	 * @return the teacherRemarks
	 */
	public String getTeacherRemarks() {
		return teacherRemarks;
	}

	/**
	 * @param teacherRemarks the teacherRemarks to set
	 */
	public void setTeacherRemarks(String teacherRemarks) {
		this.teacherRemarks = teacherRemarks;
	}

	/**
	 * @return the parentRemarks
	 */
	public String getParentRemarks() {
		return parentRemarks;
	}

	/**
	 * @param parentRemarks the parentRemarks to set
	 */
	public void setParentRemarks(String parentRemarks) {
		this.parentRemarks = parentRemarks;
	}

	/**
	 * @return the toDate
	 */
	public Date getToDate() {
		return toDate;
	}

	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	/**
	 * @return the fromDate
	 */
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * @return the enrollmentId
	 */
	public int getEnrollmentId() {
		return enrollmentId;
	}

	/**
	 * @param enrollmentId the enrollmentId to set
	 */
	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	/**
	 * @return the attendanceDate
	 */
	public Date getAttendanceDate() {
		return attendanceDate;
	}

	/**
	 * @param attendanceDate the attendanceDate to set
	 */
	public void setAttendanceDate(Date attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	/**
	 * @return the attendanceStatus
	 */
	public String getAttendanceStatus() {
		return attendanceStatus;
	}

	/**
	 * @param attendanceStatus the attendanceStatus to set
	 */
	public void setAttendanceStatus(String attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
	}
	
}
