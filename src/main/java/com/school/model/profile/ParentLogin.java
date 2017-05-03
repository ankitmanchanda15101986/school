/**
 * 
 */
package com.school.model.profile;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Manchanda
 *
 */
@Entity
@Table(name="PARENT_LOGIN")
public class ParentLogin {
	
	@Id
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="OTP")
	private int otp;
	
	@Column(name="SECRET_QUESTION1")
	private String secretQuestion1;
	
	@Column(name="ANSWER1")
	private String answer1;
	
	@Column(name="SECRET_QUESTION2")
	private String secretQuestion2;
	
	@Column(name="ANSWER2")
	private String answer2;
	
	@Column(name="SECRET_QUESTION3")
	private String secretQuestion3;
	
	@Column(name="ANSWER3")
	private String answer3;
	
	private boolean passwordReset;
	private String newPassword;

	
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
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the otp
	 */
	public int getOtp() {
		return otp;
	}
	/**
	 * @param otp the otp to set
	 */
	public void setOtp(int otp) {
		this.otp = otp;
	}
	/**
	 * @return the secretQuestion1
	 */
	public String getSecretQuestion1() {
		return secretQuestion1;
	}
	/**
	 * @param secretQuestion1 the secretQuestion1 to set
	 */
	public void setSecretQuestion1(String secretQuestion1) {
		this.secretQuestion1 = secretQuestion1;
	}
	/**
	 * @return the answer1
	 */
	public String getAnswer1() {
		return answer1;
	}
	/**
	 * @param answer1 the answer1 to set
	 */
	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}
	/**
	 * @return the secretQuestion2
	 */
	public String getSecretQuestion2() {
		return secretQuestion2;
	}
	/**
	 * @param secretQuestion2 the secretQuestion2 to set
	 */
	public void setSecretQuestion2(String secretQuestion2) {
		this.secretQuestion2 = secretQuestion2;
	}
	/**
	 * @return the answer2
	 */
	public String getAnswer2() {
		return answer2;
	}
	/**
	 * @param answer2 the answer2 to set
	 */
	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	/**
	 * @return the secretQuestion3
	 */
	public String getSecretQuestion3() {
		return secretQuestion3;
	}
	/**
	 * @param secretQuestion3 the secretQuestion3 to set
	 */
	public void setSecretQuestion3(String secretQuestion3) {
		this.secretQuestion3 = secretQuestion3;
	}
	/**
	 * @return the answer3
	 */
	public String getAnswer3() {
		return answer3;
	}
	/**
	 * @param answer3 the answer3 to set
	 */
	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}
	/**
	 * @return the passwordReset
	 */
	public boolean isPasswordReset() {
		return passwordReset;
	}
	/**
	 * @param passwordReset the passwordReset to set
	 */
	public void setPasswordReset(boolean passwordReset) {
		this.passwordReset = passwordReset;
	}
	/**
	 * @return the newPassword
	 */
	public String getNewPassword() {
		return newPassword;
	}
	/**
	 * @param newPassword the newPassword to set
	 */
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
}
