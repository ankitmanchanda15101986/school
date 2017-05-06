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
@Table(name="Subjects")
public class Subjects {

	@Id
	@Column(name="SUBJECT_CODE",unique=true)
	private int subjectCode;
	
	@Column(name="SUBJECT_NAME")
	private String subjectName;
	
	@Column(name="CLASS")
	private String classStandard;
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
}
