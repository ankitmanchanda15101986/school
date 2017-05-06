/**
 * 
 */
package com.school.validate.profile;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.school.model.ProfileResponse;
import com.school.model.profile.StudentProfile;
import com.school.util.Fields;
import com.school.util.GenericErrors;

/**
 * @author Manchanda
 *
 */
@Component
public class ValidateProfile {
	
	final static String dateFormat = "dd-MM-yyyy";

	public ProfileResponse validateCreateProfile(StudentProfile profile) {
		ProfileResponse validateResult = new ProfileResponse();
		List<GenericErrors> errorsList = new ArrayList<GenericErrors>();
		GenericErrors errors = new GenericErrors();
		if(profile != null) {
			if(StringUtils.isEmpty(profile.getAadharNumber())) {
				errors .setFieldName(Fields.AadharNumber.toString());
				errors.setErrorMessage("Invalid Address Line 2");
				errorsList.add(errors);
			}
			if(StringUtils.isEmpty(profile.getAddresLine2())) {
				errors .setFieldName(Fields.AddresLine2.toString());
				errors.setErrorMessage("Invalid Address Line 2");
				errorsList.add(errors);
			}
			if(StringUtils.isEmpty(profile.getAddressLine1())) {
				errors .setFieldName(Fields.AddressLine1.toString());
				errors.setErrorMessage("Invalid Address Line 1");
				errorsList.add(errors);
			} 
			
			if(StringUtils.isEmpty(profile.getCountry())) {
				errors .setFieldName(Fields.Country.toString());
				errors.setErrorMessage("Invalid Country");
				errorsList.add(errors);
			}
			if(StringUtils.isEmpty(profile.getEmailId())) {
				errors .setFieldName(Fields.EmailId.toString());
				errors.setErrorMessage("Invalid Email Id");
				errorsList.add(errors);
			}
			if(StringUtils.isEmpty(profile.getEnrollmentId())) {
				errors .setFieldName(Fields.EnrollmentId.toString());
				errors.setErrorMessage("Invalid Enrollment Id");
				errorsList.add(errors);
			}
			if(StringUtils.isEmpty(profile.getFatherContact())) {
				errors .setFieldName(Fields.FatherContact.toString());
				errors.setErrorMessage("Invalid Fathers Contact details");
				errorsList.add(errors);
			}
			if(StringUtils.isEmpty(profile.getFathersAadharNumber())) {
				errors .setFieldName(Fields.FathersAadharNumber.toString());
				errors.setErrorMessage("Invalid Fathers Aadhar Number");
				errorsList.add(errors);
			}
			if(profile.getFathersDOB() == null || !checkDateFormat(profile.getFathersDOB().toString())) {
				errors .setFieldName(Fields.FathersDOB.toString());
				errors.setErrorMessage("Invalid Fathers DOB");
				errorsList.add(errors);
			}
			if(StringUtils.isEmpty(profile.getFathersPancardNumber())) {
				errors .setFieldName(Fields.FathersPancardNumber.toString());
				errors.setErrorMessage("Invalid Fathers Pan Card Number");
				errorsList.add(errors);
			}
			if(StringUtils.isEmpty(profile.getFathersName())) {
				errors .setFieldName(Fields.FathersName.toString());
				errors.setErrorMessage("Invalid Fathers Name");
				errorsList.add(errors);
			}
			if(StringUtils.isEmpty(profile.getFirstName())) {
				errors .setFieldName(Fields.FirstName.toString());
				errors.setErrorMessage("Invalid First Name");
				errorsList.add(errors);
			}
			if(StringUtils.isEmpty(profile.getLastName())) {
				errors .setFieldName(Fields.LastName.toString());
				errors.setErrorMessage("Invalid Last Name");
				errorsList.add(errors);
			}
			if(StringUtils.isEmpty(profile.getMotherContact())) {
				errors .setFieldName(Fields.MotherContact.toString());
				errors.setErrorMessage("Invalid Mothers Contact Details");
				errorsList.add(errors);
			}
			if(StringUtils.isEmpty(profile.getMothersAadharNumber())) {
				errors .setFieldName(Fields.MothersAadharNumber.toString());
				errors.setErrorMessage("Invalid Mothers Aadhar Number");
				errorsList.add(errors);
			}
			if(profile.getMothersDOB() == null || !checkDateFormat(profile.getMothersDOB().toString())) {
				errors .setFieldName(Fields.MothersDOB.toString());
				errors.setErrorMessage("Invalid Mothers DOB");
				errorsList.add(errors);
			}
			if(StringUtils.isEmpty(profile.getMothersName())) {
				errors .setFieldName(Fields.MothersName.toString());
				errors.setErrorMessage("Invalid Mothers Name");
				errorsList.add(errors);
			}
			if(StringUtils.isEmpty(profile.getMothersPancardNumber())) {
				errors .setFieldName(Fields.MothersPancardNumber.toString());
				errors.setErrorMessage("Invalid Mothers Pan Card");
				errorsList.add(errors);
			}
			if(StringUtils.isEmpty(profile.getPincode())) {
				errors .setFieldName(Fields.Pincode.toString());
				errors.setErrorMessage("Invalid Pin Code");
				errorsList.add(errors);
			}
			if(StringUtils.isEmpty(profile.getRollNo())) {
				errors .setFieldName(Fields.RollNo.toString());
				errors.setErrorMessage("Invalid Roll Number");
				errorsList.add(errors);
			}			
			if(StringUtils.isEmpty(profile.getState())) {
				errors .setFieldName(Fields.State.toString());
				errors.setErrorMessage("Invalid State");
				errorsList.add(errors);
			}
			if(profile.getStudentDOB()  == null || !checkDateFormat(profile.getMothersDOB().toString())) {
				errors .setFieldName(Fields.StudentDOB.toString());
				errors.setErrorMessage("Invalid Student DOB");
				errorsList.add(errors);
			}
			if(StringUtils.isEmpty(profile.getUserName())) {
				errors .setFieldName(Fields.UserName.toString());
				errors.setErrorMessage("Invalid Username");
				errorsList.add(errors);
			}
			
			
		}
		validateResult.setErrors(errorsList);
		return validateResult;
		
	}
	
	public boolean checkDateFormat(String date) {
		try {
			DateFormat format = new SimpleDateFormat(dateFormat);
			format.setLenient(false);
			format.parse(date);
			return true;
		} catch (ParseException e) {
			return false;
			
		}
		
	}
}
