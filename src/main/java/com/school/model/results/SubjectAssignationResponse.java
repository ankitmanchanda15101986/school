package com.school.model.results;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Manchanda
 *
 */
@Component
public class SubjectAssignationResponse {

	private Integer enrollmentId;
	private List<Subjects> subjectList;
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
	 * @return the subjectList
	 */
	public List<Subjects> getSubjectList() {
		return subjectList;
	}
	/**
	 * @param subjectList the subjectList to set
	 */
	public void setSubjectList(List<Subjects> subjectList) {
		this.subjectList = subjectList;
	}
}
