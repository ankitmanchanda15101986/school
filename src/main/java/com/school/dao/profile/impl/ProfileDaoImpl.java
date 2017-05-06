package com.school.dao.profile.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.school.dao.profile.ProfileDao;
import com.school.dao.profile.crud.ParentProfileOperationCrudRepository;
import com.school.model.profile.StudentProfile;

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

	@Override
	public List<StudentProfile> createNewRecord(StudentProfile profile)  throws Exception{
		List<StudentProfile> list = new ArrayList<StudentProfile>();
		StudentProfile result = profileRepository.save(profile);
		list.add(result);
		return list;
	}

	@Override
	public List<StudentProfile> updateExistingRecord(StudentProfile profile)  throws Exception{
		List<StudentProfile> list = new ArrayList<StudentProfile>();
		StudentProfile result = profileRepository.save(profile);
		list.add(result);
		return list;

	}

	@Override
	public List<StudentProfile> viewRecord(Integer enrollmentId, String userName) throws Exception {
		List<StudentProfile> result = new ArrayList<>();
		if (enrollmentId != null && !StringUtils.isEmpty(userName)) {
			result = profileRepository.retrieveStudentProfiles(enrollmentId, userName);

		} else if (enrollmentId == null && !StringUtils.isEmpty(userName)) {
			result = profileRepository.retrieveStudentProfiles(userName);

		} else if (enrollmentId != null && StringUtils.isEmpty(userName)) {
			result = profileRepository.retrieveStudentProfiles(enrollmentId);

		}
		return result;
	}
}
