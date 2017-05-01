/**
 * 
 */
package com.school.util;

import java.util.List;

import org.springframework.stereotype.Component;

import com.school.model.ProfileResponse;
import com.school.model.StudentProfile;

/**
 * @author Manchanda
 *
 */
@Component
public class ProfileHelper {

	public ProfileResponse convertResultToProfileResponseForStudent(List<StudentProfile> resultData,
			String operationName) {
		ProfileResponse profileResponse = new ProfileResponse();
		if (!resultData.isEmpty() && resultData.size() > 0) {
			profileResponse.setStudentProfileList(resultData);
			profileResponse.setCode("200");
			if (operationName.equalsIgnoreCase("create")) {
				profileResponse.setMessage("Profile Created Successfully");
			} else if (operationName.equalsIgnoreCase("view")) {
				profileResponse.setMessage("Profile Retrieved Successfully");
			} else if (operationName.equalsIgnoreCase("update")) {
				profileResponse.setMessage("Profile Retrieved Successfully");
			}
			
		} else {
			profileResponse.setCode("400");
			if (operationName.equalsIgnoreCase("create")) {
				profileResponse.setMessage("Error While Creating Profile");
			} else if (operationName.equalsIgnoreCase("view")) {
				profileResponse.setMessage("Error Retrieving Profile");
			} else if (operationName.equalsIgnoreCase("update")) {
				profileResponse.setMessage("Error While Updating Profile");
			}
		}
		return profileResponse;
	}
}
