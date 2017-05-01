/**
 * 
 */
package com.school.dao.crud;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.school.model.StudentProfile;

/**
 * @author Manchanda
 *
 */
public interface ParentProfileOperationCrudRepository extends CrudRepository<StudentProfile, Integer> {

	@Query("from StudentProfile where ENROLLMENT_ID=:enrollmentId")
	public List<StudentProfile> retrieveStudentProfiles(@Param("enrollmentId") Integer enrollmentId);
	
	@Query("from StudentProfile where USER_NAME=:userName")
	public List<StudentProfile> retrieveStudentProfiles(@Param("userName") String userName);
}
