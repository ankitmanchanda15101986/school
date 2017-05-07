/**
 * 
 */
package com.school.dao.results.crud;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.school.model.results.SubjectAssignationRequest;

/**
 * @author Manchanda
 *
 */
public interface SubjectAssignationCrudRepository extends CrudRepository<SubjectAssignationRequest, Integer> {

	@Query("from SubjectAssignationRequest where ENROLLMENT_ID=:enrollmentId")
	public SubjectAssignationRequest retrieveSubjects(@Param("enrollmentId") Integer enrollmentId);
	
}
