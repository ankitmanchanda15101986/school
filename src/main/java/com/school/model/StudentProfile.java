/**
 * 
 */
package com.school.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Manchanda
 *
 */
@Entity
@Table(name="STUDENT_PROFILE")
public class StudentProfile {

	@Id
	@Column(name="ENROLLMENT_ID")
	private int enrollmentId;
	
	@Column(name="ROLL_NUMBER")
	private int rollNo;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="STUDENT_DOB")
	private String studentDOB;
	
	@Column(name="AADHAR_NUMBER")
	private String aadharNumber;
	
	@Column(name="MOTHERS_NAME")
	private String mothersName;
	
	@Column(name="MOTHERS_DOB")
	private String mothersDOB;
	
	@Column(name="MOTHERS_AADHAR_NUMBER")
	private String mothersAadharNumber;
	
	@Column(name="MOTHERS_PAN_NUMBER")
	private String mothersPancardNumber;
	
	@Column(name="FATHERS_NAME")
	private String fathersName;
	
	@Column(name="FATHERS_DOB")
	private String fathersDOB;
	
	@Column(name="FATHERS_AADHAR_NUMBER")
	private String fathersAadharNumber;
	
	@Column(name="FATHERS_PAN_NUMBER")
	private String fathersPancardNumber;
	
	@Column(name="MOTHER_CONTACT")
	private int motherContact;
	
	@Column(name="FATHER_CONTACT")
	private int fatherContact;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	@Column(name="ADDRESS_LINE1")
	private String addressLine1;
	
	@Column(name="ADDRESS_LINE2")
	private String addresLine2;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="PINCODE")
	private String pincode;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="USER_NAME")
	private String userName;
	
	/**
	 * @return the studentDOB
	 */
	public String getStudentDOB() {
		return studentDOB;
	}
	/**
	 * @param studentDOB the studentDOB to set
	 */
	public void setStudentDOB(String studentDOB) {
		this.studentDOB = studentDOB;
	}
	/**
	 * @return the aadharNumber
	 */
	public String getAadharNumber() {
		return aadharNumber;
	}
	/**
	 * @param aadharNumber the aadharNumber to set
	 */
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	/**
	 * @return the mothersDOB
	 */
	public String getMothersDOB() {
		return mothersDOB;
	}
	/**
	 * @param mothersDOB the mothersDOB to set
	 */
	public void setMothersDOB(String mothersDOB) {
		this.mothersDOB = mothersDOB;
	}
	/**
	 * @return the mothersAadharNumber
	 */
	public String getMothersAadharNumber() {
		return mothersAadharNumber;
	}
	/**
	 * @param mothersAadharNumber the mothersAadharNumber to set
	 */
	public void setMothersAadharNumber(String mothersAadharNumber) {
		this.mothersAadharNumber = mothersAadharNumber;
	}
	/**
	 * @return the mothersPancardNumber
	 */
	public String getMothersPancardNumber() {
		return mothersPancardNumber;
	}
	/**
	 * @param mothersPancardNumber the mothersPancardNumber to set
	 */
	public void setMothersPancardNumber(String mothersPancardNumber) {
		this.mothersPancardNumber = mothersPancardNumber;
	}
	/**
	 * @return the fathersDOB
	 */
	public String getFathersDOB() {
		return fathersDOB;
	}
	/**
	 * @param fathersDOB the fathersDOB to set
	 */
	public void setFathersDOB(String fathersDOB) {
		this.fathersDOB = fathersDOB;
	}
	/**
	 * @return the fathersAadharNumber
	 */
	public String getFathersAadharNumber() {
		return fathersAadharNumber;
	}
	/**
	 * @param fathersAadharNumber the fathersAadharNumber to set
	 */
	public void setFathersAadharNumber(String fathersAadharNumber) {
		this.fathersAadharNumber = fathersAadharNumber;
	}
	/**
	 * @return the fathersPancardNumber
	 */
	public String getFathersPancardNumber() {
		return fathersPancardNumber;
	}
	/**
	 * @param fathersPancardNumber the fathersPancardNumber to set
	 */
	public void setFathersPancardNumber(String fathersPancardNumber) {
		this.fathersPancardNumber = fathersPancardNumber;
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
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the mothersName
	 */
	public String getMothersName() {
		return mothersName;
	}
	/**
	 * @param mothersName the mothersName to set
	 */
	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}
	/**
	 * @return the fathersName
	 */
	public String getFathersName() {
		return fathersName;
	}
	/**
	 * @param fathersName the fathersName to set
	 */
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
	/**
	 * @return the motherContact
	 */
	public int getMotherContact() {
		return motherContact;
	}
	/**
	 * @param motherContact the motherContact to set
	 */
	public void setMotherContact(int motherContact) {
		this.motherContact = motherContact;
	}
	/**
	 * @return the fatherContact
	 */
	public int getFatherContact() {
		return fatherContact;
	}
	/**
	 * @param fatherContact the fatherContact to set
	 */
	public void setFatherContact(int fatherContact) {
		this.fatherContact = fatherContact;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}
	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	/**
	 * @return the addresLine2
	 */
	public String getAddresLine2() {
		return addresLine2;
	}
	/**
	 * @param addresLine2 the addresLine2 to set
	 */
	public void setAddresLine2(String addresLine2) {
		this.addresLine2 = addresLine2;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}
	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
