/**
 * 
 */
package com.school.validate.results;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.school.model.ProfileResponse;
import com.school.model.results.Result;
import com.school.model.results.SubjectAssignationRequest;
import com.school.model.results.Subjects;
import com.school.util.Fields;
import com.school.util.GenericErrors;

/**
 * @author Manchanda
 *
 */
@Component
public class ValidateResult {

	public ProfileResponse validate(Result result, String operation) {
		ProfileResponse response = new ProfileResponse();
		List<GenericErrors> errorsList = new ArrayList<GenericErrors>();
		GenericErrors errors = new GenericErrors();
		if(result != null) {
			if(result.getEnrollmentId() == null) {
				errors .setFieldName(Fields.EnrollmentId.toString());
				errors.setErrorMessage("Invalid Enrollment Id");
				errorsList.add(errors);
			}			
			if(StringUtils.isEmpty(result.getSubjectCode()) && operation.equalsIgnoreCase("insert")) {
				errors .setFieldName(Fields.SubjectCode.toString());
				errors.setErrorMessage("Code is mandatory field");
				errorsList.add(errors);
			}
			if(result.getMarks() == null && operation.equalsIgnoreCase("insert")) {
				errors .setFieldName(Fields.Marks.toString());
				errors.setErrorMessage("Marks is mandatory field");
				errorsList.add(errors);
			}
			if(result.getExamType() == null) {
				errors .setFieldName(Fields.ExamType.toString());
				errors.setErrorMessage("Exam type is mandatory field");
				errorsList.add(errors);
			}
			if(result.getExamDate() == null && operation.equalsIgnoreCase("insert")) {
				errors .setFieldName(Fields.ExamDate.toString());
				errors.setErrorMessage("Exam Date is mandatory field");
				errorsList.add(errors);
			}
			if(result.getStatus() == null && operation.equalsIgnoreCase("insert")) {
				errors .setFieldName(Fields.Status.toString());
				errors.setErrorMessage("Result Status is mandatory field");
				errorsList.add(errors);
			}
			if(result.getType() == null) {
				errors .setFieldName(Fields.ResultType.toString());
				errors.setErrorMessage("Result type is mandatory field");
				errorsList.add(errors);
			}
			if(StringUtils.isEmpty(result.getClassStandard())) {
				errors .setFieldName(Fields.Class.toString());
				errors.setErrorMessage("Class is mandatory field");
				errorsList.add(errors);
			}
		}
		return response;
	}
	
	public ProfileResponse validateSubjects(SubjectAssignationRequest request) {
		ProfileResponse response = new ProfileResponse();
		List<GenericErrors> errorsList = new ArrayList<GenericErrors>();
		GenericErrors errors = new GenericErrors();
		if(request != null) {
			if(request.getEnrollmentId() == null) {
				errors .setFieldName(Fields.EnrollmentId.toString());
				errors.setErrorMessage("Invalid Enrollment Id");
				errorsList.add(errors);
			}
			if(StringUtils.isEmpty(request.getSubjectCode())) {
				errors .setFieldName(Fields.SubjectCode.toString());
				errors.setErrorMessage("Subject Code cannot be empty");
				errorsList.add(errors);
			}
		}
		return response;
	}
}
