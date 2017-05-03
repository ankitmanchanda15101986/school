package com.school.service.profile.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.school.dao.profile.impl.ProfileDaoImpl;
import com.school.model.ProfileResponse;
import com.school.model.profile.StudentProfile;
import com.school.service.profile.ProfileService;
import com.school.validate.profile.ValidateProfile;

/**
 * 
 * @author Manchanda
 *
 */
@Service
public class ProfileServiceImpl implements ProfileService {
	
	@Autowired
	private ProfileDaoImpl dao;	
	
	@Autowired
	private ValidateProfile validateProfile;
	
	/**
	 * 
	 */
	@Override
	public ProfileResponse createStudentProfile(StudentProfile profile) {
		ProfileResponse validateResponse = validateProfile.validateCreateProfile(profile);
		if(validateResponse == null ) {
			return null;
		} else if(validateResponse != null && validateResponse.getErrors().size()>0) {
			return validateResponse;
		} 
		ProfileResponse response = dao.createNewRecord(profile);
		return response;
	}
	
	/**
	 * 
	 */
	@Override
	public ProfileResponse viewStudentProfile(Integer enrollmentId) {
		if(enrollmentId == null) {
			return null;
		}
		ProfileResponse response = dao.viewRecord(enrollmentId);
		return response;
	}
	
	/**
	 * 
	 */
	@Override
	public ProfileResponse viewStudentProfile(String userName) {
		if(StringUtils.isEmpty(userName)) {
			return null;
		}
		ProfileResponse response = dao.viewRecord(userName);
		return response;
	}

	
	/**
	 * 
	 */
	@Override
	public ProfileResponse updateStudentProfile(StudentProfile profile) {
		ProfileResponse validateResponse = validateProfile.validateCreateProfile(profile);
		if(validateResponse == null ) {
			return null;
		} else if(validateResponse != null && validateResponse.getErrors().size()>0) {
			return validateResponse;
		} 
		ProfileResponse response = dao.updateExistingRecord(profile);
		return response;
	}
	
	/**
	 * 
	 */
	@Override
	public ProfileResponse deleteStudentProfile(Integer enrollmentId, boolean disableFlag) {
		return null;
	}

	
}
