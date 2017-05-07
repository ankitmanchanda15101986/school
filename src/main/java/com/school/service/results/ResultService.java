/**
 * 
 */
package com.school.service.results;

import java.util.Map;

import com.school.model.ProfileResponse;
import com.school.model.results.Result;
import com.school.model.results.ResultRequest;
import com.school.model.results.Subjects;

/**
 * @author Manchanda
 *
 */
public interface ResultService {
	public Map<Integer, Subjects> getAllSubjects();
	
	public ProfileResponse getStudentResult(Result result);
	
	public ProfileResponse insertOrUpdateStudentResult(ResultRequest result);
}
