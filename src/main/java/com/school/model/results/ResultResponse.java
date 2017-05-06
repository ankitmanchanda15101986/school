/**
 * 
 */
package com.school.model.results;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author Manchanda
 *
 */
@Component
public class ResultResponse {
	private int enrollmentId;
	private List<SubjectsRelatedResults> result;
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
	 * @return the result
	 */
	public List<SubjectsRelatedResults> getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(List<SubjectsRelatedResults> result) {
		this.result = result;
	}
}
