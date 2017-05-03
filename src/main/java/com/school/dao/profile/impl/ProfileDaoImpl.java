package com.school.dao.profile.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.school.dao.profile.ProfileDao;
import com.school.dao.profile.crud.ParentLoginOperationCrudRepository;
import com.school.dao.profile.crud.ParentProfileOperationCrudRepository;
import com.school.model.ProfileResponse;
import com.school.model.profile.StudentProfile;
import com.school.util.Helper;
import com.school.util.ResponseType;

/**
 * 
 * @author Manchanda
 *
 */
@Component
@Repository
public class ProfileDaoImpl implements ProfileDao {

	@Autowired
	private ParentProfileOperationCrudRepository profileRepository;
	
	@Autowired
	private ParentLoginOperationCrudRepository loginRepository;
	
	@Autowired
	private Helper helper;
	
	@Override
	public ProfileResponse createNewRecord(StudentProfile profile) {
		ProfileResponse response = new ProfileResponse();
		List<StudentProfile> list = new ArrayList<StudentProfile>();
		ResponseType type = null;
		try {
			 StudentProfile result = profileRepository.save(profile);
			 list.add(result);
			 type = ResponseType.SUCCESS;
		} catch (Exception e) {
			type = ResponseType.SUCCESS;
		}
		response = helper.convertResultToProfileResponseForStudent(list, "create");
		response.setType(type);
		return response;
		
	}
	
	@Override
	public ProfileResponse viewRecord(Integer enrollmentId) {
		ProfileResponse response = new ProfileResponse();
		List<StudentProfile> result = new ArrayList<>();
		ResponseType type = null;
		try {
			 result = profileRepository.retrieveStudentProfiles(enrollmentId);
			 if(!result.isEmpty() && result.size() > 0) {
				 type = ResponseType.SUCCESS;
			 } else {
				 type = ResponseType.ERROR;
			 }
			 
		} catch (Exception e) {
			 type = ResponseType.ERROR;
		}
		response = helper.convertResultToProfileResponseForStudent(result, "view");
		response.setType(type);
		return response;
	}
	
	@Override
	public ProfileResponse updateExistingRecord(StudentProfile profile) {
		ProfileResponse response = new ProfileResponse();
		List<StudentProfile> list = new ArrayList<StudentProfile>();
		ResponseType type = null;
		try {
			 StudentProfile result = profileRepository.save(profile);
			 list.add(result);
			 if(!list.isEmpty() && list.size() > 0) {
				 type = ResponseType.SUCCESS;
			 } else {
				 type = ResponseType.ERROR;
			 }
		} catch (Exception e) {
			type = ResponseType.ERROR;
		}
		response = helper.convertResultToProfileResponseForStudent(list, "update");
		response.setType(type);
		return response;
		
	}

	@Override
	public ProfileResponse viewRecord(String userName) {
		ProfileResponse response = new ProfileResponse();
		List<StudentProfile> result = new ArrayList<>();
		ResponseType type = null;
		try {
			 result = profileRepository.retrieveStudentProfiles(userName);
			 if(!result.isEmpty() && result.size() > 0) {
				 type = ResponseType.SUCCESS;
			 } else {
				 type = ResponseType.ERROR;
			 }
			 
		} catch (Exception e) {
			 type = ResponseType.ERROR;
		}
		response = helper.convertResultToProfileResponseForStudent(result, "view");
		response.setType(type);
		return response;
	}
}
