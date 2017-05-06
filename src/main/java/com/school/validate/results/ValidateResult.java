/**
 * 
 */
package com.school.validate.results;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.school.model.ProfileResponse;
import com.school.model.attendance.Attendance;
import com.school.model.results.Result;
import com.school.util.Fields;
import com.school.util.GenericErrors;

/**
 * @author Manchanda
 *
 */
@Component
public class ValidateResult {

	public ProfileResponse validate(Result result) {
		ProfileResponse response = new ProfileResponse();
		List<GenericErrors> errorsList = new ArrayList<GenericErrors>();
		GenericErrors errors = new GenericErrors();
		if(result != null) {
			if(result.getEnrollmentId() == null) {
				errors .setFieldName(Fields.EnrollmentId.toString());
				errors.setErrorMessage("Invalid Enrollment Id");
				errorsList.add(errors);
			}
			if(result.getExamType() == null) {
				errors .setFieldName(Fields.ExamType.toString());
				errors.setErrorMessage("Please select exam type");
				errorsList.add(errors);
			}
			if(result.getType() == null) {
				errors .setFieldName(Fields.ResultType.toString());
				errors.setErrorMessage("Please select result type");
				errorsList.add(errors);
			}
			if(StringUtils.isEmpty(result.getClassStandard())) {
				errors .setFieldName(Fields.Class.toString());
				errors.setErrorMessage("Please select class");
				errorsList.add(errors);
			}
		}
		return response;
	}
}
