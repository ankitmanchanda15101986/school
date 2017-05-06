/**
 * 
 */
package com.school.dao.profile;

import java.util.List;

import com.school.model.profile.StudentProfile;

/**
 * @author Manchanda
 *
 */
public interface ProfileDao {

	public List<StudentProfile> createNewRecord(StudentProfile profile)  throws Exception;
	
	public List<StudentProfile> viewRecord(Integer enrollmentId, String userName)  throws Exception;
		
	public List<StudentProfile> updateExistingRecord(StudentProfile profile)  throws Exception;
}
