package com.school.model.results;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Manchanda
 *
 */
@Component
public class SubjectsRelatedResults {
	private int subjectCode;
	private String subjectName;
	private Date examDate;
	private int marks;
	private String status;
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
	 * @return the subjectName
	 */
	public String getSubjectName() {
		return subjectName;
	}
	/**
	 * @param subjectName the subjectName to set
	 */
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
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
	
}
