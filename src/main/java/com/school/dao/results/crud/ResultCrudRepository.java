/**
 * 
 */
package com.school.dao.results.crud;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.school.model.results.Result;
import com.school.util.results.ExamType;
import com.school.util.results.ResultType;

/**
 * @author Manchanda
 *
 */
public interface ResultCrudRepository extends CrudRepository<Result, Integer> {

	@Query("from Result where ENROLLMENT_ID=:enrollmentId and EXAM_TYPE=:examType and TYPE=:resultType and STANDARD=:classStandard")
	public List<Result> getResult(@Param("enrollmentId") int enrollmentId, @Param("examType") String examType, 
			@Param("resultType") String resultType, @Param("classStandard") String classStandard);
}
