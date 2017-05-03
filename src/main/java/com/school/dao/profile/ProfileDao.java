/**
 * 
 */
package com.school.dao.profile;

import com.school.model.ProfileResponse;
import com.school.model.profile.StudentProfile;

/**
 * @author Manchanda
 *
 */
public interface ProfileDao {

	public ProfileResponse createNewRecord(StudentProfile profile);
	
	public ProfileResponse viewRecord(Integer enrollmentId);
	
	public ProfileResponse viewRecord(String userName);
	
	public ProfileResponse updateExistingRecord(StudentProfile profile);
}
