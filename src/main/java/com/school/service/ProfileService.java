package com.school.service;

import com.school.model.ProfileResponse;
import com.school.model.StudentProfile;

public interface ProfileService {

	public ProfileResponse createStudentProfile(StudentProfile profile);
	
	public ProfileResponse viewStudentProfile(Integer enrollmentId);
	
	public ProfileResponse updateStudentProfile(StudentProfile profile);
	
	public ProfileResponse deleteStudentProfile(Integer enrollmentId, boolean disableFlag);
	
	public ProfileResponse viewStudentProfile(String userName);

}
