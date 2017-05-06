package com.school.service.profile.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.school.dao.profile.impl.ProfileDaoImpl;
import com.school.model.ProfileResponse;
import com.school.model.profile.StudentProfile;
import com.school.service.profile.ProfileService;
import com.school.util.profile.ProfileHelper;
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

	@Autowired
	private ProfileHelper helper;

	/**
	 * 
	 */
	@Override
	public ProfileResponse createStudentProfile(StudentProfile profile) {
		ProfileResponse response = validateProfile.validateCreateProfile(profile);
		List<StudentProfile> studentList = null;
		if (response != null && response.getErrors().size() == 0) {
			try {
				studentList = dao.createNewRecord(profile);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response = helper.convertResultToProfileResponseForStudent(studentList, "create");
		}
		return response;
	}

	/**
	 * 
	 */
	@Override
	public ProfileResponse viewStudentProfile(String userName, Integer enrollmentId) {
		ProfileResponse response = new ProfileResponse();
		List<StudentProfile> studentList = null;
		if (enrollmentId == null && StringUtils.isEmpty(userName)) {
			response.setCode("400");
			response.setMessage("Invalid Parameter username or enrollmentId is mandatory field");
		} else {
			try {
				if (enrollmentId != null && !StringUtils.isEmpty(userName)) {
					studentList = dao.viewRecord(enrollmentId, userName);
				} else if (enrollmentId == null && !StringUtils.isEmpty(userName)) {
					studentList = dao.viewRecord(null, userName);
				} else if (enrollmentId != null && StringUtils.isEmpty(userName)) {
					studentList = dao.viewRecord(enrollmentId, null);
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			response = helper.convertResultToProfileResponseForStudent(studentList, "view");
		}

		return response;
	}

	/**
	 * 
	 */
	@Override
	public ProfileResponse updateStudentProfile(StudentProfile profile) {
		ProfileResponse response = validateProfile.validateCreateProfile(profile);
		List<StudentProfile> studentList = null;
		if(response != null && response.getErrors().size() == 0) {
			try {
				studentList = dao.updateExistingRecord(profile);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			response = helper.convertResultToProfileResponseForStudent(studentList, "update");
		} 
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
