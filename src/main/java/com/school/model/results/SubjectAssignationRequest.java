/**
 * 
 */
package com.school.model.results;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Manchanda
 *
 */
@Entity
@Table(name="SubjectAssigned")
public class SubjectAssignationRequest {

	@Id
	@Column(name="ENROLLMENT_ID")
	private Integer enrollmentId;
	
	@Column(name="SUBJECT_CODE")
	private String subjectCode;
	
	/**
	 * @return the subjectCode
	 */
	public String getSubjectCode() {
		return subjectCode;
	}
	/**
	 * @param subjectCode the subjectCode to set
	 */
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	
	/**
	 * @return the enrollmentId
	 */
	public Integer getEnrollmentId() {
		return enrollmentId;
	}
	/**
	 * @param enrollmentId the enrollmentId to set
	 */
	public void setEnrollmentId(Integer enrollmentId) {
		this.enrollmentId = enrollmentId;
	}
}
