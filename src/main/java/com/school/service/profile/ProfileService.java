package com.school.service.profile;

import com.school.model.ProfileResponse;
import com.school.model.profile.StudentProfile;

public interface ProfileService {

	public ProfileResponse createStudentProfile(StudentProfile profile);
	
	public ProfileResponse viewStudentProfile(Integer enrollmentId);
	
	public ProfileResponse updateStudentProfile(StudentProfile profile);
	
	public ProfileResponse deleteStudentProfile(Integer enrollmentId, boolean disableFlag);
	
	public ProfileResponse viewStudentProfile(String userName);

}
