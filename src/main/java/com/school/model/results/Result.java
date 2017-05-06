/**
 * 
 */
package com.school.model.results;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.school.util.results.ExamType;
import com.school.util.results.ResultType;

/**
 * @author Manchanda
 *
 */
@Entity
@Table(name="Result")
public class Result {

	@Id
	@Column(name="ENROLLMENT_ID")
	private Integer enrollmentId;
	
	@Column(name="SUBJECT_CODE")
	private int subjectCode;
	
	@Column(name="MARKS")
	private int marks;
	
	@Column(name="EXAM_TYPE")
	private String examType;
	
	@Column(name="EXAM_DATE")
	private Date examDate;
	
	@Column(name="RESULT_STATUS")
	private String status;
	
	@Column(name="TYPE")
	private String type;
	
	@Column(name="STANDARD")
	private String classStandard;

	/**
	 * @return the classStandard
	 */
	public String getClassStandard() {
		return classStandard;
	}

	/**
	 * @param classStandard the classStandard to set
	 */
	public void setClassStandard(String classStandard) {
		this.classStandard = classStandard;
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

	/**
	 * @return the subjectCode
	 */
	public int getSubjectCode() {
		return subjectCode;
	}

	/**
	 * @param subjectCode the subjectCode to set
	 */
	public void setSubjectCode(int subjectCode) {
		this.subjectCode = subjectCode;
	}

	/**
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}

	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}

	/**
	 * @return the examType
	 */
	public String getExamType() {
		return examType;
	}

	/**
	 * @param examType the examType to set
	 */
	public void setExamType(String examType) {
		this.examType = examType;
	}

	/**
	 * @return the examDate
	 */
	public Date getExamDate() {
		return examDate;
	}

	/**
	 * @param examDate the examDate to set
	 */
	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
