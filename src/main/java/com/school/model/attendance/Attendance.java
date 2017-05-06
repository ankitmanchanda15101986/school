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
	
	@Column(name="REMARKS")
	private String remarks;

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
